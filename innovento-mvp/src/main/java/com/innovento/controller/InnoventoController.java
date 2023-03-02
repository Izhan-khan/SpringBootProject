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
import com.innovento.model.ConsultingProjectDetails;
import com.innovento.model.OperationExpenditureAmount;
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

	@GetMapping("/sactionApprovedIntake/getList")
	public List<SactionIntakeMaster> getsactionApprovedList() {
		return innoventoMVPService.getsactionApprovedList();
	}

	@PostMapping("/sactionApprovedIntake/addList")
	public void addSactionApprovedList(@RequestBody List<SactionIntakeMaster> intakeMastersList) {
		innoventoMVPService.addSactionApprovedList(intakeMastersList);
	}

	@GetMapping("/totalStudentStrength/getList")
	public List<TotalStudentStrength> getTotalStudentList() {
		return innoventoMVPService.getTotalStudentList();
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
	
	@GetMapping("/phdPersuing/getList")
	public List<Phd_persuingTill2021> getPhd_persuingStudentList(){
		return innoventoMVPService.getPhdPersuingStudentsList();
	}
	
	@PostMapping("/phdPersuing/addList")
	public void addPhdPersuingStudentList(@RequestBody List<Phd_persuingTill2021> Phd_persuingStudentList) {
		innoventoMVPService.addPhdPersuingStudentsList(Phd_persuingStudentList);
	}
	
	@GetMapping("/phdGraduated/getList")
	public List<Phd_graduated_student> getPhdGraduated_studentsList(){
		return innoventoMVPService.getPhdGraduatedStudentsList();
	}
	
	@PostMapping("/phdGraduated/addList")
	public void addPhdGraduatedStudentsList(@RequestBody List<Phd_graduated_student> phd_graduatedStudentsList) {
		innoventoMVPService.addPhdGraduatedStudentsList(phd_graduatedStudentsList);
	}
	
	@GetMapping("/researchDetails/getNameFromId/{id}")
	public ResearchDetails getResearchDetails(@PathVariable("id") long id) {
		return innoventoMVPService.getResearchDetailsById(id);
	}
	
	@GetMapping("/sponsoredResearchDetails/getList")
	public List<SponsoredResearchDetails> getSponsoredResearchDetailsList(){
		return innoventoMVPService.getSponsoredResearchDetailsList();
	}
	
	@PostMapping("/sponsoredResearchDetails/addList")
	public void addSponsoredResearchDetailsList(@RequestBody List<SponsoredResearchDetails> sponsoredResearchDetailsList ) {
		innoventoMVPService.addSponsoredResearchDetailsList(sponsoredResearchDetailsList);
	}
	
	@GetMapping("/consultingProjectDetails/getList")
	public List<ConsultingProjectDetails> getConsultingProjectDetailsList(){
		return innoventoMVPService.getConsultingProjectDetailsList();
	}
	
	@PostMapping("/consultingProjectDetails/addList")
	public void addConsultingProjectDetailsList(@RequestBody List<ConsultingProjectDetails> consultingProjectDetailsList ) {
		innoventoMVPService.addConsultingProjectDetailsList(consultingProjectDetailsList);
	}
	
	@GetMapping("/capitalExpenditureAmount/getList")
	public List<CapitalExpenditureAmount> getCapitalExpenditureAmountList(){
		return innoventoMVPService.getCapitalExpenditureAmountList();
	}
	
	@PostMapping("/capitalExpenditureAmount/addList")
	public void addCapitalExpenditureAmountList(@RequestBody List<CapitalExpenditureAmount> capitalExpenditureAmountsList ) {
		innoventoMVPService.addCapitalExpenditureAmountList(capitalExpenditureAmountsList);
	}
	
	@GetMapping("/operationExpenditureAmount/getList")
	public List<OperationExpenditureAmount> getOperationExpenditureAmountList(){
		return innoventoMVPService.getOperationExpenditureAmountList();
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

	
	@GetMapping("/ug_4year/getList")
	public List<UG_4year> getUG_4yearList(){
		return innoventoMVPService.getUG_4yearList();
	}
	
	@PostMapping("/ug_4year/addList")
	public void addUG_4yearList(@RequestBody List<UG_4year> uG_4yearList ) {
		innoventoMVPService.addUG_4yearList(uG_4yearList);
	}
	
	@GetMapping("/pg_2year/getList")
	public List<PG_2year> getPG_2yearList(){
		return innoventoMVPService.getPG_2yearList();
	}
	
	@PostMapping("/pg_2year/addList")
	public void addPG_2yearList(@RequestBody List<PG_2year> pg_2yearList ) {
		innoventoMVPService.addPG_2yearList(pg_2yearList);
	}
	
	@GetMapping("/university/getUniversityById/{id}")
	public UniversityMaster getUniversityMaster(@PathVariable("id") long id){
		return innoventoMVPService.getUniversityMasterById(id);
	}
	
	@PostMapping("/university/compareColleges/")
	public List<Object> getCollegesListOfList(
			@RequestParam(name = "loginUniversity") String loginUniversity,
			@RequestParam(name = "loginInstitute") String loginInstitute,
			@RequestParam(name = "comparingUniversity") String comparingUniversity,
			@RequestParam(name = "comparingInstitute") String comparingInstitute,
			@RequestParam(name = "programId") String programId
			){
		
		System.out.println(loginUniversity);
		System.out.println(loginInstitute);
		System.out.println(comparingUniversity);
		System.out.println(comparingInstitute);
		System.out.println(programId);
		
		return innoventoMVPService.getIntakeByCollegeAndUniversity(loginUniversity.trim(),loginInstitute.trim(),comparingUniversity.trim(),comparingInstitute.trim(),programId.trim());
	
	}
	
	@GetMapping("/university/college/getList/{university_id}")
	public List<Object> getCollegeListWithName(@PathVariable("university_id") String university_id) {
		System.out.println(university_id.trim());
		return innoventoMVPService.getCollegeName(university_id.trim());		
	}
	
}
