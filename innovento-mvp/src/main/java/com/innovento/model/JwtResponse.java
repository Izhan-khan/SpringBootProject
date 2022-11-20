package com.innovento.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private String response;
	
	public JwtResponse(String jwttoken,String response) {
		this.jwttoken = jwttoken;
		this.response= response;
	}
	
	public String getResponseString() {
		return this.response;
	}	

	public String getToken() {
		return this.jwttoken;
	}
}