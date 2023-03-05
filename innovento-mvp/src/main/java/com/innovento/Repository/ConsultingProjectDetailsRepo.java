package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.ConsultingProjectDetails;

@Repository
public interface ConsultingProjectDetailsRepo extends JpaRepository<ConsultingProjectDetails, Long> {
	
	@Query(value = "SELECT r.reaseach_details,cp.2018_2019_count,cp.2019_2020_count,cp.2020_2021_count,c.college_name ,u.university_name\r\n"
			+ "FROM consulting_project_details cp , research_details r, university_master u ,college_master c\r\n"
			+ "where  cp.college_id=c.college_id AND cp.university_id= TRIM(LEADING ' ' FROM u.university_id )\r\n"
			+ "AND cp.university_id=:universityId AND cp.college_id=:collegeId AND cp.research_details_id=:researchDetailsId AND cp.research_details_id=r.id;", nativeQuery = true)
	public List<Object>  getConsultingProjectResearchByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("researchDetailsId") String researchDetailsId);


}
