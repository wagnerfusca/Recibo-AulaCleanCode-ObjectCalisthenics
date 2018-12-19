package br.edu.uniciv;

public class Cliente {

	private String nome;
	
	private Endereco endereco;
	
	
	public void pegarUfDaCidade() {
		endereco.pegarOEstadoDaCidade();
	}
	
}
