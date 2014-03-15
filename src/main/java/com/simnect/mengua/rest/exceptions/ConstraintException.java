package com.simnect.mengua.rest.exceptions;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ConstraintException implements ExceptionMapper<ConstraintViolationException>{

  @Override
  public Response toResponse(ConstraintViolationException exception) {
    return Response.status(Status.BAD_REQUEST).entity(new MenguaErrorBean(exception.getMessage()))
        .type(MediaType.APPLICATION_JSON).build();
  }

}
