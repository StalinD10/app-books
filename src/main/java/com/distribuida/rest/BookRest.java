package com.distribuida.rest;

import com.distribuida.db.Books;
import com.distribuida.services.BookService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@ApplicationScoped
@Path("/books")
public class BookRest {

    @Inject
    private BookService bookService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Books> findAll() {
        return bookService.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Books findById(@PathParam("id") Integer id) {
        return bookService.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Books books){
        bookService.save(books);
    }

    @DELETE
    @Path("/{id}")
    public void delete (@PathParam("id") Integer id){
        bookService.deleteByID(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update (Books books){
       bookService.update(books);
    }


}
