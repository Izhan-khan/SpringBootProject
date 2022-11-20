package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.ProgramTime;

@Repository
public interface ProgramTimeRepo extends JpaRepository<ProgramTime, Long>{

}
