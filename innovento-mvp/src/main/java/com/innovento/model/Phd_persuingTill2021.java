package com.innovento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Student_persuing_phd_till_2020_21")
public class Phd_persuingTill2021 {

	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false, precision=10)
    private long id;
	@Column(name="programTimeId", precision=10)
    private String programTimeId;
    @Column(name="totalStudents_count", precision=10)
    public long totalStudentsCount;
    @Column(name="college_id", precision=10)
    private String collegeId;
    @Column(name="university_id", precision=10)
    private String universityId;
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getProgramTimeId() {
		return programTimeId;
	}
	public void setProgramTimeId(String programTimeId) {
		this.programTimeId = programTimeId;
	}
	public long getTotalStudentsCount() {
		return totalStudentsCount;
	}
	public void setTotalStudentsCount(long totalStudentsCount) {
		this.totalStudentsCount = totalStudentsCount;
	}
	public String getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	public String getUniversityId() {
		return universityId;
	}
	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}
	@Override
	public String toString() {
		return "Phd_persuingTill2021 [id=" + id + ", programTimeId=" + programTimeId + ", totalStudentsCount="
				+ totalStudentsCount + "]";
	}
	
    
	
}
