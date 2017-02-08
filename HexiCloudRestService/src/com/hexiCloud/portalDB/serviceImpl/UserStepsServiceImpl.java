package com.hexiCloud.portalDB.serviceImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexiCloud.portalDB.bean.Step;
import com.hexiCloud.portalDB.bean.StepDocument;
import com.hexiCloud.portalDB.bean.UserStep;
import com.hexiCloud.portalDB.dao.StepsDAO;
import com.hexiCloud.portalDB.dao.UserStepsDAO;
import com.hexiCloud.portalDB.service.UserStepsService;

@Service("userStepsService")
public class UserStepsServiceImpl implements UserStepsService {
	
	private static final Logger logger = Logger.getLogger(UserStepsServiceImpl.class);
	
	@Autowired
	UserStepsDAO userStepsDao;
	
	@Autowired
	StepsDAO stepsDao;

	@Override
	public List<StepDocument> findDocsByStepId(int stepId) {
		logger.info("*******  findDocsByStepId() of  service *****************");
		return userStepsDao.findDocsByStepId(stepId);
	}

	@Override
	public void createUserSteps(UserStep userStep) {
		logger.info("*******  createUserSteps() of  service *****************");
		userStepsDao.createUserSteps(userStep);
		
	}

	@Override
	public UserStep getUsersCurrentStep(String userId) {
		logger.info("*******  getUsersCurrentStep() of  service *****************");
		return userStepsDao.getUsersCurrentStep(userId);
	}

	@Override
	public List<Step> getApplicationSteps() {
		logger.info("*******  getApplicationSteps() of  service *****************");
		return stepsDao.getApplicationSteps();
	}

}
