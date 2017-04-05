package br.grafos;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {
	private static HttpServer server;

	public static HttpServer inicializaServidor() {
	    ResourceConfig config = new ResourceConfig().packages("br.grafos.resources");
	    URI uri = URI.create("http://localhost:8080/");
	    server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
	    System.out.println("Servidor subiu!");
	    return server;
	}
	
	public static void main(String[] args) throws IOException {
		ResourceConfig config = new ResourceConfig().packages("br.grafos.resources");
		URI uri = URI.create("http://localhost:8080/");
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
		System.out.print("Servidor subiu!");
		System.in.read();
		server.stop();
	}
	
	public static void mataServidor(){
		server.stop();
		System.out.println("Servidor stoped!");
	}
}
