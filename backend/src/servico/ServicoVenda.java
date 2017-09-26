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

import modelo.Venda;



@Path("/vendas")
public class ServicoVenda {
	private static ArrayList<Venda> vendas = new ArrayList<>();
	
	static {
		vendas.add(new Venda(0, 10.0, 20.0, 19192017, false));
	}

	@GET
	@Produces({"application/json"})
	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	@Path("{id}")
	@GET
	@Produces("application/json")
	public Response getVendas(@PathParam("id") int id) {
		for (Venda v: vendas) {
			if (v.getId() == id) {
				return Response.status(200).entity(v).type(MediaType.APPLICATION_JSON).build();
			}
		}
		return Response.status(200).entity("Não há usuario com este id").type(MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Consumes({ "application/json" })
	public Response inserir(Venda v) {
		if (v == null)
			return Response.status(404).entity("Usuario não informado").type(MediaType.TEXT_PLAIN).build();
		vendas.add(v);
		return Response.status(200).build();
	}

}

