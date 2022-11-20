package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.UG_4year;

@Repository
public interface UG_4yearRepo extends JpaRepository<UG_4year, Long>{

}
