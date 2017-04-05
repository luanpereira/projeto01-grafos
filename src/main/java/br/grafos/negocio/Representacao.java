package br.grafos.negocio;

import br.grafos.classes.Aresta;
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
	
	public Matriz gerarMatrizDeIncidencia(){
		int size = grafo.getVertices().size();
		Matriz matriz = new Matriz(size,size);
		
		for(Vertice vertice : grafo.getVertices()){
			for(Aresta aresta : grafo.getArestas()){
				if(aresta.getVerticeBase().getNumero() == vertice.getNumero()){
					matriz.getValue().get(vertice.getNumero() - 1).set(aresta.getVerticeAdjacente().getNumero() - 1, 1);
					
					if(!grafo.isDirigido())
					matriz.getValue().get(aresta.getVerticeAdjacente().getNumero() - 1).set(vertice.getNumero() - 1, 1);
				}
			}
		}
		
		return matriz;
	}
	
	public Matriz gerarMatrizDeAdjacencia(){
		
		int size = grafo.getVertices().size();
		Matriz matriz = new Matriz(size,size);
		
		for(Vertice vertice : grafo.getVertices()){
			for(Aresta aresta : grafo.getArestas()){
				if(aresta.getVerticeBase().getNumero() == vertice.getNumero()){
					matriz.getValue().get(vertice.getNumero() - 1).set(aresta.getVerticeAdjacente().getNumero() - 1, 1);
					
					if(!grafo.isDirigido())
					matriz.getValue().get(aresta.getVerticeAdjacente().getNumero() - 1).set(vertice.getNumero() - 1, 1);
				}
			}
		}
		
		return matriz;
	}	

}
