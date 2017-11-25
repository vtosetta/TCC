package br.com.siscarros.App.entities;

public class Email {
	
	private Integer id;
	private String nomeEmail;
	private String tipoEmail;
	private DadosEmpresa dados;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeEmail() {
		return nomeEmail;
	}
	public void setNomeEmail(String nomeEmail) {
		this.nomeEmail = nomeEmail;
	}
	public String getTipoEmail() {
		return tipoEmail;
	}
	public void setTipoEmail(String tipoEmail) {
		this.tipoEmail = tipoEmail;
	}
	public DadosEmpresa getDados() {
		return dados;
	}
	public void setDados(DadosEmpresa dados) {
		this.dados = dados;
	}
	
	
}
