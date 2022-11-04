package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.ProgramMaster;

@Repository
public interface ProgramMasterRepo extends JpaRepository<ProgramMaster, Long> {
	

}
