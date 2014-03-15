package com.simnect.mengua;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.servlet.ServletContainer;

public class MenguaServer {
	private static Logger LOG = Log.getLogger(MenguaServer.class);
	
	public static void main(String[] args) throws Exception {
		LOG.info("Server started at port 9999...");
		new ResourceConfig()
    // Now you can expect validation errors to be sent to the client.
    .property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true)
    // @ValidateOnExecution annotations on subclasses won't cause errors.
    .property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
		
		
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
