package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.AcademicYear;

@Repository
public interface AcademicYearRepo extends JpaRepository<AcademicYear, Long>{

}
