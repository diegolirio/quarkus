package com.diegolirio.institution;

import java.util.List;
import java.util.Objects;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.bson.types.ObjectId;

@Path("/institutions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InstitutionRest {

    @Inject
    private InstitutionRepository institutionRepository;

    @GET
    public List<Institution> getAll(@QueryParam("name") String name) {
        if(Objects.isNull(name)) {
            return Institution.listAll();
        } else {
            // return Institution.findByName(name);
            return institutionRepository.findByName(name);
        }
    }

    @POST
    public void save(Institution institution) {
        institution.persist();
    }    

    @GET
    @Path("/{id}")
    public Institution getById(@PathParam("id") String id) {
        return Institution.findById(new ObjectId(id));
    }    

    @DELETE
    @Path("/{id}")
    public void deleteById(@PathParam("id") String id) {
        Institution.deleteById(new ObjectId(id));
    }   
    
    @GET
    @Path("/count")
    public long count() {
        return institutionRepository.count();
    }        
}