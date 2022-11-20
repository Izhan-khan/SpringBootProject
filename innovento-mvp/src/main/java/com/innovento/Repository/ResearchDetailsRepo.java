package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.ResearchDetails;

@Repository
public interface ResearchDetailsRepo extends JpaRepository<ResearchDetails, Long>{

}
