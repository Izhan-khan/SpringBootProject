package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.Phd_persuingTill2021;

@Repository
public interface PhdPersuingRepo extends JpaRepository<Phd_persuingTill2021, Long>{

	@Query(value = "SELECT p.program_time,sp.total_students_count,c.college_name ,u.university_name "
			+ "FROM student_persuing_phd_till_2020_21 sp , program_time p, university_master u ,college_master c "
			+ "where  sp.college_id=c.college_id AND sp.university_id= TRIM(LEADING ' ' FROM u.university_id ) "
			+ "AND sp.university_id=:universityId AND sp.college_id=:collegeId AND sp.program_time_id=:programTimeId AND sp.program_time_id=p.id;", nativeQuery = true)
	public List<Object>  getPhdPersuingByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("programTimeId") String programTimeId);
	
	
}
