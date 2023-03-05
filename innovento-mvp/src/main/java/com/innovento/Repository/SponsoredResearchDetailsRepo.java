package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.SponsoredResearchDetails;

@Repository
public interface SponsoredResearchDetailsRepo extends JpaRepository<SponsoredResearchDetails, Long>{
	
	@Query(value = "SELECT r.reaseach_details,sp.2018_2019_count,sp.2019_2020_count,sp.2020_2021_count,c.college_name ,u.university_name\r\n"
			+ "FROM sponsored_research_details sp , research_details r, university_master u ,college_master c\r\n"
			+ "where  sp.college_id=c.college_id AND sp.university_id= TRIM(LEADING ' ' FROM u.university_id )\r\n"
			+ "AND sp.university_id=:universityId AND sp.college_id=:collegeId AND sp.research_details_id=:researchDetailsId AND sp.research_details_id=r.id;", nativeQuery = true)
	public List<Object>  getSponsoredResearchByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("researchDetailsId") String researchDetailsId);
	


}
