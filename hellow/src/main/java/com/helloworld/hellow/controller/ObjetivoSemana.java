package com.helloworld.hellow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")

public class ObjetivoSemana {
	@GetMapping
	public String objetivo() {
		return "Objetivo da semana:"
				+ "\nAprender os conceitos básicos de Spring.";
	}
}
