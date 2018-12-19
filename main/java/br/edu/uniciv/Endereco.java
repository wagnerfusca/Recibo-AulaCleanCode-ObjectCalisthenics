package br.edu.uniciv;

public class Endereco {

	private TipoLogradouro tipoLogradouro;
	
	private String logradouro;
	
	private Integer numero;
	
	private String complemento;
	
	private String bairro;
	
	private Cidade cidade;
	
	public Uf pegarOEstadoDaCidade() {
		return cidade.getUf();
	}

	public Cidade getCidade() {
		return cidade;
	}
	
	
	
}
