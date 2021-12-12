package svo.model;

import java.util.Date;

public class Partido {

	private String nome;
	private Integer numeroEleitoral;
	private Date fundacao;
	private Date registro;
	private String presidente;
	private String vicePresidente;
	private String sede;
	
	public Partido(String nome, Integer numeroEleitoral, Date fundacao, Date registro, String presidente) {
		super();
		this.nome = nome;
		this.numeroEleitoral = numeroEleitoral;
		this.fundacao = fundacao;
		this.registro = registro;
		this.presidente = presidente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroEleitoral() {
		return numeroEleitoral;
	}

	public void setNumeroEleitoral(Integer numeroEleitoral) {
		this.numeroEleitoral = numeroEleitoral;
	}

	public Date getFundacao() {
		return fundacao;
	}

	public void setFundacao(Date fundacao) {
		this.fundacao = fundacao;
	}

	public Date getRegistro() {
		return registro;
	}

	public void setRegistro(Date registro) {
		this.registro = registro;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public String getVicePresidente() {
		return vicePresidente;
	}

	public void setVicePresidente(String vicePresidente) {
		this.vicePresidente = vicePresidente;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}
	
	public void aceitarCandidato() {
		// Código em breve...
	};
}
