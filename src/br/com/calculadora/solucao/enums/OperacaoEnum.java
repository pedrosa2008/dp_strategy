package br.com.calculadora.solucao.enums;

import br.com.calculadora.solucao.strategy.Divisao;
import br.com.calculadora.solucao.strategy.Multiplicacao;
import br.com.calculadora.solucao.strategy.Soma;
import br.com.calculadora.solucao.strategy.Subtracao;
import br.com.calculadora.solucao.strategy.interfaces.Operacao;

public enum OperacaoEnum {
	
	SOMA("SOMA") {
		@Override
		public Operacao getInstance() {
			return new Soma();
		}
	},
	SUBTRACAO("SUBTRAÇÃO") {
		@Override
		public Operacao getInstance() {
			return new Subtracao();
		}
	},
	MULTIPLICACAO("MULTIPLICAÇÃO") {
		@Override
		public Operacao getInstance() {
			return new Multiplicacao();
		}
	},
	DIVISAO("DIVISÃO") {
		@Override
		public Operacao getInstance() {
			return new Divisao();
		}
	};
	
	/**
	 * Retorna a Instância do Strategy de acordo com o tipo de operação utilizado.
	 * 
	 * @return Instância do Strategy
	 */
	public abstract Operacao getInstance();
	
	private String descricao;

	private OperacaoEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
