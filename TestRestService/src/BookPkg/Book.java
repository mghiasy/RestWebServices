package BookPkg;
import javax.websocket.server.PathParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
//defines the URI for the web service =>u can access this class via domain/book
@Path("/book")
public class Book {
	//if req Type is XML first method and if it is JSON the second method will be executed
	
	
	@GET
	//produces sth to the client ===>for get
	@Produces(MediaType.TEXT_XML) //my response is going to be 'XML'====>can be XML, JSON  
	
	//when we want to take sth from client =>@Consumes ===> for put or post
	public String sayHello() {
		String res ="<?xml version='1.0'?>"+
	"<hello> Hello xml </hello>";
		return res;
	}
	
	@GET
	//produces sth to the client ===>for get
	@Produces(MediaType.TEXT_HTML) //my response is going to be 'JSON'====>can be XML, JSON  
	@Path("{name}")
	//when we want to take sth from client =>@Consumes ===> for put or post
	public String sayHelloJSON(@PathParam("name") String name) {
		String res ="<h1> Hello "+name+"</h1>";
		return res;
	}
}
