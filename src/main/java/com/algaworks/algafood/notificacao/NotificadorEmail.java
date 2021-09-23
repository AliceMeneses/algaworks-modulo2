package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.modelo.Cliente;

//@Component
public class NotificadorEmail implements Notificador {
	
	private Boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(Boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
