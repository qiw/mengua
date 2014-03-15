package com.simnect.mengua.rest.exceptions;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.hibernate.ObjectNotFoundException;

@Provider
public class NotFoundException implements ExceptionMapper<ObjectNotFoundException>{

  @Override
  public Response toResponse(ObjectNotFoundException exception) {
    return Response.status(Status.BAD_REQUEST).entity(new MenguaErrorBean(exception.getMessage()))
        .type(MediaType.APPLICATION_JSON).build();
  }

}
