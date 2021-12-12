package svo.model;

import java.util.ArrayList;
import java.util.Date;

public class Eleicao {
	
	private Integer codigo;
	private Date ano;
	private String candidatoEleito;
	private String nome;
	private ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
	private double qtdVotos;
	
	public Eleicao(Integer codigo, Date ano, String candidatoEleito, String nome) {
		super();
		this.codigo = codigo;
		this.ano = ano;
		this.candidatoEleito = candidatoEleito;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public String getCandidatoEleito() {
		return candidatoEleito;
	}

	public void setCandidatoEleito(String candidatoEleito) {
		this.candidatoEleito = candidatoEleito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public double getQtdVotos() {
		return qtdVotos;
	}

	public void setQtdVotos(double qtdVotos) {
		this.qtdVotos = qtdVotos;
	}

	public void registrarVoto() {
		// Código em breve...
	};
	
	public void getResultado() {
		// Código em breve...
	};
	
}
