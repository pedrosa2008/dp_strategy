package br.com.calculadora.solucao.strategy.interfaces;

import java.math.BigDecimal;

public interface Operacao {
	
	/**
	 * Realiza o cálculo de acordo com os valores recebidos
	 * 
	 * @param valor_1
	 * @param valor_2
	 * 
	 * @return resultado da operação
	 */
	BigDecimal calcular(BigDecimal valor_1, BigDecimal valor_2);
}
