package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.Phd_persuingTill2021;

@Repository
public interface PhdPersuingRepo extends JpaRepository<Phd_persuingTill2021, Long>{

}
