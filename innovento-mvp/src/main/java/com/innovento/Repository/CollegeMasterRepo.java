package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovento.model.CollegeMaster;

public interface CollegeMasterRepo extends JpaRepository<CollegeMaster, Long> {

	public CollegeMaster findBycId(long cId);
	
	public CollegeMaster findByCollegeId(String collegeId);
	
	
}
