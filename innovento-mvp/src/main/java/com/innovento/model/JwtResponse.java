package com.innovento.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private JwtRequest jwtRequest;
	private University university;
	
	public JwtResponse(String jwttoken,JwtRequest jwtRequest) {
		this.jwttoken = jwttoken;
		this.jwtRequest= jwtRequest;
	}

	public JwtResponse(String jwttoken,University university) {
		this.jwttoken = jwttoken;
		this.university= university;
	}
	
	
	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public JwtRequest getJwtRequest() {
		return jwtRequest;
	}

	public void setJwtRequest(JwtRequest jwtRequest) {
		this.jwtRequest = jwtRequest;
	}

	public String getToken() {
		return this.jwttoken;
	}
}