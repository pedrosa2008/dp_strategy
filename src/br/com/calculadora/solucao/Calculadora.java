package br.com.calculadora.solucao;

import java.math.BigDecimal;

import br.com.calculadora.solucao.enums.OperacaoEnum;
import br.com.calculadora.solucao.strategy.interfaces.Operacao;

public class Calculadora {
	
	private static String MENSAGEM = "O resultado da %s de %s com %s é: %s";
	
	private OperacaoEnum operacaoEnum;

	public Calculadora(OperacaoEnum operacaoEnum) {
		this.operacaoEnum = operacaoEnum;
	}

	public void calcular(BigDecimal valor_1, BigDecimal valor_2) {
		Operacao instancia = operacaoEnum.getInstance();
		
		BigDecimal resultado = instancia.calcular(valor_1, valor_2);
		
		System.out.println(String.format(MENSAGEM, this.operacaoEnum.getDescricao(), valor_1, valor_2, resultado));
	}

	public void setOperacao(OperacaoEnum operacaoEnum) {
		this.operacaoEnum = operacaoEnum;
	}
}
