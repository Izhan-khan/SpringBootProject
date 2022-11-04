package com.innovento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovento.Repository.SactionIntakeRepo;
import com.innovento.model.ProgramMaster;
import com.innovento.model.SactionIntakeMaster;
import com.innovento.model.TotalStudentStrength;
import com.innovento.service.InnoventoMVPService;

@RestController
@CrossOrigin("*")
public class InnoventoController {

	@Autowired
	InnoventoMVPService innoventoMVPService;
	

	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}

	@GetMapping("/instituteDashboard" )
	public String instituteDashboard() {
		System.out.println("----instituteDashboard----");
		return "instituteDashboard";	
	}
	

	@GetMapping("/program/getNameFromId/{id}")
	public ProgramMaster getProgram(@PathVariable("id") long id) {
		return innoventoMVPService.getProgramFromId(id);
	}

	@GetMapping("/sactionApprovedIntake/getList")
	public  List<SactionIntakeMaster> getsactionApprovedList() {
		return innoventoMVPService.getsactionApprovedList();
	}
	
	@PostMapping("/sactionApprovedIntake/addList")
	public void addSactionApprovedList(@RequestBody List<SactionIntakeMaster> intakeMastersList) {
		 innoventoMVPService.addSactionApprovedList(intakeMastersList);
	}
	
	
	@GetMapping("/totalStudentStrength/getList")
	public  List<TotalStudentStrength> getTotalStudentList() {
		return innoventoMVPService.getTotalStudentList();
	}
	
	@PostMapping("/totalStudentStrength/addList")
	public void addTotalStudentList(@RequestBody List<TotalStudentStrength> totalStudentList) {
		System.out.println(totalStudentList);
		 innoventoMVPService.addTotalStudentList(totalStudentList);
	}
	
	
	
	
}
