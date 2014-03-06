package com.simnect.mengua.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

import com.simnect.mengua.entities.User;

@Path("/user")
public class UserSvc {
	private static Logger LOG = Log.getLogger(UserSvc.class);
	 @GET
	 @Path("/{id}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public User getUser(@PathParam("id") long id) {
		 LOG.info("Got id " + id);
		 User u = new User(id);
		 return u;
	 }
}
