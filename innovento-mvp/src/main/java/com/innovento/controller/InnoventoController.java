package com.innovento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.innovento.model.AcademicYear;
import com.innovento.model.CapitalExpenditureAmount;
import com.innovento.model.CapitalExpenditureResources;
import com.innovento.model.CollegeMaster;
import com.innovento.model.ConsultingProjectDetails;
import com.innovento.model.OperationExpenditureAmount;
import com.innovento.model.OperationExpenditureResources;
import com.innovento.model.PG_2year;
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
import com.innovento.service.InnoventoMVPService;

@RestController
@CrossOrigin("*")
public class InnoventoController {

	@Autowired
	InnoventoMVPService innoventoMVPService;


	@GetMapping("/program/getNameFromId/{id}")
	public ProgramMaster getProgram(@PathVariable("id") long id) {
		return innoventoMVPService.getProgramFromId(id);
	}
	@GetMapping("/program/getList")
	public List<ProgramMaster> getProgramList() {
		return innoventoMVPService.getProgramList();
	}

	@GetMapping("/sactionApprovedIntake/getList/{collegeId}")
	public List<SactionIntakeMaster> getsactionApprovedList(@PathVariable("collegeId") String collegeId) {
		return innoventoMVPService.getsactionApprovedList(collegeId);
	}

	@PostMapping("/sactionApprovedIntake/addList")
	public void addSactionApprovedList(@RequestBody List<SactionIntakeMaster> intakeMastersList) {
		innoventoMVPService.addSactionApprovedList(intakeMastersList);
	}

	@GetMapping("/totalStudentStrength/getList/{collegeId}")
	public List<TotalStudentStrength> getTotalStudentList(@PathVariable("collegeId") String collegeId) {
		return innoventoMVPService.getTotalStudentList(collegeId);
	}

	@PostMapping("/totalStudentStrength/addList")
	public void addTotalStudentList(@RequestBody List<TotalStudentStrength> totalStudentList) {
		System.out.println(totalStudentList);
		innoventoMVPService.addTotalStudentList(totalStudentList);
	}

	@GetMapping("/programTime/getNameFromId/{id}")
	public ProgramTime getProgramTime(@PathVariable("id") long id) {
		return innoventoMVPService.getProgramTimeById(id);
	}
	
	@GetMapping("/phdPersuing/getList/{collegeId}")
	public List<Phd_persuingTill2021> getPhd_persuingStudentList(@PathVariable("collegeId") String collegeId){
		return innoventoMVPService.getPhdPersuingStudentsList(collegeId);
	}
	
	@PostMapping("/phdPersuing/addList")
	public void addPhdPersuingStudentList(@RequestBody List<Phd_persuingTill2021> Phd_persuingStudentList) {
		innoventoMVPService.addPhdPersuingStudentsList(Phd_persuingStudentList);
	}
	
	@GetMapping("/phdGraduated/getList/{collegeId}")
	public List<Phd_graduated_student> getPhdGraduated_studentsList(@PathVariable("collegeId") String collegeId){
		return innoventoMVPService.getPhdGraduatedStudentsList(collegeId);
	}
	
	@PostMapping("/phdGraduated/addList")
	public void addPhdGraduatedStudentsList(@RequestBody List<Phd_graduated_student> phd_graduatedStudentsList) {
		innoventoMVPService.addPhdGraduatedStudentsList(phd_graduatedStudentsList);
	}
	
	@GetMapping("/researchDetails/getNameFromId/{id}")
	public ResearchDetails getResearchDetails(@PathVariable("id") long id) {
		return innoventoMVPService.getResearchDetailsById(id);
	}
	
	@GetMapping("/sponsoredResearchDetails/getList/{collegeId}")
	public List<SponsoredResearchDetails> getSponsoredResearchDetailsList(@PathVariable("collegeId") String collegeId){
		return innoventoMVPService.getSponsoredResearchDetailsList(collegeId);
	}
	
	@PostMapping("/sponsoredResearchDetails/addList")
	public void addSponsoredResearchDetailsList(@RequestBody List<SponsoredResearchDetails> sponsoredResearchDetailsList ) {
		innoventoMVPService.addSponsoredResearchDetailsList(sponsoredResearchDetailsList);
	}
	
	@GetMapping("/consultingProjectDetails/getList/{collegeId}")
	public List<ConsultingProjectDetails> getConsultingProjectDetailsList(@PathVariable("collegeId") String collegeId){
		return innoventoMVPService.getConsultingProjectDetailsList(collegeId);
	}
	
	@PostMapping("/consultingProjectDetails/addList")
	public void addConsultingProjectDetailsList(@RequestBody List<ConsultingProjectDetails> consultingProjectDetailsList ) {
		innoventoMVPService.addConsultingProjectDetailsList(consultingProjectDetailsList);
	}
	
	
	@GetMapping("/capitalExpenditureRescources/{id}")
	public CapitalExpenditureResources getCapitalExpenditureRescources(@PathVariable("id") long id) {
		return innoventoMVPService.getCapitalExpenditureResourcesById(id);
	}
	
	@GetMapping("/operationExpenditureRescources/{id}")
	public OperationExpenditureResources getOperationExpenditureRescources(@PathVariable("id") long id) {
		return innoventoMVPService.getOperationExpenditureResourcesById(id);
	}
	
	@GetMapping("/capitalExpenditureAmount/getList/{collegeId}")
	public List<CapitalExpenditureAmount> getCapitalExpenditureAmountList(@PathVariable("collegeId") String collegeId){
		return innoventoMVPService.getCapitalExpenditureAmountList(collegeId);
	}
	
	@PostMapping("/capitalExpenditureAmount/addList")
	public void addCapitalExpenditureAmountList(@RequestBody List<CapitalExpenditureAmount> capitalExpenditureAmountsList ) {
		innoventoMVPService.addCapitalExpenditureAmountList(capitalExpenditureAmountsList);
	}
	
	@GetMapping("/operationExpenditureAmount/getList/{collegeId}")
	public List<OperationExpenditureAmount> getOperationExpenditureAmountList(@PathVariable("collegeId") String collegeId){
		return innoventoMVPService.getOperationExpenditureAmountList(collegeId);
	}
	
	@PostMapping("/operationExpenditureAmount/addList")
	public void addOperationExpenditureAmountList(@RequestBody List<OperationExpenditureAmount> operationExpenditureAmountsList ) {
		innoventoMVPService.addOperationExpenditureAmountList(operationExpenditureAmountsList);
	}
	
	@GetMapping("/academicYear/getNameFromId/{id}")
	public AcademicYear getAcademicYear(@PathVariable("id") long id) {
		return innoventoMVPService.getAcademicYearFromId(id);
	}
	@GetMapping("/academicYear/getList")
	public List<AcademicYear> getacademicYearList() {
		return innoventoMVPService.getAcademicYearList();
	}

	
	@GetMapping("/ug_4year/getList/{collegeId}")
	public List<UG_4year> getUG_4yearList(@PathVariable("collegeId") String collegeId){
		return innoventoMVPService.getUG_4yearList(collegeId);
	}
	
	@PostMapping("/ug_4year/addList")
	public void addUG_4yearList(@RequestBody List<UG_4year> uG_4yearList ) {
		innoventoMVPService.addUG_4yearList(uG_4yearList);
	}
	
	@GetMapping("/pg_2year/getList/{collegeId}")
	public List<PG_2year> getPG_2yearList(@PathVariable("collegeId") String collegeId){
		return innoventoMVPService.getPG_2yearList(collegeId);
	}
	
	@PostMapping("/pg_2year/addList")
	public void addPG_2yearList(@RequestBody List<PG_2year> pg_2yearList ) {
		innoventoMVPService.addPG_2yearList(pg_2yearList);
	}
	
//	Change this we want to get university details by universityId not by pk uid
	@GetMapping("/university/getUniversityById/{id}")
	public UniversityMaster getUniversityMaster(@PathVariable("id") long id){
		return innoventoMVPService.getUniversityMasterById(id);
	}
	
	@GetMapping("/getCollegeByCollegeId/{collegeId}")
	public CollegeMaster getCollegeMaster(@PathVariable("collegeId") String collegeId){
		return innoventoMVPService.getCollegeMasterByCollegeId(collegeId);
	}
	
	@GetMapping("/university/college/getList/{university_id}")
	public List<Object> getCollegeListWithName(@PathVariable("university_id") String university_id) {
		System.out.println(university_id.trim());
		return innoventoMVPService.getCollegeNamesList(university_id.trim());		
	}
	
	@GetMapping("/university/getList/{collegeId}")
	public List<Object> getUniversityNamesList(@PathVariable("collegeId") String collegeId) {
		return innoventoMVPService.getUniversityNamesList(collegeId.trim());		
	}
	
	@PostMapping("/university/compareColleges/intake")
	public List<Object> getIntakeByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "programId") String programId
			){
		
		return innoventoMVPService.getIntakeByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),programId.trim());
	
	}
	
	@PostMapping("/university/compareColleges/totalStudents")
	public List<Object> getTotalStudentsByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "programId") String programId
			){
					
		return innoventoMVPService.getTotalStudentsByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),programId.trim());
	
	}
	
	@PostMapping("/university/compareColleges/phdPersuing")
	public List<Object> getPhdPersuingByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "programTimeId") String programTimeId
			){
					
		return innoventoMVPService.getPhdPersuingByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),programTimeId.trim());
	
	}
	

	@PostMapping("/university/compareColleges/phdGraduated")
	public List<Object> getPhdGraduatedByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "programTimeId") String programTimeId
			){
				
		return innoventoMVPService.getPhdGraduatedByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),programTimeId.trim());
	
	}
	

	@PostMapping("/university/compareColleges/sponsoredResearch")
	public List<Object> getSponsoredResearchByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "researchDetailsId") String researchDetailsId
			){
			
		return innoventoMVPService.getSponsoredResearchByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),researchDetailsId.trim());
	
	}
	

	@PostMapping("/university/compareColleges/consultingProjectResearch")
	public List<Object> getConsultingProjectResearchByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "researchDetailsId") String researchDetailsId
			){
		
		return innoventoMVPService.getConsultingProjectResearchByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),researchDetailsId.trim());
	
	}
	
	@PostMapping("/university/compareColleges/ug")
	public List<Object> getUG_4_YearByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "academicYearId") String academicYearId
			){
			
		return innoventoMVPService.getUG_4_YearByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),academicYearId.trim());
	
	}
	

	@PostMapping("/university/compareColleges/pg")
	public List<Object> getPG_2_YearByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "academicYearId") String academicYearId
			){
		
		return innoventoMVPService.getPG_2_YearByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),academicYearId.trim());
	
	}
	
	
	@PostMapping("/university/finance/capitalExpenditure")
	public List<Object> getFinanceCapitalExpenditureByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "capitalExpenditureResourceId") String capitalExpenditureFinanceResources
			){
		
		return innoventoMVPService.getCapitalExpenditureByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),capitalExpenditureFinanceResources.trim());
	
	}

	@PostMapping("/university/finance/operationExpenditure")
	public List<Object> getFinanceOprationExpenditureByCollegeAndUniversity(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "operationExpenditureResourceId") String operationExpenditureFinanceResources
			){
		
		return innoventoMVPService.getOperationExpenditureByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),operationExpenditureFinanceResources.trim());
	
	}
	

	
	
}
