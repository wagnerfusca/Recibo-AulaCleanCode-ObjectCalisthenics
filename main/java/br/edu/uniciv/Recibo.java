package br.edu.uniciv;

public class Recibo {

	private Integer numero;

	private Double valor;
	
	private Emitente emitente;
	
	private Cliente cliente;
	
	private ListagemDeServico listaDeServico;
	

	public String retornarValorPorExtenso(Double valor) {
		validarSeEhDivisivelPorMil(valor);
		
		validarSeEhDivisivelPorCem(valor);
		
		validarSeEhDivisivelPorDez(valor); 
		
		return "fim";
		
	}

	private void validarSeEhDivisivelPorDez(Double valor) {
		if (valor % 10 == 0) {
			return "valor divisivel por dez";
		}
	}

	private void validarSeEhDivisivelPorCem(Double valor) {
		if (valor % 100 == 0) {
			return "valor divisivel por cem";
		}
	}

	private void validarSeEhDivisivelPorMil(Double valor) {
		if (valor % 1000 == 0) {
			return "valor divisivel por mil";
		}
	}
}
