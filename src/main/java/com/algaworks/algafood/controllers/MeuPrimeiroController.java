package com.algaworks.algafood.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;

@RestController
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;

	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	public String hello() {
		Cliente cliente = new Cliente("Alice", "alice@gmail.com", "8945618756");

		ativacaoClienteService.ativar(cliente);

		return "Hello";
	}

}
