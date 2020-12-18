package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dao.userDao;
import com.model.Registration;

public class UserService implements userDao{

	String sql="insert into emp(empname,email,city) values(?,?,?)";

	@Override
	public void registration(Registration reg) {

		try {
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, reg.getUname());
			pst.setString(2, reg.getEmail());
			pst.setString(3, reg.getCity());

			int i = pst.executeUpdate();
			if (i > 0) {

				System.out.println(("user is registered"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

}