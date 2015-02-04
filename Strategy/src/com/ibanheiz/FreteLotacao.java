package com.ibanheiz;

public class FreteLotacao extends Frete {

	@Override
	public double calcular(String cepOrigem, String cepDestino, NotaFiscal notaFiscal) {
		// Encontra os endereços da viagem através dos ceps informados
		// Procura os valores na Tabela de Frete com o peso da Nota
		// Resultado fictício
		return 250.0;
	}

}
