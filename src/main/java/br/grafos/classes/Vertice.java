package br.grafos.classes;

public class Vertice {
	private String descricao;
	private int numero;
	
	public Vertice(){
		super();
	}
	
	public Vertice(int numero){
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
