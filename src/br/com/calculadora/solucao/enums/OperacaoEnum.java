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
	SUBTRACAO("SUBTRA��O") {
		@Override
		public Operacao getInstance() {
			return new Subtracao();
		}
	},
	MULTIPLICACAO("MULTIPLICA��O") {
		@Override
		public Operacao getInstance() {
			return new Multiplicacao();
		}
	},
	DIVISAO("DIVIS�O") {
		@Override
		public Operacao getInstance() {
			return new Divisao();
		}
	};
	
	/**
	 * Retorna a Inst�ncia do Strategy de acordo com o tipo de opera��o utilizado.
	 * 
	 * @return Inst�ncia do Strategy
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
