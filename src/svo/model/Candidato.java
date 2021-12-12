package svo.model;

import java.util.Date;

public class Candidato extends Eleitor {

	private String CNPJ;
	private String cargo;
	private String nacionalidade;
	private Integer numeroEleitoral;
	private String estado;
	private String grauInstrucao;
	private String ocupacao;
	
	public Candidato(String nomeCompleto, String CPF, String RG, char sexo, Date dataNascimento, String telefoneCelular,
			String email, String cidade, String estado, Integer tituloEleitoral, String CNPJ, String cargo,
			String nacionalidade, Integer numeroEleitoral, String estado2, String grauInstrucao, String ocupacao) {
		
		super(nomeCompleto, CPF, RG, sexo, dataNascimento, telefoneCelular, email, cidade, estado, tituloEleitoral);
		
		this.CNPJ = CNPJ;
		this.cargo = cargo;
		this.nacionalidade = nacionalidade;
		this.numeroEleitoral = numeroEleitoral;
		this.estado = estado;
		this.grauInstrucao = grauInstrucao;
		this.ocupacao = ocupacao;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Integer getNumeroEleitoral() {
		return numeroEleitoral;
	}

	public void setNumeroEleitoral(Integer numeroEleitoral) {
		this.numeroEleitoral = numeroEleitoral;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(String grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	
	public void escolherPartido() {
		// Código em breve...
	};
	
}
