package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.TotalStudentStrength;

@Repository
public interface TotalStudentRepo extends JpaRepository<TotalStudentStrength, Integer> {
	
	public TotalStudentStrength findByProgramId(int programs);

}
