package com.diegolirio.institution;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class InstitutionRepository implements PanacheMongoRepository<Institution> {

    public List<Institution> findByName(String name){
        return find("name", name).list();
    }
    
}
