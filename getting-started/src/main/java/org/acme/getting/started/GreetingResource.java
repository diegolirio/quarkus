package org.acme.getting.started;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Customer hello() {
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID().toString());
        customer.setName(UUID.randomUUID().toString());
        return customer;
    }

    public static class Customer {
        private String id;
        private String name;
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}