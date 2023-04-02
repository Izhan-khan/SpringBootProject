package com.innovento.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovento.model.CapitalExpenditureAmount;

@Repository
public interface CapitalExpenditureAmountRepo extends JpaRepository<CapitalExpenditureAmount, Long> {
	
	
	public List<CapitalExpenditureAmount> findAllByCollegeId(String collegeId);
	
	@Query(value = "SELECT cer.name,cea._2018_2019_count,cea._2019_2020_count,cea._2020_2021_count,c.college_name ,u.university_name \r\n"
			+ "	FROM capital_expenditure_amount cea , capital_expenditure_resources cer ,college_master c, university_master u \r\n"
			+ "	where  cea.college_id=c.college_id AND cea.university_id= TRIM(LEADING ' ' FROM u.university_id ) \r\n"
			+ "	AND cea.university_id=:universityId AND cea.college_id=:collegeId AND cea.financial_resources=:financialResources AND cea.financial_resources= cer.id;", nativeQuery = true)
	public List<Object>  getCapitalExpenditureByCollegeAndUniversity(@Param("universityId") String universityId,@Param("collegeId") String collegeId,@Param("financialResources") String financialResources);
		
	
}
