package com.deloitte.main.services;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.main.DAO.DesignationDao;
import com.deloitte.main.model.Admin;
import com.deloitte.main.model.PersonalDetail;
import com.deloitte.main.model.Qualification;
import com.deloitte.main.model.UserInfo;

@Service
public class DesignationServices {
	@Autowired
	DesignationDao dao;
	Scanner sc = new Scanner(System.in);

	public UserInfo validateUser(UserInfo user) {
		return dao.validateUser(user);

	}
	public PersonalDetail getUserDesignation(int userId) {
		return dao.getUserDesignation(userId);
	}
	public ArrayList<PersonalDetail> getAllFreshers() {
		return dao.getAllUserDetails();
	}

	public String setDesignation(int InterviewScore, int finalPercentage) {
		String designation="Computer Operator";
		if (InterviewScore >= 8) {
			if (finalPercentage >= 80) {
				designation="Deloitte Consultant";
			} else if (finalPercentage >= 70) {
				designation="System engineer";
			} else if (finalPercentage >= 60) {
				designation="Associate Analyst";
			}
		} else if (InterviewScore >= 7) {
			if (finalPercentage >= 80) {
				designation="System engineer";
			} else if (finalPercentage >= 70) {
				designation="Audit & Risk Consultant";
			} else if (finalPercentage >= 60) {
				designation="Business Technology Analyst";
			}

		} else if (InterviewScore >= 6) {
			if (finalPercentage >= 80) {
				designation="Audit & Risk Consultant";
			} else if (finalPercentage >= 70) {
				designation="Junior Executive";
			} else if (finalPercentage >= 60) {
				designation="Computer Operator";
			}
		}
		return designation;
	}

	public Double setPackage(String designation,String qualification) {
		double salaryPackage = 300000.00;
		if (qualification.equals("Bachelors")) {
			if (designation.equals("Deloitte Consultant") | designation.equals("System engineer")
					| designation.equals("Audit & Risk Consultant")) {
				salaryPackage = 500000.00;
			} else if (designation.equals("Business Technology Analyst") | designation.equals("Associate Analyst")) {
				salaryPackage = 400000.00;
			} else if (designation.equals("Junior Executive") | designation.equals("Computer Operator")) {
				salaryPackage = 330000.00;
			}

		} else if (qualification.equals("Masters")) {
			if (designation.equals("Deloitte Consultant") | designation.equals("System engineer")
					| designation.equals("Audit & Risk Consultant")) {
				salaryPackage = 700000.00;
			} else if (designation.equals("Business Technology Analyst") | designation.equals("Associate Analyst")) {
				salaryPackage = 570000.00;
			} else if (designation.equals("Junior Executive") | designation.equals("Computer Operator")) {
				salaryPackage = 450000.00;
			}

		}
		return salaryPackage;
	}
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		dao.deleteUser(userId);
	}
	public void addAdmin(Admin newAdmin) {
		// TODO Auto-generated method stub
		dao.addAdmin(newAdmin);
	}
	public String adddata(Qualification qua,PersonalDetail pd) {
		String msg = dao.adddata(qua,pd);
		System.out.println(msg);
		return msg;
	}
	
}
