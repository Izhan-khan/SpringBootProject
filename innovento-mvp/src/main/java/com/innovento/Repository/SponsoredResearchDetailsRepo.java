package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.SponsoredResearchDetails;

@Repository
public interface SponsoredResearchDetailsRepo extends JpaRepository<SponsoredResearchDetails, Long>{

}
