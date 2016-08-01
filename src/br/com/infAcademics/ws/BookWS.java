package br.com.infAcademics.ws;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("book")
public class BookWS {

	
    @Context
    private UriInfo context;

    public BookWS() {
	}
    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getBook/{book}")
    public Book getBook(@PathParam("book") String book) {
    	Book toReturn = new Book();
    	toReturn.setBook(book);
    	toReturn.setAutor("Robson");
    	toReturn.setCountry("Brasil");
    	toReturn.setState("SC");
    	return toReturn;
    }
    
    
    /*
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("setCep")
    public void setCep(@Valid Book cep){
    	System.out.println("Objeto Cep Recebido! - " +cep);
    	System.out.println("Cep "+ cep.getCep());
    	System.out.println("Rua "+ cep.getRua());
    	System.out.println("Bairro "+ cep.getBairro());
    	System.out.println("Numero "+ cep.getNumero());
    	System.out.println("UF "+ cep.getUf());
    	
    }
    */
	
}
