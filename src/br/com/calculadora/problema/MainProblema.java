package br.com.calculadora.problema;

import java.math.BigDecimal;

import br.com.calculadora.problema.enums.OperacaoEnum;

public class MainProblema {

	public static void main(String[] args) {
		System.out.println("###### Problema ######");
		
		Calculadora calc = new Calculadora();
		
		BigDecimal valor_1 = new BigDecimal(25);
		BigDecimal valor_2 = new BigDecimal(5);
		
		// Realiza a SOMA
		calc.calcular(OperacaoEnum.SOMA, valor_1, valor_2);
		
		// Realiza a SUBTRACAO
		calc.calcular(OperacaoEnum.SUBTRACAO, valor_1, valor_2);
		
		// Realiza a MULTIPLICACAO
		calc.calcular(OperacaoEnum.MULTIPLICACAO, valor_1, valor_2);
		
		// Realiza a DIVISAO
		calc.calcular(OperacaoEnum.DIVISAO, valor_1, valor_2);
	}
}