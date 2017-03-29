import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import br.grafos.classes.Aresta;
import br.grafos.classes.Grafo;
import br.grafos.classes.Matriz;
import br.grafos.classes.Vertice;

public class Testes {
	
	@Test
	public void verificaMatrizInicial(){
		Matriz matriz = new Matriz(3,8);
		
		Assert.assertTrue(matriz.getValue().size()==3);
		Assert.assertTrue(matriz.getValue().get(0).size()==8);
	}
	
	@Test
	public void testaImpressao(){
		int n=3,m=3;
		Matriz matriz = new Matriz(n,m);
		
		matriz.getValue().add(0, new ArrayList<>());
		matriz.getValue().get(0).add(1);
		matriz.getValue().get(0).add(0);
		matriz.getValue().get(0).add(0);
		
		matriz.getValue().add(1, new ArrayList<>());
		matriz.getValue().get(1).add(0);
		matriz.getValue().get(1).add(1);
		matriz.getValue().get(1).add(0);
		
		matriz.getValue().add(2, new ArrayList<>());
		matriz.getValue().get(2).add(0);
		matriz.getValue().get(2).add(0);
		matriz.getValue().get(2).add(1);
		
		matriz.imprime();
	}	

	@Test
	public void testaCargaInicialMatriz(){
		int n=5,m=10;
		Matriz matriz = new Matriz(n,m);
		
		for(int i=0; i < n; i++){
			matriz.getValue().add(i, new ArrayList<>());
			for(int j=0; j < m; j++){
				matriz.getValue().get(i).add(0);
			}
		}
		
		matriz.imprime();
	}
	
	@Test
	public void testaMontagemDaMatrizAdjacencia(){
		Grafo grafo = new Grafo();
		Matriz matriz;
		
		grafo.setArestas(new ArrayList<>());
		grafo.setVertices(new ArrayList<>());
		
		grafo.getVertices().add(new Vertice(1));
		grafo.getVertices().add(new Vertice(2));
		grafo.getVertices().add(new Vertice(3));
		//grafo.getVertices().add(new Vertice(4));
		
		grafo.getArestas().add(new Aresta(new Vertice(1), new Vertice(2)));
		grafo.getArestas().add(new Aresta(new Vertice(1), new Vertice(3)));
		//grafo.getArestas().add(new Aresta(new Vertice(2), new Vertice(4)));
		//grafo.getArestas().add(new Aresta(new Vertice(3), new Vertice(4)));
		
		int size = grafo.getVertices().size();
		matriz = new Matriz(size,size);
		
		for(Vertice vertice : grafo.getVertices()){
			for(Aresta aresta : grafo.getArestas()){
				if(aresta.getVerticeBase().getNumero() == vertice.getNumero()){
					matriz.getValue().get(vertice.getNumero() - 1).set(aresta.getVerticeAdjacente().getNumero() - 1, 1);
					matriz.getValue().get(aresta.getVerticeAdjacente().getNumero() - 1).set(vertice.getNumero() - 1, 1);
				}
			}
		}
		
		matriz.imprime();
	}

}
