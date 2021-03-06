package br.edu.utfpr.pb.aula1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.utfpr.pb.aula1.service.IExemploIOC;

@Controller
@RequestMapping("teste")
public class TesteController {

	@Autowired
	@Qualifier("exemplo1")
	private IExemploIOC exemplo1;
	
	@Autowired
	@Qualifier("exemplo2")
	private IExemploIOC exemplo2;
	
	@GetMapping(value = {""})
	@ResponseBody
	public String teste() {
		return exemplo1.getMensagem();
	}
	
}
