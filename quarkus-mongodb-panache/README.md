# quarkus-mongodb-panache project


##### Create Application

```sh
mvn io.quarkus:quarkus-maven-plugin:1.9.0.Final:create \
    -DprojectGroupId=com.diegolirio \
    -DprojectArtifactId=quarkus-mongodb-panache \
    -DclassName="com.diegolirio.institution.InstitutionRest" \
    -Dpath="/institutions"
    -Dextensions="quarkus-resteasy,resteasy-jsonb,mongodb-panache,quarkus-arc,quarkus-smallrye-openapi"
```

Ref.:    
   
https://quarkus.io/guides/getting-started#bootstrapping-the-project   
   
https://quarkus.io/guides/mongodb-panache   
   


