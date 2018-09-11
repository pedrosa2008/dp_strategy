package br.com.calculadora.problema;

import java.math.BigDecimal;

import br.com.calculadora.problema.enums.OperacaoEnum;

public class Calculadora {
	
	private static String MENSAGEM = "O resultado da %s de %s com %s é: %s";

	public void calcular(OperacaoEnum operacao, BigDecimal valor_1, BigDecimal valor_2) {
		BigDecimal resultado = BigDecimal.ZERO;
		
		if (OperacaoEnum.SOMA.equals(operacao)) {
			resultado = valor_1.add(valor_2);
		} else
			if (OperacaoEnum.SUBTRACAO.equals(operacao)) {
				resultado = valor_1.subtract(valor_2);
			} else
				if (OperacaoEnum.MULTIPLICACAO.equals(operacao)) {
					resultado = valor_1.multiply(valor_2);
				} else
					if (OperacaoEnum.DIVISAO.equals(operacao)) {
						resultado = valor_1.divide(valor_2);
					}
		
		System.out.println(String.format(MENSAGEM, operacao.getDescricao(), valor_1, valor_2, resultado));
	}
}
