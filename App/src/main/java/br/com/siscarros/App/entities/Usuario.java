package br.com.siscarros.App.entities;

public class Usuario {
	
	private Long id;
	private String login;
	private String senha;
	private boolean status;
	private Pessoa nome;
	
	
	public Pessoa getNome() {
		return nome;
	}
	public void setNome(Pessoa nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	 

}
