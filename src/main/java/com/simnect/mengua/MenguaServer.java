package com.simnect.mengua;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.servlet.ServletContainer;

public class MenguaServer extends AbstractHandler {
	private static Logger LOG = Log.getLogger(MenguaServer.class);
	
	public void handle(String target, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		response.getWriter().println("<h1>Hello World</h1>");
	}

	public static void main(String[] args) throws Exception {
		LOG.info("Server started at port 9999...");
		ServletHolder sh = new ServletHolder(ServletContainer.class);
		sh.setInitParameter(ServerProperties.PROVIDER_PACKAGES,
				"com.simnect.mengua.rest");

		Server server = new Server(9999);
		ServletContextHandler context = new ServletContextHandler(server, "/",
				ServletContextHandler.SESSIONS);
		context.addServlet(sh, "/*");
		server.start();
		server.join();
	}
}
