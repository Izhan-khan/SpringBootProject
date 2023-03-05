package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.TotalStudentStrength;

@Repository
public interface TotalStudentRepo extends JpaRepository<TotalStudentStrength, Integer> {
	
	public TotalStudentStrength findByProgramId(int programs);

	
	@Query(value = "SELECT p.program_name,t.no_of_male_students,t.no_of_female_students,t.total_students,t.within_state,t.outside_state,t.outside_country,t.economically_backward,t.socially_challenged,t.recieved_fee_state_and_central_government,\r\n"
			+ "t.recieved_fee_from_institutional_funds,t.recieved_fee_from_private_bodies,t.not_recieved_fee_reimbursement,c.college_name ,u.university_name\r\n"
			+ "FROM total_student_strength t , program_master p,college_master c, university_master u \r\n"
			+ "where  t.college_id=c.college_id AND t.university_id= TRIM(LEADING ' ' FROM u.university_id ) \r\n"
			+ "AND t.university_id=:universityId AND t.college_id=:collegeId AND t.program_id=:programId AND t.program_id=p.id;", nativeQuery = true)
	public List<Object>  getTotalStudentByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("programId") String programId);
	


}
