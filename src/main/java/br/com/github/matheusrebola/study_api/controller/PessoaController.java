package br.com.github.matheusrebola.study_api.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.github.matheusrebola.study_api.model.Pessoa;
import br.com.github.matheusrebola.study_api.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	private PessoaService pessoaService = new PessoaService();
	
	@GetMapping
	public List<Pessoa> listAll(){
		return pessoaService.list();
	}
}
