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


	@Query(value = "SELECT p.program_name,m.2015_16_count,m.2016_17_count,m.2017_18_count,m.2018_19_count,m.2019_20_count,m.2020_21_count, c.college_name ,u.university_name\r\n"
			+ "FROM saction_approved_intake_master m , program_master p,college_master c,\r\n"
			+ "university_master u where  m.college_id=c.college_id AND m.university_id= TRIM(LEADING ' ' FROM u.university_id )\r\n"
			+ "AND m.university_id=:universityId AND m.college_id =:collegeId \r\n"
			+ "AND m.program_id=:programId AND m.program_id=p.id;", nativeQuery = true)
	public List<Object>  getIntakeByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("programId") String programId);
	
}
