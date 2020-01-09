package com.deloitte.main.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.main.model.Admin;
import com.deloitte.main.model.PersonalDetail;
import com.deloitte.main.model.Qualification;
import com.deloitte.main.model.UserInfo;
import com.deloitte.main.services.DesignationServices;

@Controller
@ResponseBody
public class EmpController {
	@Autowired
	DesignationServices service;

	@GetMapping("/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@PostMapping("/login")
	public ModelAndView validateUser(UserInfo user) {
		ModelAndView modelAndView = new ModelAndView();
		UserInfo user1 = service.validateUser(user);
		System.out.println(user1);
		if (user1.getUserType().equals("admin")) {
			modelAndView.setViewName("adminMenu");
			modelAndView.addObject("user", user1);
		} else if (user1.getUserType().equals("fresher")) {

			modelAndView.setViewName("displaydesignation");
			modelAndView.addObject("fresher", designationdetail(user1.getUserId()));
		} else if (user1.getUserType().equals("trainer")) {
			modelAndView.setViewName(null);
		} else {
			modelAndView.setViewName("login");
			modelAndView.addObject("err", "userId is not valid");
		}
		return modelAndView;
	}

	

	public PersonalDetail designationdetail(int userId) {
		return service.getUserDesignation(userId);
		// return modelAndView;

	}

	@GetMapping("/deleteuserdetail")
	public ModelAndView deleteUserForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/deleteuserdetail");
		return modelAndView;
	}

	@GetMapping("/deleteuser")
	public ModelAndView deleteUserDetail(@RequestParam("userId") int userId) {
		ModelAndView modelAndView = new ModelAndView();
		service.deleteUser(userId);
		modelAndView.setViewName("/adminMenu");
		return modelAndView;
	}

	@GetMapping("/newadmin")
	public ModelAndView addAdminForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/newadmin");
		return modelAndView;
	}

	@PostMapping("/addadmin")
	public ModelAndView addAdmin(Admin newAdmin) {
		ModelAndView modelAndView = new ModelAndView();
		service.addAdmin(newAdmin);
		modelAndView.setViewName("/adminMenu");
		return modelAndView;
	}

	@GetMapping("/displayallfresher")
	public ModelAndView allFresher() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayallfresher");
		modelAndView.addObject("freshers", service.getAllFreshers());
		return modelAndView;
	}

	@GetMapping("/addnewtrainerform")
	public ModelAndView trainerForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@RequestMapping("/personalDetails")
	public ModelAndView myPersonal() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("personal");
		// modelAndView.addObject("NewFile", service.getMessage());
		return modelAndView;
	}

	@PostMapping("/submit")
	public ModelAndView myQualification(PersonalDetail pd) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(pd);
		modelAndView.setViewName("qualification");
		modelAndView.addObject("user", pd);

		return modelAndView;
	}

	
	@GetMapping("/quasubmit/{userId}/{email}/{name}/{fatherName}/{motherName}/{address}/{contactNo}/{gender}/{password}")
	public ModelAndView quaSubmit(@PathVariable("userId") int userId, @PathVariable("email") String email,
			@PathVariable("name") String name, @PathVariable("fatherName") String fatherName,
			@PathVariable("motherName") String motherName, @PathVariable("address") String address,
			@PathVariable("contactNo") long contactNo, @PathVariable("gender") String gender,
			@PathVariable("password") String password, @RequestParam("qualification") String qualification,
			@RequestParam("finalPercentage") int finalPercentage, @RequestParam("interviewScore") int interviewScore,
			@RequestParam("technicalScore") int technicalScore,
			@RequestParam("communicationScore") int communicationScore)

	{
		
		System.out.println("entered");
		Qualification qua = new Qualification();
		qua.setQualification(qualification);
		qua.setFinalPercentage(finalPercentage);
		qua.setInterviewScore(interviewScore);
		qua.setTechnicalScore(technicalScore);
		qua.setCommunicationScore(communicationScore);

		System.out.println("Qualification " + qua);
		PersonalDetail pd = new PersonalDetail();
		pd.setUserId(userId);
		pd.setEmail(email);
		pd.setName(name);
		pd.setFatherName(fatherName);
		pd.setMotherName(motherName);
		pd.setAddress(address);
		pd.setContactNo(contactNo);
		pd.setGender(gender);
		pd.setPassword(password);
		pd.setDesignation(service.setDesignation(qua.getInterviewScore(), qua.getFinalPercentage()));
		pd.setSalaryPackage(service.setPackage(pd.getDesignation(), qua.getQualification()));
		System.out.println("personal details " + pd);
		
		System.out.println(userId);
		// modelAndview.addObject("test", service.addFresher(pd));
		String message = service.adddata(qua, pd);
		System.out.println(message);
		ModelAndView modelAndview = new ModelAndView("redirect:/adminMenu");
		return modelAndview;
	}
    @GetMapping("/adminMenu")
	public ModelAndView adminMenu() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("adminMenu");
		return modelAndView;
	}
}
