package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.UniversityCollegeRelation;

@Repository
public interface UniversityCollegeRelationRepo extends JpaRepository<UniversityCollegeRelation, Long> {

	@Query(value = "select cm.college_id,cm.college_name from college_master cm ,university_college_relation ucr where"
			+ " ucr.college_id = cm.college_id and ucr.university_id =:universityId  group by cm.college_name order by cm.college_name ", nativeQuery = true)
	public List<Object>  getCollegeNamesList(@Param("universityId") String universityId);
	
	
	@Query(value = "select um.university_id,um.university_name from university_master um ,university_college_relation ucr \r\n"
			+ "where  ucr.university_id = TRIM(LEADING ' ' FROM um.university_id ) and ucr.college_id=:collegeId group by um.university_name order by um.university_name;"
		, nativeQuery = true)
	public List<Object>  getUniversityNamesList(@Param("collegeId") String collegeId);
	


	
}
