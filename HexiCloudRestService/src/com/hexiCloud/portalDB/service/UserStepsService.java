package com.hexiCloud.portalDB.service;

import java.util.List;

import com.hexiCloud.portalDB.bean.Step;
import com.hexiCloud.portalDB.bean.StepDocument;
import com.hexiCloud.portalDB.bean.UserStep;

public interface UserStepsService {
	public List<StepDocument> findDocsByStepId(int stepId);

	public void createUserSteps(UserStep userStep);

	public UserStep getUsersCurrentStep(String userId);
	
	public List<Step> getApplicationSteps();
}
