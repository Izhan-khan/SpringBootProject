package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovento.model.UniversityLogin;

@Repository
public interface UniversityLoginRepo extends JpaRepository<UniversityLogin, Long>{
	
	public UniversityLogin findByuId(long u_id);

	@Query(value = "SELECT u.u_id,u.university_name,u.university_id FROM university_master u;", nativeQuery = true)
	public List<Object>  getUniversityNamesList();

}
