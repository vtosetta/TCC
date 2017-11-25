package br.com.siscarros.App.entities;

public class DadosVenda {
	
	private Integer id;
	private Double valor;
	private Boolean Troca;
	private Boolean Parcela;
	private DadosAnuncio dados;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Boolean getTroca() {
		return Troca;
	}
	public void setTroca(Boolean troca) {
		Troca = troca;
	}
	public Boolean getParcela() {
		return Parcela;
	}
	public void setParcela(Boolean parcela) {
		Parcela = parcela;
	}
	public DadosAnuncio getDados() {
		return dados;
	}
	public void setDados(DadosAnuncio dados) {
		this.dados = dados;
	}
	
	

}
