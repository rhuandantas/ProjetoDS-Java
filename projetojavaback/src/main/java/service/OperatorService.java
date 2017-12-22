package service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.DAOFactory;
import model.Operator;

@Path("/service")
public class OperatorService {
	private DAOFactory dao;
	@GET
	@Path("/operator")
	@Produces(MediaType.APPLICATION_JSON)
	public Operator getOperator(Integer id) {
		Operator Operator = dao.getDAOOperator().pesquisarId(id);
		return Operator;
	}
	
	@POST
	@Path("/OperatorInsert")
	@Produces(MediaType.APPLICATION_JSON)
	public void saveOperatore(@PathParam("operator")Operator operator) {
		dao.getDAOOperator().inserir(operator);
		
	}
}
