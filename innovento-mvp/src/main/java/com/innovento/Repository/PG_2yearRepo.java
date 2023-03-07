package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.PG_2year;
@Repository
public interface PG_2yearRepo extends JpaRepository<PG_2year, Long> {



@Query(value = "SELECT a.academic_year,pg.first_year_student_admitted,pg.first_year_student_intake_count,pg.median_salary_of_placed_student_count,\r\n"
		+ "pg.student_graduated_in_min_time_count,pg.student_placed_count,pg.student_selected_for_higer_studies_count,c.college_name ,u.university_name\r\n"
		+ "FROM pg_2_year pg , academic_year a, university_master u ,college_master c\r\n"
		+ "where  pg.college_id=c.college_id AND pg.university_id= TRIM(LEADING ' ' FROM u.university_id )\r\n"
		+ "AND pg.university_id=:universityId AND pg.college_id=:collegeId AND pg.academic_year_id=:academicYearId AND pg.academic_year_id=a.id;\r\n", nativeQuery = true)
public List<Object>  getPG_2_YearByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("academicYearId") String academicYearId);


}
