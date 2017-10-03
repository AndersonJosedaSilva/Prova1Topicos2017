package prova1topicos2017;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


	@Path("/fibcalc")   
	public interface fibcalcService {
		
		@GET
		@Path("/Fib")
		@Produces(MediaType.APPLICATION_JSON)
		Result fib(@QueryParam("Number") int lo, @QueryParam("fibonacci") int hi);
		
		

	}



