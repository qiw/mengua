package com.simnect.mengua.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

import com.simnect.mengua.entities.User;

@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserSvc {
	private static Logger LOG = Log.getLogger(UserSvc.class);

	@GET
	@Path("/{id}")
	public User getUser(@PathParam("id") long id) {
		LOG.info("Got id " + id);
		User u = new User();
		return u;
	}
	
	@POST
	public void createUser(User u) {
		LOG.info("post name" + u.getId() + "___");
	}
	
}
