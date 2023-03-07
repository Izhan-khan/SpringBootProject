package com.innovento.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.innovento.Repository.AcademicYearRepo;
import com.innovento.Repository.CapitalExpenditureAmountRepo;
import com.innovento.Repository.ConsultingProjectDetailsRepo;
import com.innovento.Repository.OperationExpenditureAmountRepo;
import com.innovento.Repository.PG_2yearRepo;
import com.innovento.Repository.PhdGraduatedRepo;
import com.innovento.Repository.PhdPersuingRepo;
import com.innovento.Repository.ProgramMasterRepo;
import com.innovento.Repository.ProgramTimeRepo;
import com.innovento.Repository.ResearchDetailsRepo;
import com.innovento.Repository.SactionIntakeRepo;
import com.innovento.Repository.SponsoredResearchDetailsRepo;
import com.innovento.Repository.TotalStudentRepo;
import com.innovento.Repository.UG_4yearRepo;
import com.innovento.Repository.UniversityCollegeRelationRepo;
import com.innovento.Repository.UniversityLoginRepo;
import com.innovento.Repository.UniversityMasterRepo;
import com.innovento.Repository.UserRepo;
import com.innovento.model.AcademicYear;
import com.innovento.model.CapitalExpenditureAmount;
import com.innovento.model.ConsultingProjectDetails;
import com.innovento.model.JwtRequest;
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
import com.innovento.model.UniversityLogin;
import com.innovento.model.UniversityMaster;

@Service
public class InnoventoMVPServiceImpl implements InnoventoMVPService, UserDetailsService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private ProgramMasterRepo programMasterRepo;

	@Autowired
	private UniversityLoginRepo universityLoginRepo;

	@Autowired
	private SactionIntakeRepo sactionIntakeRepo;

	@Autowired
	private TotalStudentRepo totalStudentRepo;

	@Autowired
	private PhdGraduatedRepo phdGraduatedRepo;

	@Autowired
	private PhdPersuingRepo phdPersuingRepo;

	@Autowired
	private ProgramTimeRepo programTimeRepo;

	@Autowired
	private ResearchDetailsRepo researchDetailsRepo;

	@Autowired
	private SponsoredResearchDetailsRepo sponsoredResearchDetailsRepo;

	@Autowired
	private ConsultingProjectDetailsRepo consultingProjectDetailsRepo;

	@Autowired
	private CapitalExpenditureAmountRepo capitalExpenditureAmountRepo;

	@Autowired
	private OperationExpenditureAmountRepo operationExpenditureAmountRepo;

	@Autowired
	private AcademicYearRepo academicYearRepo;

	@Autowired
	private UG_4yearRepo ug_4yearRepo;

	@Autowired
	private PG_2yearRepo pg_2yearRepo;
	
	@Autowired
	private UniversityMasterRepo universityMasterRepo;
	
	@Autowired
	private UniversityCollegeRelationRepo universityCollegeRelationRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		if (username.chars().allMatch(Character::isDigit)) {
			UniversityLogin university = universityLoginRepo.findByuId(Integer.parseInt(username));
			if (university != null && String.valueOf(university.getuId()).equals(username)) {
				return new User(String.valueOf(university.getuId()), university.getPassword(), new ArrayList<>());
			} else {
				throw new UsernameNotFoundException(username + " Not Found");
			}
		} else {
			JwtRequest jwtRequest = userRepo.findByUsername(username);
			if (jwtRequest != null && jwtRequest.getUsername().equals(username)) {
				return new User(jwtRequest.getUsername(), jwtRequest.getPassword(), new ArrayList<>());
			}else {
				throw new UsernameNotFoundException(username + " Not Found");
			}
		}

	}

	@Override
	public ProgramMaster getProgramFromId(long id) {
		return programMasterRepo.findById(id).get();
	}

	@Override
	public List<ProgramMaster> getProgramList() {
		return programMasterRepo.findAll();
	}

	@Override
	public List<SactionIntakeMaster> getsactionApprovedList() {
		return sactionIntakeRepo.findAll();
	}

	@Override
	public List<TotalStudentStrength> getTotalStudentList() {
		return totalStudentRepo.findAll();
	}

	@Override
	@Transactional
	public void addSactionApprovedList(List<SactionIntakeMaster> intakeMastersList) {
		sactionIntakeRepo.saveAll(intakeMastersList);
	}

	@Override
	@Transactional
	public void addTotalStudentList(List<TotalStudentStrength> totalStudentList) {
		totalStudentRepo.saveAll(totalStudentList);
	}

	@Override
	public List<Object> getSactionApprovedListWithProgram() {
		return sactionIntakeRepo.findSactionApprovedListWithPrograms();
	}

	@Override
	public List<Object> getUniversityName() {
		return universityLoginRepo.getUniversityNamesList();
	}

	@Override
	public List<Phd_graduated_student> getPhdGraduatedStudentsList() {
		return phdGraduatedRepo.findAll();
	}

	@Override
	public void addPhdGraduatedStudentsList(List<Phd_graduated_student> phd_graduated_studentsList) {
		phdGraduatedRepo.saveAll(phd_graduated_studentsList);
	}

	@Override
	public List<Phd_persuingTill2021> getPhdPersuingStudentsList() {
		return phdPersuingRepo.findAll();
	}

	@Override
	public void addPhdPersuingStudentsList(List<Phd_persuingTill2021> phd_persuingStudentsList) {
		phdPersuingRepo.saveAll(phd_persuingStudentsList);
	}

	@Override
	public ProgramTime getProgramTimeById(long id) {
		return programTimeRepo.findById(id).get();
	}

	@Override
	public ResearchDetails getResearchDetailsById(long id) {
		return researchDetailsRepo.findById(id).get();
	}

	@Override
	public List<SponsoredResearchDetails> getSponsoredResearchDetailsList() {
		return sponsoredResearchDetailsRepo.findAll();
	}

	@Override
	public void addSponsoredResearchDetailsList(List<SponsoredResearchDetails> sponsoredResearchDetails) {
		sponsoredResearchDetailsRepo.saveAll(sponsoredResearchDetails);
	}

	@Override
	public List<ConsultingProjectDetails> getConsultingProjectDetailsList() {
		return consultingProjectDetailsRepo.findAll();
	}

	@Override
	public void addConsultingProjectDetailsList(List<ConsultingProjectDetails> consultingProjectDetailsList) {
		consultingProjectDetailsRepo.saveAll(consultingProjectDetailsList);
	}

	@Override
	public List<CapitalExpenditureAmount> getCapitalExpenditureAmountList() {
		return capitalExpenditureAmountRepo.findAll();
	}

	@Override
	public void addCapitalExpenditureAmountList(List<CapitalExpenditureAmount> capitalExpenditureAmountList) {
		capitalExpenditureAmountRepo.saveAll(capitalExpenditureAmountList);
	}

	@Override
	public List<OperationExpenditureAmount> getOperationExpenditureAmountList() {
		return operationExpenditureAmountRepo.findAll();
	}

	@Override
	public void addOperationExpenditureAmountList(List<OperationExpenditureAmount> operationExpenditureAmountsList) {
		operationExpenditureAmountRepo.saveAll(operationExpenditureAmountsList);
	}

	@Override
	public AcademicYear getAcademicYearFromId(long id) {
		return academicYearRepo.findById(id).get();
	}

	@Override
	public List<AcademicYear> getAcademicYearList() {
		return academicYearRepo.findAll();
	}

	@Override
	public List<UG_4year> getUG_4yearList() {
		return ug_4yearRepo.findAll();
	}

	@Override
	public void addUG_4yearList(List<UG_4year> ug_4yearsList) {
		ug_4yearRepo.saveAll(ug_4yearsList);
	}

	@Override
	public List<PG_2year> getPG_2yearList() {
		return pg_2yearRepo.findAll();
	}

	@Override
	public void addPG_2yearList(List<PG_2year> pg_2yearList) {
		pg_2yearRepo.saveAll(pg_2yearList);
	}

	@Override
	public UniversityMaster getUniversityMasterById(long uId) {
		return universityMasterRepo.findByuId(uId);

	}

	@Override
	public List<Object> getCollegeName(String university_id) {
		return universityCollegeRelationRepo.getCollegeNamesList(university_id);
	}
	
	@Override
	public List<Object> getIntakeByCollegeAndUniversity(String loginUniversity,String loginInstitute,
			String comparingUniversity,String comparingInstitute,String programId) {
		
		List<Object> listOfList = new ArrayList<>();
		
		listOfList.add(sactionIntakeRepo.getIntakeByCollegeAndUniversity(loginUniversity,loginInstitute,programId));
		listOfList.add(sactionIntakeRepo.getIntakeByCollegeAndUniversity(comparingUniversity,comparingInstitute,programId));
		
		return listOfList;
	}

	@Override
	public List<Object> getTotalStudentsByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute, String programId) {
		
		List<Object> listOfList = new ArrayList<>();
		
		listOfList.add(totalStudentRepo.getTotalStudentByCollegeAndUniversity(loginUniversity,loginInstitute,programId));
		listOfList.add(totalStudentRepo.getTotalStudentByCollegeAndUniversity(comparingUniversity,comparingInstitute,programId));
		
		return listOfList;
	}

	@Override
	public List<Object> getPhdGraduatedByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute, String programTimeId) {

		List<Object> listOfList = new ArrayList<>();
		
		listOfList.add(phdGraduatedRepo.getPhdGraduatedByCollegeAndUniversity(loginUniversity,loginInstitute,programTimeId));
		listOfList.add(phdGraduatedRepo.getPhdGraduatedByCollegeAndUniversity(comparingUniversity,comparingInstitute,programTimeId));
		
		return listOfList;
	}

	@Override
	public List<Object> getPhdPersuingByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute, String programTimeId) {
		
		List<Object> listOfList = new ArrayList<>();
		
		listOfList.add(phdPersuingRepo.getPhdPersuingByCollegeAndUniversity(loginUniversity,loginInstitute,programTimeId));
		listOfList.add(phdPersuingRepo.getPhdPersuingByCollegeAndUniversity(comparingUniversity,comparingInstitute,programTimeId));
		
		return listOfList;
	}

	@Override
	public List<Object> getSponsoredResearchByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute, String researchDetailsId) {
		
		List<Object> listOfList = new ArrayList<>();
		
		listOfList.add(sponsoredResearchDetailsRepo.getSponsoredResearchByCollegeAndUniversity(loginUniversity,loginInstitute,researchDetailsId));
		listOfList.add(sponsoredResearchDetailsRepo.getSponsoredResearchByCollegeAndUniversity(comparingUniversity,comparingInstitute,researchDetailsId));
		
		return listOfList;
	}

	@Override
	public List<Object> getConsultingProjectResearchByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute, String researchDetailsId) {

		List<Object> listOfList = new ArrayList<>();
		
		listOfList.add(consultingProjectDetailsRepo.getConsultingProjectResearchByCollegeAndUniversity(loginUniversity,loginInstitute,researchDetailsId));
		listOfList.add(consultingProjectDetailsRepo.getConsultingProjectResearchByCollegeAndUniversity(comparingUniversity,comparingInstitute,researchDetailsId));
		
		return listOfList;
	}

	@Override
	public List<Object> getUG_4_YearByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute, String academicYearId) {

		List<Object> listOfList = new ArrayList<>();
		
		listOfList.add(ug_4yearRepo.getUG_4_YearByCollegeAndUniversity(loginUniversity,loginInstitute,academicYearId));
		listOfList.add(ug_4yearRepo.getUG_4_YearByCollegeAndUniversity(comparingUniversity,comparingInstitute,academicYearId));
		
		return listOfList;
	}

	@Override
	public List<Object> getPG_2_YearByCollegeAndUniversity(String loginUniversity, String loginInstitute,
			String comparingUniversity, String comparingInstitute, String academicYearId) {

		List<Object> listOfList = new ArrayList<>();
		
		listOfList.add(pg_2yearRepo.getPG_2_YearByCollegeAndUniversity(loginUniversity,loginInstitute,academicYearId));
		listOfList.add(pg_2yearRepo.getPG_2_YearByCollegeAndUniversity(comparingUniversity,comparingInstitute,academicYearId));
		
		return listOfList;
	}

}