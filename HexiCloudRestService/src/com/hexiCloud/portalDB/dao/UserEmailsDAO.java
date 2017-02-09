package com.hexiCloud.portalDB.dao;

import java.util.List;

import com.hexiCloud.portalDB.bean.UserEmail;

public interface UserEmailsDAO {
	public List<UserEmail> getUserEmails(String userId);
	public UserEmail saveUserEmail(UserEmail userEmail);

}
