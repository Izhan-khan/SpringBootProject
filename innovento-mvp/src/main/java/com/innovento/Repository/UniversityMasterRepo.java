package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.UniversityMaster;

@Repository
public interface UniversityMasterRepo extends JpaRepository<UniversityMaster, Long> {
	
	public UniversityMaster findByuId(long uId);

}
