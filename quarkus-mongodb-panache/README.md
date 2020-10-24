# quarkus-mongodb-panache project
Ref.: 


Create Application

```sh
mvn io.quarkus:quarkus-maven-plugin:1.9.0.Final:create \
    -DprojectGroupId=com.diegolirio \
    -DprojectArtifactId=quarkus-mongodb-panache \
    -DclassName="com.diegolirio.institution.InstitutionRest" \
    -Dpath="/institutions"
    -Dextensions="quarkus-resteasy,resteasy-jsonb,mongodb-panache,quarkus-arc,quarkus-smallrye-openapi"
```

