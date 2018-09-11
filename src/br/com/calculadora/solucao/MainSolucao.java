package br.com.calculadora.solucao;

import java.math.BigDecimal;

import br.com.calculadora.solucao.enums.OperacaoEnum;

public class MainSolucao {

	public static void main(String[] args) {
		System.out.println("###### Solução utilizando Design Pattern Strategy ######");
		
		BigDecimal valor_1 = new BigDecimal(20);
		BigDecimal valor_2 = new BigDecimal(5);
		
		// Realiza a SOMA
		Calculadora calculadora = new Calculadora(OperacaoEnum.SOMA);
		calculadora.calcular(valor_1, valor_2);
		
		// Realiza a SUBTRACAO
		calculadora.setOperacao(OperacaoEnum.SUBTRACAO);
		calculadora.calcular(valor_1, valor_2);
		
		// Realiza a MULTIPLICACAO
		calculadora.setOperacao(OperacaoEnum.MULTIPLICACAO);
		calculadora.calcular(valor_1, valor_2);
		
		// Realiza a DIVISAO
		calculadora.setOperacao(OperacaoEnum.DIVISAO);
		calculadora.calcular(valor_1, valor_2);
	}
}