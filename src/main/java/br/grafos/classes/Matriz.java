package br.grafos.classes;

import java.util.ArrayList;
import java.util.List;

public class Matriz {
	private List<List<Integer>> value;
	
	public Matriz(int n, int m){
		value = new ArrayList<>();
		
		for(int i=0; i < n; i++){
			value.add(i, new ArrayList<>());
			for(int j=0; j < m; j++){
				value.get(i).add(0);
			}
		}
	}

	public List<List<Integer>> getValue() {
		return value;
	}
	
	public void imprime(){
		for(List<Integer> i : value){
			for(Integer val : i)
			System.out.print(val + " ");
			System.out.println(" ");
		}
	}
	
	@Override
	public String toString(){
		StringBuilder retorno = new StringBuilder();
		
		for(List<Integer> i : value){
			for(Integer val : i)
			retorno.append(val).append(" ");
			retorno.append("\n");
		}
		
		return retorno.toString();
	}
}
