package com.itsdev.sicog.barrera.controllers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsdev.sicog.barrera.models.Barrera;
import com.itsdev.sicog.barrera.models.Usuario;
import com.itsdev.sicog.barrera.services.BarreraService;

@RestController
@RequestMapping("/api/abrirBarrera")
public class BarreraController {

	@Autowired
	BarreraService service;
	
	@GetMapping( path = "{id}")
	public String abrirBarrera(@PathVariable("id") String id){
		
		String rsp = "";
		String url = "";
		String estado = "";
		String status = "";
		switch (id) {
			case "1":  url  = "http://10.20.99.183/rc.cgi?o=104,10"; break;
			case "2":  url  = "http://10.20.99.184/rc.cgi?o=104,10"; break;
			case "3":  url  = "http://10.20.99.185/rc.cgi?o=104,10"; break;
			case "4":  url  = "http://10.20.99.186/rc.cgi?o=104,10"; break;	
			case "5":  url  = "http://10.20.99.183/rc.cgi?o=1,0"; 	 break;
			case "6":  url  = "http://10.20.99.184/rc.cgi?o=1,0"; 	 break;
			case "7":  url  = "http://10.20.99.185/rc.cgi?o=1,0"; 	 break;
			case "8":  url  = "http://10.20.99.186/rc.cgi?o=1,0"; 	 break;
			case "9":  url  = "http://10.20.99.183/rc.cgi?o=1,0"; 	 break;
			case "10": url  = "http://10.20.99.184/rc.cgi?o=1,0"; 	 break;
			case "11": url  = "http://10.20.99.185/rc.cgi?o=1,0"; 	 break;
			case "12": url  = "http://10.20.99.186/rc.cgi?o=1,0"; 	 break;		
			default:   url  = "https://postman-echo.com/get"; 		 break;
		}
		
		try {
			
	
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder()
		  .GET()
		  .uri(new URI(url))
		  .build();

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		estado = "exito";
		status = "" +  response.statusCode();
		
		rsp =  "{ \"estado\" : \"éxito\" , \"url\" : \""+ url +"\" , \"status\" : \"" + response.statusCode() + "\"   }";
		
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			estado = "fallo";
			status = "" +  e.getMessage();
			rsp = "{ \"estado\" : \"fallo\" ,  \"url\" : \""+ url +"\" , \"status\" : \"" + e.getMessage() + "\"   }";
		}
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		Date fecha = new Date();
		Barrera barrera = new Barrera();
		barrera.setEstado(estado);
		barrera.setStatus(status);
		barrera.setUrl(url);
		barrera.setTimestamp( sdf.format(fecha));
		service.guardar(barrera);
*/
		return rsp;
	}
	
	
	
	
	
}
