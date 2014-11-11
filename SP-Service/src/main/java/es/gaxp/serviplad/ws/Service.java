package es.gaxp.serviplad.ws;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import es.gaxp.serviplad.dto.FacturaDTO;
import es.gaxp.serviplad.model.Cliente;


@Path("/clientrs")
public class Service {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ping() {
		return "Hey, This is Jersey JAX-RS !";
	}

	@GET
	@Path("/hellojson")
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente simplejson() {
		Cliente welcome = new Cliente();
		return welcome;
	}
	
	@POST
	@Path("/saveBill")
	@Produces(MediaType.APPLICATION_JSON)
	public int saveBill(@FormParam("bill_data") FacturaDTO factura) {
		return -1;
	}
	
}