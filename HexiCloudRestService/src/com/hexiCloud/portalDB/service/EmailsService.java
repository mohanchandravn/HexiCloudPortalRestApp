package com.hexiCloud.portalDB.service;

import java.util.List;

import com.hexiCloud.portalDB.bean.UserEmail;

public interface EmailsService {

	public List<UserEmail> getUserEmails(String userId);

	public void saveUserEmail(UserEmail userEmail);

}
