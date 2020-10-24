package com.diegolirio.institution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder 
@MongoEntity(collection="institutions")
public class Institution extends PanacheMongoEntity {

    //private String id;
    private String name;

    public static List<Institution> findByName(String name){

        //return find("name", name).list();

        //Map<String, String> map = new HashMap<>();
        //map.put("name", name);
        //return find("{ 'name': :name }", map).list();

        return find("{ 'name': ?1 }", name).list();
    }

}