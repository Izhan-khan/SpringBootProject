package com.innovento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "personal_info")
public class Personal_Info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false, precision = 10)
	private long id;
	private String name;
	private String subjectArea;
	private String state;
	private String city;
	private String email;
	private String mobile;
	private String interest;
	private String interestDescription;
	private String researchTime;
	private String teachingTime;
	private String administrationTime;
	private String othersTime;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubjectArea() {
		return subjectArea;
	}
	public void setSubjectArea(String subjectArea) {
		this.subjectArea = subjectArea;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getInterestDescription() {
		return interestDescription;
	}
	public void setInterestDescription(String interestDescription) {
		this.interestDescription = interestDescription;
	}
	public String getResearchTime() {
		return researchTime;
	}
	public void setResearchTime(String researchTime) {
		this.researchTime = researchTime;
	}
	public String getTeachingTime() {
		return teachingTime;
	}
	public void setTeachingTime(String teachingTime) {
		this.teachingTime = teachingTime;
	}
	public String getAdministrationTime() {
		return administrationTime;
	}
	public void setAdministrationTime(String administrationTime) {
		this.administrationTime = administrationTime;
	}
	public String getOthersTime() {
		return othersTime;
	}
	public void setOthersTime(String othersTime) {
		this.othersTime = othersTime;
	}
	
	
	
	
}
