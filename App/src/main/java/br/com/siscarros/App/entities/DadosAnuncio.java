package br.com.siscarros.App.entities;

import java.util.Date;

public class DadosAnuncio {
	
	private Integer id;
	private String tituloAnuncio;
	private String descricaoAnuncio;
	private Date dataCadastro;
	private Date dataUpdate;
	private Date dataExpiracao;
	private Veiculo veiculo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTituloAnuncio() {
		return tituloAnuncio;
	}
	public void setTituloAnuncio(String tituloAnuncio) {
		this.tituloAnuncio = tituloAnuncio;
	}
	public String getDescricaoAnuncio() {
		return descricaoAnuncio;
	}
	public void setDescricaoAnuncio(String descricaoAnuncio) {
		this.descricaoAnuncio = descricaoAnuncio;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataUpdate() {
		return dataUpdate;
	}
	public void setDataUpdate(Date dataUpdate) {
		this.dataUpdate = dataUpdate;
	}
	public Date getDataExpiracao() {
		return dataExpiracao;
	}
	public void setDataExpiracao(Date dataExpedicao) {
		this.dataExpiracao = dataExpedicao;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
