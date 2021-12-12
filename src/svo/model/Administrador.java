package svo.model;

import java.util.Date;

public class Administrador extends Eleitor {

	public Administrador(String nomeCompleto, String CPF, String RG, char sexo, Date dataNascimento,
			String telefoneCelular, String email, String cidade, String estado, Integer tituloEleitoral) {
		super(nomeCompleto, CPF, RG, sexo, dataNascimento, telefoneCelular, email, cidade, estado, tituloEleitoral);
	}

	public Eleicao criarEleicao(Eleicao eleicao) {
		// Código em breve...
		return eleicao;
	}
	
	public void excluirEleicao(Eleicao Eleicao) {
		// Código em breve...
	}

	public void encerrarEleicao(Eleicao Eleicao) {
		// Código em breve...
	}
	
	public void monitorarEleicao(Eleicao Eleicao) {
		// Código em breve...
	}
	
	public Partido criarPartido(Partido partido) {
		// Código em breve...
		return partido;
	}

	public void excluirPartido(Partido partido) {
		// Código em breve...
	}
	
	public void atualizarPartido(Partido partido) {
		// Código em breve...	
	}
	
}
