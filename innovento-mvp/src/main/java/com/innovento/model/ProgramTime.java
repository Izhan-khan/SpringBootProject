package com.innovento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ProgramTime")
public class ProgramTime {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false, precision=10)
    private long id;
	@Column(name="program_time")
	private String ProgramTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProgramTime() {
		return ProgramTime;
	}
	public void setProgramTime(String programTime) {
		ProgramTime = programTime;
	}
	
	
	
}
