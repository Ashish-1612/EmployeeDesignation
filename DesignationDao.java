package com.deloitte.main.DAO;

import java.sql.*;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.deloitte.main.model.Admin;
import com.deloitte.main.model.PersonalDetail;
import com.deloitte.main.model.Qualification;
import com.deloitte.main.model.UserInfo;

@Repository
public class DesignationDao {

	public static Connection connectToDB() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public UserInfo validateUser(UserInfo user1) {

		try {

			Connection con = connectToDB();
			System.out.println("dao");
			// step 3 create the statement
			PreparedStatement stmt = con.prepareStatement("select * from login where userId=? AND password=?");
			stmt.setInt(1, user1.getUserId());
			stmt.setString(2, user1.getPassword());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				user1.setUserType(rs.getString(3));
			}
			// step 4 execute sql command
			// step5 close connection
			System.out.println("user " + user1);
			con.close();
			return user1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public int addFresher(PersonalDetail fresher) {

		try {

			Connection con = connectToDB();
			System.out.println("dao");
			// step 3 create the statement
			PreparedStatement stmt = con.prepareStatement("insert into ");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

			}
			// step 4 execute sql command
			// step5 close connection
			System.out.println("user ");
			con.close();
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public PersonalDetail getUserDesignation(int userId) {
		try {

			Connection con = connectToDB();
			System.out.println("dao");
			// step 3 create the statement
			PreparedStatement stmt = con
					.prepareStatement("select userId,email,name,designation,salaryPackage from fresher where userId=?");
			stmt.setInt(1, userId);
			PersonalDetail user1 = null;
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				user1 = new PersonalDetail();
				user1.setUserId(rs.getInt(1));
				user1.setEmail(rs.getString(2));
				user1.setName(rs.getString(3));
				user1.setDesignation(rs.getString(4));
				user1.setSalaryPackage(rs.getDouble(5));
			}
			// step 4 execute sql command
			// step5 close connection
			System.out.println("user " + user1);
			con.close();
			return user1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public ArrayList<PersonalDetail> getAllUserDetails() {
		// TODO Auto-generated method stub
		try {

			Connection con = connectToDB();
			System.out.println("dao");
			// step 3 create the statement
			PreparedStatement stmt = con.prepareStatement("select userId,name,designation,salaryPackage from fresher");
			ArrayList<PersonalDetail> freshers = new ArrayList<PersonalDetail>();
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				PersonalDetail user1 = new PersonalDetail();
				user1.setUserId(rs.getInt(1));
				user1.setName(rs.getString(2));
				user1.setDesignation(rs.getString(3));
				user1.setSalaryPackage(rs.getDouble(4));
				freshers.add(user1);
			}
			// step 4 execute sql command
			// step5 close connection
			System.out.println("user " + freshers);
			con.close();
			return freshers;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		try {

			Connection con = connectToDB();
			// step 3 create the statement
			PreparedStatement stmt = con.prepareStatement("delete from fresher where userId=?");
			stmt.setInt(1, userId);
			int rs = stmt.executeUpdate();
			stmt = con.prepareStatement("delete from login where userId=?");
			stmt.setInt(1, userId);
			rs = stmt.executeUpdate();

			// step 4 execute sql command
			// step5 close connection
			System.out.println("row affected " + rs);
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addAdmin(Admin newAdmin) {
		try {

			Connection con = connectToDB();
			System.out.println("dao");
			// step 3 create the statement
			PreparedStatement stmt = con.prepareStatement("insert into admin values(?,?)");
			stmt.setInt(1, newAdmin.getUserId());
			stmt.setString(2, newAdmin.getName());
			int rs = stmt.executeUpdate();
			System.out.println("row affected" + rs);
			stmt = con.prepareStatement("insert into login values(?,?,?)");
			stmt.setInt(1, newAdmin.getUserId());
			stmt.setString(2, newAdmin.getPassword());
			stmt.setString(3, newAdmin.getUsertype());
			rs = stmt.executeUpdate();
			System.out.println("row affected" + rs);
			// step 4 execute sql command
			// step5 close connection
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String adddata(Qualification qua,PersonalDetail pd) {
		System.out.println(qua);
		//step3 create a statement
	try {
		Connection con=connectToDB();
		PreparedStatement stmt=con.prepareStatement("insert into fresher (userId,email,name,fatherName,motherName,address,contactNo,gender,graduation,finalper,Interviewscore,technicalSkill,communicationSkill,designation,salaryPackage) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		stmt.setInt(1,pd.getUserId());
		stmt.setString(2,pd.getEmail());
		stmt.setString(3,pd.getName());
		stmt.setString(4,pd.getFatherName());
		stmt.setString(5,pd.getMotherName());
		stmt.setString(6,pd.getAddress());
		stmt.setLong(7,pd.getContactNo());
		stmt.setString(8,pd.getGender());
		stmt.setString(9, qua.getQualification());
		stmt.setInt(10,qua.getFinalPercentage());
		stmt.setInt(11, qua.getInterviewScore());
		stmt.setInt(12,qua.getTechnicalScore());
		stmt.setInt(13, qua.getCommunicationScore());
		stmt.setString(14, pd.getDesignation());
		stmt.setDouble(15, pd.getSalaryPackage());
		//step4 execute sql query
		int affectedRows=stmt.executeUpdate();
		stmt = con.prepareStatement("insert into login values(?,?,?)");
		stmt.setInt(1, pd.getUserId());
		stmt.setString(2, pd.getPassword());
		stmt.setString(3, "fresher");
	    affectedRows=stmt.executeUpdate();
		System.out.println("affectedRows="+affectedRows);
		con.close();
		}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "data inserted successfully";
	}

}
