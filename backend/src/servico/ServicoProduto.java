package servico;


	import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import modelo.Produto;



	@Path("produtos")
	public class servicoProduto {
		private static ArrayList<Produto> produtos = new ArrayList<>();
		
		static {
			produtos.add(new Produto("test", 10.2, 20.3, "Arschloch"));
		}

		@GET
		@Produces({"application/json"})
		public ArrayList<Produto> getProdutos() {
			return produtos;
		}

		@Path("{id}")
		@GET
		@Produces("application/json")
		public Response getProduto(@PathParam("id") int id) {
			for (Produto p: produtos) {
				if (p.getId() == id) {
					return Response.status(200).entity(p).type(MediaType.APPLICATION_JSON).build();
				}
			}
			return Response.status(200).entity("Não há produto com este id").type(MediaType.APPLICATION_JSON).build();
		}

		@POST
		@Consumes({ "application/json" })
		public Response inserirProduto(Produto p) {
			if (p == null)
				return Response.status(404).entity("Produto não informado").type(MediaType.TEXT_PLAIN).build();
			produtos.add(p);
			return Response.status(200).build();
		}

}
