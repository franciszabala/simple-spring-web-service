package com.franciszabala.app;

import org.glassfish.jersey.server.ResourceConfig;

import com.franciszabala.resource.HelloWorldResource;
import com.franciszabala.resource.PersonResource;
import com.franciszabala.resource.SimpleWebResource;

/*Needed when accessing servlet pages*/
public class SimpleWebServiceResourceConfig extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public SimpleWebServiceResourceConfig () {

    	// register application resources
    	register(HelloWorldResource.class);
    	register(SimpleWebResource.class);
    	register(PersonResource.class);
    	
    }
}
