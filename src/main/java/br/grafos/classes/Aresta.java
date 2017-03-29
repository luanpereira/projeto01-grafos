package br.grafos.classes;

public class Aresta {
	private String descricao;
	private Vertice verticeBase;
	private Vertice verticeAdjacente;
	
	public Aresta(Vertice verticeBase, Vertice verticeAdjacente){
		this.verticeBase = verticeBase;
		this.verticeAdjacente = verticeAdjacente;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Vertice getVerticeBase() {
		return verticeBase;
	}
	public void setVerticeBase(Vertice verticeBase) {
		this.verticeBase = verticeBase;
	}
	public Vertice getVerticeAdjacente() {
		return verticeAdjacente;
	}
	public void setVerticeAdjacente(Vertice verticeAdjacente) {
		this.verticeAdjacente = verticeAdjacente;
	}
	
	
}
