package com.diegolirio.institution;

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


}