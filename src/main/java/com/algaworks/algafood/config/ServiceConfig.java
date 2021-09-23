package com.algaworks.algafood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
		
		return ativacaoClienteService;
	}
	
}
