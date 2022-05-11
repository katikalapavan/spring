package com.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

//import javax.servlet.Registration;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppService {
	RestTemplate template=new RestTemplate();
	public String callApp() {
		String response=template.exchange("http://localhost:8090/mainapp/loadusers",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
		return response;
	}
}
