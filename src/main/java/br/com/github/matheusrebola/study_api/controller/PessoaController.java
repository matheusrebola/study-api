package br.com.github.matheusrebola.study_api.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.github.matheusrebola.study_api.model.Pessoa;
import br.com.github.matheusrebola.study_api.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public List<Pessoa> listAll(){
		return pessoaService.list();
	}
	@PostMapping
	public Pessoa create(Pessoa pessoa){
		Pessoa result = pessoaService.save(pessoa);
		return result;
	}
	@PutMapping
	public Pessoa update(Pessoa pessoa){
		Pessoa result = pessoaService.save(pessoa);
		return result;
	}
	@DeleteMapping
	public void delete(Long id){
		
	}
}
