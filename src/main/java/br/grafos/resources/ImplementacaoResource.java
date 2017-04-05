package br.grafos.resources;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import br.grafos.classes.Grafo;
import br.grafos.negocio.Representacao;

@Path("grafos")
public class ImplementacaoResource {

	@Path("/matriz/adjacencia")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String gerarMatrizDeAdjacencia(String conteudo){
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Grafo>>(){}.getType();
		StringBuilder retorno = new StringBuilder();
		Representacao representacao = new Representacao();
		
		try {
			
			List<Grafo> grafos = gson.fromJson(conteudo, listType);
			
			for(Grafo grafo : grafos){
				representacao.setGrafo(grafo);
				retorno.append("Matriz de Adjacência: ").append(grafo.getDescricao()).append("\n")
					   .append(representacao.gerarMatrizDeAdjacencia().toString()).append("\n\n");
			}
			
			return retorno.toString();
			
		} catch (Exception ex) {
			System.out.println("Erro Aplicacao: " + ex.getMessage() + " >>> " + ex.getStackTrace());
		}

		return null;
	}
	
	@Path("/matriz/incidencia")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String gerarMatrizDeIncidencia(String conteudo){
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Grafo>>(){}.getType();
		StringBuilder retorno = new StringBuilder();
		Representacao representacao = new Representacao();
		
		try {
			
			List<Grafo> grafos = gson.fromJson(conteudo, listType);
			
			for(Grafo grafo : grafos){
				representacao.setGrafo(grafo);
				retorno.append("Matriz de Adjacência: ").append(grafo.getDescricao()).append("\n")
					   .append(representacao.gerarMatrizDeIncidencia().toString()).append("\n\n");
			}
			
			return retorno.toString();
			
		} catch (Exception ex) {
			System.out.println("Erro Aplicacao: " + ex.getMessage() + " >>> " + ex.getStackTrace());
		}

		return null;
	}	
}
