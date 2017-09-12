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

import modelo.Usuario;


@Path("/usuarios")
public class servicoUsuario {
	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	static {
		usuarios.add(new Usuario("Admin", "170f", "20"));
	}

	@GET
	@Produces({"application/json"})
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	@Path("{id}")
	@GET
	@Produces("application/json")
	public Response getPessoa(@PathParam("id") int id) {
		for (Usuario u: usuarios) {
			if (u.getId() == id) {
				return Response.status(200).entity(u).type(MediaType.APPLICATION_JSON).build();
			}
		}
		return Response.status(200).entity("Não há usuario com este id").type(MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Consumes({ "application/json" })
	public Response inserir(Usuario u) {
		if (u == null)
			return Response.status(404).entity("Usuario não informado").type(MediaType.TEXT_PLAIN).build();
		usuarios.add(u);
		return Response.status(200).build();
	}

}
