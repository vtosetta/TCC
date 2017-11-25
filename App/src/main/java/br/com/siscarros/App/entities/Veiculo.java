package br.com.siscarros.App.entities;

import java.util.Date;
import java.util.List;

public class Veiculo {
	
	private Integer id;
	private Date anoFabricacao;
	private Date anoModelo;
	private String combustivel;
	private Integer portas;
	private String cambio;
	private Double potencia;
	private Integer kilometragem;
	private CorVeiculo cor;
	private MarcaVeiculo marca;
	private ModeloVeiculo modelo;
	private Versao versao;
	private String descricao;
	private String placa;
	private Date dataCadastro;
	private Boolean visibilidadePlaca;
	private Pessoa pesoa;
	private Categoria categoria;
	private List<Caracteristica> caracteristicas;
	
	
	public ModeloVeiculo getModelo() {
		return modelo;
	}
	public void setModelo(ModeloVeiculo modelo) {
		this.modelo = modelo;
	}
	public List<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Date anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Date getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Date anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public Integer getPortas() {
		return portas;
	}
	public void setPortas(Integer portas) {
		this.portas = portas;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public Double getPotencia() {
		return potencia;
	}
	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}
	public Integer getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(Integer kilometragem) {
		this.kilometragem = kilometragem;
	}
	public CorVeiculo getCor() {
		return cor;
	}
	public void setCor(CorVeiculo cor) {
		this.cor = cor;
	}
	public MarcaVeiculo getMarca() {
		return marca;
	}
	public void setMarca(MarcaVeiculo marca) {
		this.marca = marca;
	}
	public Versao getVersao() {
		return versao;
	}
	public void setVersao(Versao versao) {
		this.versao = versao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Boolean getVisibilidadePlaca() {
		return visibilidadePlaca;
	}
	public void setVisibilidadePlaca(Boolean visibilidadePlaca) {
		this.visibilidadePlaca = visibilidadePlaca;
	}
	public Pessoa getPesoa() {
		return pesoa;
	}
	public void setPesoa(Pessoa pesoa) {
		this.pesoa = pesoa;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

}
