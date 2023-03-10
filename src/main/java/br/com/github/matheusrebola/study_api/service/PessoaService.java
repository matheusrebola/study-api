package br.com.github.matheusrebola.study_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.github.matheusrebola.study_api.model.Pessoa;
import br.com.github.matheusrebola.study_api.repository.PessoaRepository;

public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	public List<Pessoa> list(){
		return pessoaRepository.findAll();
	}
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
}
