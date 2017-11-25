package br.com.siscarros.App.entities;

import java.util.List;

public class ModeloVeiculo {
	
	private Integer id;
	private String nomeModelo;
	private List<Versao> versoes;
	
	
	public List<Versao> getVersoes() {
		return versoes;
	}
	public void setVersoes(List<Versao> versoes) {
		this.versoes = versoes;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeModelo() {
		return nomeModelo;
	}
	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}
	
	
}
