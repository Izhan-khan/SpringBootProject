package com.innovento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="research_details")
public class ResearchDetails {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false, precision=10)
    private long id;
	@Column(name="reaseach_details")
	private String researchDetails;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getResearchDetails() {
		return researchDetails;
	}
	public void setResearchDetails(String researchDetails) {
		this.researchDetails = researchDetails;
	}
	
	
	
	
}
