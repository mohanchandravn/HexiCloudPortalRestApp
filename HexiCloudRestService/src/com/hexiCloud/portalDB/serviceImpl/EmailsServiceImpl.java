package com.hexiCloud.portalDB.serviceImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexiCloud.portalDB.bean.UserEmail;
import com.hexiCloud.portalDB.dao.UserEmailsDAO;
import com.hexiCloud.portalDB.service.EmailsService;

@Service("emailsService")
public class EmailsServiceImpl implements EmailsService {
	private static final Logger logger = Logger.getLogger(EmailsServiceImpl.class);

	@Autowired
	UserEmailsDAO userEmailsDAO;

	@Override
	public List<UserEmail> getUserEmails(String userId) {
		logger.info("*******  findDocsByStepId() of  service *****************");
		return userEmailsDAO.getUserEmails(userId);
	}

	@Override
	public void saveUserEmail(UserEmail userEmail) {
		logger.info("*******  saveUserEmail() of  service *****************");
		userEmailsDAO.saveUserEmail(userEmail);

	}

}
