package br.com.github.matheusrebola.study_api.model;

import javax.persistence.Column;
import javax.persistence.Id;

@Entity
public class Pessoa {
	@Id
	private Long id;
	@Column(name = "nome_completo")
	private String nome;
	private int idade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
