package com.itsdev.sicog.Sensores.controller;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Base64;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SensoresController {

	@RequestMapping("/api/sandbox")
	public JSONObject hello() {
		String resp = "";
		
		SensoresController api = new SensoresController();
		
		String token 	= api.getToken();
		String valores 	= api.getInfo(token);
	
		//JSONObject jsonObject = new JSONObject(valores);
		JSONObject json = new JSONObject();
		 
		try {
			JSONParser parser = new JSONParser();
			json = (JSONObject) parser.parse(valores);
			
		} catch (Exception e) {
			System.out.println("$Error");
		}
		
		return json;
	}

	
	
	
	public String getToken() {
		
		String rsp = "";
		String username = "sinter_api";
		String pwd = "@9onWb9ZpMtB%eRf5J%IssE6c@hdO!V1s*pxvhFA";
		String urlAuth = "https://www.gateway.insighthub.io/customer-api/v1/auth?username=sinter_api&password=%409onWb9ZpMtB%25eRf5J%25IssE6c%40hdO!V1s*pxvhFA";
		String url = "https://www.gateway.insighthub.io/documentation/customer-api/";
		String parkingSites = "https://www.gateway.insighthub.io/customer-api/v1/sites?vehicles=false";
		
		//urlAuth = urlAuth.replace("${user}", username);
		//urlAuth = urlAuth.replace("${pwd}", pwd);
		
		System.out.println("Url ----> "+ urlAuth);
		
		try {
			HttpClient client = HttpClient.newHttpClient();

			HttpRequest request = HttpRequest.newBuilder()
					  .GET()
					  .uri(new URI(urlAuth))
					  .build();
			
			
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			
			System.out.println(response.uri());
			
			System.out.println(response.body());
			
			
			JSONObject json = new JSONObject(response.body());
			String token = (String) json.get("token");
			System.out.println(token);

			rsp = token; 
		} catch (Exception e) {
			e.printStackTrace();
			rsp = e.getMessage();
		}

		return rsp;
	}
	
	
	
	public String getInfo(String token) {
		String rsp = "";
		String parkingSites = "https://www.gateway.insighthub.io/customer-api/v1/sites?vehicles=false";
		try {
			HttpClient client = HttpClient.newHttpClient();
			
			HttpRequest request = HttpRequest.newBuilder()
					  .GET()
					  .uri(new URI(parkingSites))
					  .header("CVT-Insight-Authentication", token)
					  .header("Accept","application/json")
					  .build();
			
			
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			
			System.out.println(response.uri());
			
			System.out.println(response.body());
			System.out.println(response.statusCode());
			
			String body = response.body();
			body = body.replace("[", "");
			body = body.replace("]", "");
			
			//JSONObject json = new JSONObject(body);
			//String otroId = (String) json.get("token");
			//System.out.println(token);
			
			rsp = response.body(); 
		} catch (Exception e) {
			e.printStackTrace();
			rsp = e.getMessage();
		}

		return rsp;
	}
}
