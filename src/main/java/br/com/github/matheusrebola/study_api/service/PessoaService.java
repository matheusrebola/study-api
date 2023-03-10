package br.com.github.matheusrebola.study_api.service;

import java.util.ArrayList;
import java.util.List;
import br.com.github.matheusrebola.study_api.model.Pessoa;

public class PessoaService {
	private List<Pessoa> pessoas;
	
	public PessoaService(){
		load();
	}
	
	private void load (){
		pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1L);
		pessoa.setNome("Matheus Cavalcanti Rebola");
		pessoas.add(pessoa);
		
		pessoa.setId(2L);
		pessoa.setNome("Matheus Carvalho");
		pessoas.add(pessoa);
		
		pessoa.setId(3L);
		pessoa.setNome("Carlos Henrique");
		pessoas.add(pessoa);
	}
	public List<Pessoa> list(){
		return pessoas;
	}
}
