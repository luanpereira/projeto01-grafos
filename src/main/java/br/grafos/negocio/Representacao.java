package br.grafos.negocio;

import br.grafos.classes.Grafo;
import br.grafos.classes.Matriz;
import br.grafos.classes.Vertice;

public class Representacao {
	
	private Grafo grafo;

	public Grafo getGrafo() {
		return grafo;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}
	
	public int[][] gerarMatrizDeIncidencia(){
		return null;
	}
	
	public int[][] gerarMatrizDeAdjacencia(){
		
		Matriz matriz = new Matriz(7,7);
		
		for(Vertice vertice : getGrafo().getVertices()){
			
			matriz.getValue();
			
		}
		
		
		return null;
	}	

}
