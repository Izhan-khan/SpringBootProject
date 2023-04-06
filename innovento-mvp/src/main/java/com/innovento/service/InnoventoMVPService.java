package com.innovento.service;

import java.util.List;

import com.innovento.model.AcademicYear;
import com.innovento.model.CapitalExpenditureAmount;
import com.innovento.model.CapitalExpenditureResources;
import com.innovento.model.CollegeMaster;
import com.innovento.model.ConsultingProjectDetails;
import com.innovento.model.OperationExpenditureAmount;
import com.innovento.model.OperationExpenditureResources;
import com.innovento.model.PG_2year;
import com.innovento.model.Personal_Info;
import com.innovento.model.Phd_graduated_student;
import com.innovento.model.Phd_persuingTill2021;
import com.innovento.model.ProgramMaster;
import com.innovento.model.ProgramTime;
import com.innovento.model.ResearchDetails;
import com.innovento.model.SactionIntakeMaster;
import com.innovento.model.SponsoredResearchDetails;
import com.innovento.model.TotalStudentStrength;
import com.innovento.model.UG_4year;
import com.innovento.model.UniversityMaster;

public interface InnoventoMVPService {

	public ProgramMaster getProgramFromId(long id);

	public List<ProgramMaster> getProgramList();

	public List<SactionIntakeMaster> getsactionApprovedList(String collegeId);

	public List<TotalStudentStrength> getTotalStudentList(String collegeId);

	public void addSactionApprovedList(List<SactionIntakeMaster> intakeMastersList);

	public void addTotalStudentList(List<TotalStudentStrength> totalStudentList);

	public List<Object> getSactionApprovedListWithProgram();

	public List<Object> getUniversityName();

	public List<Phd_graduated_student> getPhdGraduatedStudentsList(String collegeId);

	public void addPhdGraduatedStudentsList(List<Phd_graduated_student> phd_graduated_studentsList);

	public List<Phd_persuingTill2021> getPhdPersuingStudentsList(String collegeId);

	public void addPhdPersuingStudentsList(List<Phd_persuingTill2021> phd_persuingStudentsList);

	public ProgramTime getProgramTimeById(long id);

	public ResearchDetails getResearchDetailsById(long id);

	public List<SponsoredResearchDetails> getSponsoredResearchDetailsList(String collegeId);

	public void addSponsoredResearchDetailsList(List<SponsoredResearchDetails> sponsoredResearchDetails);

	public List<ConsultingProjectDetails> getConsultingProjectDetailsList(String collegeId);

	public void addConsultingProjectDetailsList(List<ConsultingProjectDetails> consultingProjectDetailsList);

	public CapitalExpenditureResources getCapitalExpenditureResourcesById(long id);
	
	public List<CapitalExpenditureAmount> getCapitalExpenditureAmountList(String collegeId);

	public OperationExpenditureResources getOperationExpenditureResourcesById(long id);
	
	public void addCapitalExpenditureAmountList(List<CapitalExpenditureAmount> capitalExpenditureAmountList);

	public List<OperationExpenditureAmount> getOperationExpenditureAmountList(String collegeId);

	public void addOperationExpenditureAmountList(List<OperationExpenditureAmount> operationExpenditureAmountsList);

	public AcademicYear getAcademicYearFromId(long id);
	
	public List<AcademicYear> getAcademicYearList();

	public List<UG_4year> getUG_4yearList(String collegeId);

	public void addUG_4yearList(List<UG_4year>ug_4yearsList);

	public List<PG_2year> getPG_2yearList(String collegeId);

	public void addPG_2yearList(List<PG_2year>pg_2yearList);
	
	public UniversityMaster getUniversityMasterById(long uId);

	public CollegeMaster getCollegeMasterById(long cId);
	
	public CollegeMaster getCollegeMasterByCollegeId(String collegeId);

	public List<Object> getCollegeNamesList(String university_id);

	public List<Object> getUniversityNamesList(String collegeId);
	
	public void addPersonal_Info(Personal_Info personal_Info);

	public List<Object> getIntakeByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String programId);

	public List<Object> getTotalStudentsByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String programId);

	public List<Object> getPhdPersuingByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String programTimeId);

	public List<Object> getPhdGraduatedByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String programTimeId);

	public List<Object> getSponsoredResearchByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String researchDetailsId);

	public List<Object> getConsultingProjectResearchByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String researchDetailsId);

	public List<Object> getUG_4_YearByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String academicYearId);

	public List<Object> getPG_2_YearByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String academicYearId);
	
	public List<Object> getCapitalExpenditureByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String financialResources);

	public List<Object> getOperationExpenditureByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute,String financialResources);
	
	
}
