package com.mayank.LogIn.service;

import com.mayank.LogIn.dto.User;

public interface LoginService {
	public boolean authenticate(String username,String password);
	public User findUserDetails(String userId);
}
