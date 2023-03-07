package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.UG_4year;

@Repository
public interface UG_4yearRepo extends JpaRepository<UG_4year, Long>{
	
	@Query(value = "SELECT a.academic_year,ug.first_year_student_admitted_count,ug.first_year_student_intake_count,ug.lateral_entry_student_count,ug.median_salary_of_placed_student_count,\r\n"
			+ "ug.student_graduated_in_min_time_count,ug.student_placed_count,ug.student_selected_for_higer_studies_count,c.college_name ,u.university_name\r\n"
			+ "FROM ug_4_year ug , academic_year a, university_master u ,college_master c\r\n"
			+ "where  ug.college_id=c.college_id AND ug.university_id= TRIM(LEADING ' ' FROM u.university_id )\r\n"
			+ "AND ug.university_id=:universityId AND ug.college_id=:collegeId AND ug.academic_year_id=:academicYearId AND ug.academic_year_id=a.id;", nativeQuery = true)
	public List<Object>  getUG_4_YearByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("academicYearId") String academicYearId);
	

}
