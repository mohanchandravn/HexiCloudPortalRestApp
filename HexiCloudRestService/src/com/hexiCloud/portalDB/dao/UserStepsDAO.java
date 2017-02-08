package com.hexiCloud.portalDB.dao;

import java.util.List;

import com.hexiCloud.portalDB.bean.StepDocument;
import com.hexiCloud.portalDB.bean.UserStep;

public interface UserStepsDAO {
	public List<StepDocument> findDocsByStepId(int stepId); 
	public void createUserSteps(UserStep userStep);
	public UserStep getUsersCurrentStep(String userId);
}
