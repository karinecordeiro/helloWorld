package com.helloworld.hellow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")

public class Bsms {
	@GetMapping 
	public String bsms() {
		return "BSM's da Generation Brasil:"
				+ "\n\nIntrodução às Habilidades Comportamentais e Mentalidades"
				+ "\nMentalidade de Crescimento"
				+ "\nPersistência"
				+ "\nResponsabilidade Pessoal"
				+ "\nOrientação ao Futuro"
				+ "\nComunicação"
				+ "\nOrientação ao Detalhe"
				+ "\nProatividade"
				+ "\nTrabalho em Equipe"
				+ "\nDar e Receber"
				+ "\nEstudo de Caso 1: Força de Trabalho Distribuida"
				+ "\nEstudo de Caso 2: Estregável Urgente"
				+ "\nEstudo de Caso 3: Novas Habilidades Necessárias"
				+ "\nEstudo de Caso 4: Aprender e Compartilhar"
				+ "\nGestão de tempo"
				+ "\nIntrodução à VIA e a Descoberta das Forças de Caráter VIA"
				+ "\nMaximizar a Aprendizagem Online e o Trabalho Remoto";
}
}