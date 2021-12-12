package svo.model;

import java.util.Date;

public class Eleitor {

	private String nomeCompleto;
	private String CPF;
	private String RG;
	private char sexo;
	private Date dataNascimento;
	private String telefoneCelular;
	private String email;
	private String nomeMae;
	private String nomePai;
	private String cidade;
	private String estado;
	private Integer tituloEleitoral;
	
	public Eleitor(String nomeCompleto, String CPF, String RG, char sexo, Date dataNascimento, String telefoneCelular,
			String email, String cidade, String estado, Integer tituloEleitoral) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.CPF = CPF;
		this.RG = RG;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.telefoneCelular = telefoneCelular;
		this.email = email;
		this.cidade = cidade;
		this.estado = estado;
		this.tituloEleitoral = tituloEleitoral;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getTituloEleitoral() {
		return tituloEleitoral;
	}

	public void setTituloEleitoral(Integer tituloEleitoral) {
		this.tituloEleitoral = tituloEleitoral;
	}

	public void confirmarDados() {
		// Código em breve...
	};
	
	public void atualizarPerfil() {
		// Código em breve...
	};
	
	public void deletarPerfil() {
		// Código em breve...
	};
	
	public void registrar() {
		// Código em breve...
	};
	
}
