package br.com.siscarros.App.entities;

public class Telefone {
	
	private Integer id;
	private String numeroTelefone;
	private String tipoTelefone;
	private DadosEmpresa nomeFantasia;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public DadosEmpresa getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(DadosEmpresa nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	

}
