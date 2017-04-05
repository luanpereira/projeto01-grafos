import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.grafos.Servidor;
import br.grafos.classes.Aresta;
import br.grafos.classes.Grafo;
import br.grafos.classes.Vertice;
import junit.framework.Assert;

public class ServicoTest {
	@Before
	public void before() {
		Servidor.inicializaServidor();
	}

	@After
	public void mataServidor() {
		Servidor.mataServidor();
	}
	
	@Test
	public void testaServicoGrafo(){
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.register(new LoggingFilter());

		Client cliente = ClientBuilder.newClient(clientConfig);
		WebTarget target = cliente.target("http://localhost:8080");
		
		List<Grafo> lista = new ArrayList<>();
		Grafo grafo = new Grafo();
		
		grafo.setArestas(new ArrayList<>());
		grafo.setVertices(new ArrayList<>());
		
		grafo.getVertices().add(new Vertice(1));
		grafo.getVertices().add(new Vertice(2));
		grafo.getVertices().add(new Vertice(3));
		grafo.getVertices().add(new Vertice(4));
		grafo.getVertices().add(new Vertice(5));
		grafo.getVertices().add(new Vertice(6));
		
		grafo.getArestas().add(new Aresta(new Vertice(1), new Vertice(2)));
		grafo.getArestas().add(new Aresta(new Vertice(1), new Vertice(4)));
		grafo.getArestas().add(new Aresta(new Vertice(2), new Vertice(5)));
		grafo.getArestas().add(new Aresta(new Vertice(3), new Vertice(6)));
		grafo.getArestas().add(new Aresta(new Vertice(3), new Vertice(5)));
		grafo.getArestas().add(new Aresta(new Vertice(4), new Vertice(2)));
		grafo.getArestas().add(new Aresta(new Vertice(5), new Vertice(4)));
		grafo.getArestas().add(new Aresta(new Vertice(6), new Vertice(6)));
		
		grafo.setDirigido(true);
		
		lista.add(grafo);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Entity<String> entity = Entity.entity(gson.toJson(lista), MediaType.APPLICATION_JSON);

		try {

			String response = target.path("/grafos/").request().post(entity, String.class);

			Assert.assertNotNull(response);
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
