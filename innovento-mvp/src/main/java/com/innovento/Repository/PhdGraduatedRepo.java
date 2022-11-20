package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.Phd_graduated_student;

@Repository
public interface PhdGraduatedRepo extends JpaRepository<Phd_graduated_student, Long> {

}
