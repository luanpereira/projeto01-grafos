package br.grafos.classes;

import java.util.List;

public class Grafo {
	
	private List<Vertice> vertices;
	private List<Aresta> arestas;
	
	public Grafo(){
		super();
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
