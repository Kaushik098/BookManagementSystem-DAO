package com.kaushik.bookSMS.dao;

import com.kaushik.bookSMS.model.User;

public interface UserDAO {
         
	void register(User user);
	User login(String username, String password);
}
