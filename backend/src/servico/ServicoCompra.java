package servico;

import java.util.ArrayList;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import modelo.Compra;



@Path("/compras")
public class ServicoCompra{
	private static ArrayList<Compra> compras = new ArrayList<>();
	
	static {
		compras.add(new Compra("Petrobras", 0, 1000.0, 300.0, 10102017));
	}

	@GET
	@Produces({"application/json"})
	public ArrayList<Compra> getCompras()  {
		return compras;
	}

	@Path("{id}")
	@GET
	@Produces("application/json")
	public Response getCompras(@PathParam("id") int id) {
		for (Compra c: compras) {
			if (c.getId() == id) {
				return Response.status(200).entity(c).type(MediaType.APPLICATION_JSON).build();
			}
		}
		return Response.status(200).entity("Não há compra com este id").type(MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Consumes({ "application/json" })
	public Response inserir(Compra c) {
		if (c == null)
			return Response.status(404).entity("compra não informado").type(MediaType.TEXT_PLAIN).build();
		compras.add(c);
		return Response.status(200).build();
	}

}

