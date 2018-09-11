package br.com.calculadora.problema.enums;

public enum OperacaoEnum {
	
	SOMA("SOMA"),
	SUBTRACAO("SUBTRAÇÃO"),
	MULTIPLICACAO("MULTIPLICAÇÃO"),
	DIVISAO("DIVISÃO");
	
	private String descricao;

	private OperacaoEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
