package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.ConsultingProjectDetails;

@Repository
public interface ConsultingProjectDetailsRepo extends JpaRepository<ConsultingProjectDetails, Long> {

}
