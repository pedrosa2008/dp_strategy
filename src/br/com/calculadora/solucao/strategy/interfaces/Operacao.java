package br.com.calculadora.solucao.strategy.interfaces;

import java.math.BigDecimal;

public interface Operacao {
	
	/**
	 * Realiza o c�lculo de acordo com os valores recebidos
	 * 
	 * @param valor_1
	 * @param valor_2
	 * 
	 * @return resultado da opera��o
	 */
	BigDecimal calcular(BigDecimal valor_1, BigDecimal valor_2);
}
