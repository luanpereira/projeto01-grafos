package br.grafos.classes;

import java.util.List;

public class Grafo {
	
	private List<Vertice> vertices;
	private List<Aresta> arestas;
	private boolean dirigido;
	
	public Grafo(){
		super();
	}
	
	public boolean isDirigido() {
		return dirigido;
	}
	public void setDirigido(boolean dirigido) {
		this.dirigido = dirigido;
	}
	public Grafo(List<Vertice> vertices, List<Aresta> arestas) {
		this.vertices = vertices;
		this.arestas = arestas;
	}
	public List<Vertice> getVertices() {
		return vertices;
	}
	public void setVertices(List<Vertice> vertices) {
		this.vertices = vertices;
	}
	public List<Aresta> getArestas() {
		return arestas;
	}
	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}
	
}
