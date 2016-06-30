package com.mayank.LogIn.service;

import com.mayank.LogIn.LoginServlet;
import com.mayank.LogIn.dto.User;

public class LoginServiceImpl implements LoginService{

	@Override
	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println(password);
		if(password.equals("mayank"))
			return true;
		else
			return false;
	}

	@Override
	public User findUserDetails(String userId) {
		// TODO Auto-generated method stub
		User user =new User();
		user.setUserId("mk");
		user.setAddress("svs palm2");
		user.setLastName("kumar");
		return user;
		
		
		
	}
	

}
