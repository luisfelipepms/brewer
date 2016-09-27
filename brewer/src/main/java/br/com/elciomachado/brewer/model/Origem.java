package br.com.elciomachado.brewer.model;

public enum Origem {
	
	NACIONAL("Nacional"),
	INTERNACIONAL("Internacion");
	
	private String descricao;
	
	Origem(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
}
