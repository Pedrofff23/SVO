package svo.model;

import java.util.Date;

public class Administrador extends Eleitor {

	public Administrador(String nomeCompleto, String CPF, String RG, char sexo, Date dataNascimento,
			String telefoneCelular, String email, String cidade, String estado, Integer tituloEleitoral) {
		super(nomeCompleto, CPF, RG, sexo, dataNascimento, telefoneCelular, email, cidade, estado, tituloEleitoral);
	}

	public Eleicao criarEleicao(Eleicao eleicao) {
		// C�digo em breve...
		return eleicao;
	}
	
	public void excluirEleicao(Eleicao Eleicao) {
		// C�digo em breve...
	}

	public void encerrarEleicao(Eleicao Eleicao) {
		// C�digo em breve...
	}
	
	public void monitorarEleicao(Eleicao Eleicao) {
		// C�digo em breve...
	}
	
	public Partido criarPartido(Partido partido) {
		// C�digo em breve...
		return partido;
	}

	public void excluirPartido(Partido partido) {
		// C�digo em breve...
	}
	
	public void atualizarPartido(Partido partido) {
		// C�digo em breve...	
	}
	
}
