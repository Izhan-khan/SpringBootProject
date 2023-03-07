package com.innovento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "pg_2_year")
public class PG_2year {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false, precision = 10)
	private long id;
	private long academicYearId;
	private long firstYearStudentIntakeCount;
	private long firstYearStudentAdmitted;
	private long studentGraduatedInMinTimeCount;
	private long studentPlacedCount;
	private long medianSalaryOfPlacedStudentCount;
	private long studentSelectedForHigerStudiesCount;
	@Column(name = "college_id", precision = 10)
	private String collegeId;
	@Column(name = "university_id", precision = 10)
	private String universityId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAcademicYearId() {
		return academicYearId;
	}

	public void setAcademicYearId(long academicYearId) {
		this.academicYearId = academicYearId;
	}

	public long getFirstYearStudentIntakeCount() {
		return firstYearStudentIntakeCount;
	}

	public void setFirstYearStudentIntakeCount(long firstYearStudentIntakeCount) {
		this.firstYearStudentIntakeCount = firstYearStudentIntakeCount;
	}

	public long getFirstYearStudentAdmitted() {
		return firstYearStudentAdmitted;
	}

	public void setFirstYearStudentAdmitted(long firstYearStudentAdmitted) {
		this.firstYearStudentAdmitted = firstYearStudentAdmitted;
	}

	public long getStudentGraduatedInMinTimeCount() {
		return studentGraduatedInMinTimeCount;
	}

	public void setStudentGraduatedInMinTimeCount(long studentGraduatedInMinTimeCount) {
		this.studentGraduatedInMinTimeCount = studentGraduatedInMinTimeCount;
	}

	public long getStudentPlacedCount() {
		return studentPlacedCount;
	}

	public void setStudentPlacedCount(long studentPlacedCount) {
		this.studentPlacedCount = studentPlacedCount;
	}

	public long getMedianSalaryOfPlacedStudentCount() {
		return medianSalaryOfPlacedStudentCount;
	}

	public void setMedianSalaryOfPlacedStudentCount(long medianSalaryOfPlacedStudentCount) {
		this.medianSalaryOfPlacedStudentCount = medianSalaryOfPlacedStudentCount;
	}

	public long getStudentSelectedForHigerStudiesCount() {
		return studentSelectedForHigerStudiesCount;
	}

	public void setStudentSelectedForHigerStudiesCount(long studentSelectedForHigerStudiesCount) {
		this.studentSelectedForHigerStudiesCount = studentSelectedForHigerStudiesCount;
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

}
