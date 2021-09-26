package com.algaworks.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.event.ClienteAtivadoEvent;

@Component
public class EmisaoNotaFiscalService {

	@EventListener
	public void clienteAtivadoEvent(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para o cliente " + event.getCliente().getNome());
	}
	
}
