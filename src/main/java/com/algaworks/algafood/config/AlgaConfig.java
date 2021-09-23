package com.algaworks.algafood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.notificacao.NotificadorEmail;
import com.algaworks.algafood.service.AtivacaoClienteService;

@Configuration
public class AlgaConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificadorEmail = new NotificadorEmail("smpt.algamail.com.br");
		notificadorEmail.setCaixaAlta(true);
		
		return notificadorEmail;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificadorEmail());
		
		return ativacaoClienteService;
	}
	
}
