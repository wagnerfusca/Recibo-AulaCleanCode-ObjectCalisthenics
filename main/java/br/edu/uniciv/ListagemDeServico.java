package br.edu.uniciv;

import java.util.List;

public class ListagemDeServico {

	private List<String> listaServico;
	
	public void addListaServico(String parametro) {
		listaServico.add(parametro);
	}
	
	public List<String> getLista(){
		return listaServico;
	}
}
