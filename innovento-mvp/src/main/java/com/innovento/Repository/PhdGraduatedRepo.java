package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.Phd_graduated_student;

@Repository
public interface PhdGraduatedRepo extends JpaRepository<Phd_graduated_student, Long> {
	
	@Query(value = "SELECT p.program_time,sg.2018_2019_count,sg.2019_2020_count , sg.2020_2021_count, c.college_name ,u.university_name "
			+ "FROM student_graduated_phd sg , program_time p, university_master u ,college_master c "
			+ "where  sg.college_id=c.college_id AND sg.university_id= TRIM(LEADING ' ' FROM u.university_id ) "
			+ "AND sg.university_id=:universityId AND sg.college_id=:collegeId AND sg.program_time_id=:programTimeId AND sg.program_time_id=p.id;", nativeQuery = true)
	public List<Object>  getPhdGraduatedByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("programTimeId") String programTimeId);
	

}
