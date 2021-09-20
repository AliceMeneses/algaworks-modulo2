package com.algaworks.algafood.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuPrimeiroController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
