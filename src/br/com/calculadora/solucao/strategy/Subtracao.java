package br.com.calculadora.solucao.strategy;

import java.math.BigDecimal;

import br.com.calculadora.solucao.strategy.interfaces.Operacao;

public class Subtracao implements Operacao {

	/*
	 * (non-Javadoc)
	 * @see br.com.calculadora.solucao.strategy.interfaces.Operacao#calcular(java.math.BigDecimal, java.math.BigDecimal)
	 */
	@Override
	public BigDecimal calcular(BigDecimal valor_1, BigDecimal valor_2) {
		return valor_1.subtract(valor_2);
	}
}