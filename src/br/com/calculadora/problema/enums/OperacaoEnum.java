package br.com.calculadora.problema.enums;

public enum OperacaoEnum {
	
	SOMA("SOMA"),
	SUBTRACAO("SUBTRA��O"),
	MULTIPLICACAO("MULTIPLICA��O"),
	DIVISAO("DIVIS�O");
	
	private String descricao;

	private OperacaoEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
