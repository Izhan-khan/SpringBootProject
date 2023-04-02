package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.OperationExpenditureAmount;

@Repository
public interface OperationExpenditureAmountRepo extends JpaRepository<OperationExpenditureAmount, Long>{

	public List<OperationExpenditureAmount> findAllByCollegeId(String collegeId);
	
	@Query(value = "SELECT oer.name,oea._2018_2019_count,oea._2019_2020_count,oea._2020_2021_count,c.college_name ,u.university_name \r\n"
			+ "FROM capital_expenditure_amount oea , capital_expenditure_resources oer ,college_master c, university_master u \r\n"
			+ "where  oea.college_id=c.college_id AND oea.university_id= TRIM(LEADING ' ' FROM u.university_id ) \r\n"
			+ "AND oea.university_id=:universityId AND oea.college_id=:collegeId  AND oea.financial_resources=:financialResources AND oea.financial_resources= oer.id;", nativeQuery = true)
	public List<Object>  getOperationExpenditureByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("financialResources") String financialResources);
		
	
}
