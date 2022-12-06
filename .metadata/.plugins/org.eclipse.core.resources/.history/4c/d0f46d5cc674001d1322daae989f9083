package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovento.model.University;

@Repository
public interface UniversityRepo extends JpaRepository<University, Long>{
	
	public University findByName(String name);

	@Query(value = "SELECT u.id,u.name FROM university u", nativeQuery = true)
	public List<Object>  getUniversityNamesList();

}
