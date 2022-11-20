package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.PG_2year;
@Repository
public interface PG_2yearRepo extends JpaRepository<PG_2year, Long> {

}
