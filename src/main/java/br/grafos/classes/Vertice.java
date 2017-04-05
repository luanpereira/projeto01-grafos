package br.grafos.classes;

public class Vertice {
	private String descricao;
	private int numero;
	private int grau;
	
	public Vertice(){
		super();
	}
	
	public int getGrau() {
		return grau;
	}
	public void setGrau(int grau) {
		this.grau = grau;
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
