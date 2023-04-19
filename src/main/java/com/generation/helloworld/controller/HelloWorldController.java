package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-word")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!! ";
	}
	
	@GetMapping("/bsm")
	public String bsmLista() {
		return "Mentalidade de Crescimento" + "Persistência" + "Responsabilidade Pessoal"
                + "Orientação ao Futuro" + "Comunicação" + "Orientação aos Detalhes" + "Proatividade"
                + "Trabalho em Equipe" + "Dar e Receber" + "Gestão do Tempo! ";
		
	}
	
	@GetMapping("/objetivos")
	public String meusObjetivos() {
		return "Objetivos da semana é: Comunicação, Trabalho em Equipe e Proatividade! ";
		
	}

}
