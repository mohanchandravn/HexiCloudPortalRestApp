package com.hexiCloud.portalDB.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.hexiCloud.portalDB.bean.Step;
import com.hexiCloud.portalDB.service.UserStepsService;

public class Steps {
	private static final Logger logger = Logger.getLogger(Steps.class);
	public Map<String, Step> steps = new HashMap<String, Step>();

	@Autowired
	private UserStepsService userStepsService;

	public Map<String, Step> getSteps() {
		if (steps == null || steps.size() == 0) {
			logger.info("Steps not loaded yet, loading the steps from DB");
			List<Step> dbSteps = userStepsService.getApplicationSteps();
			for (Step dbStep : dbSteps) {
				steps.put(dbStep.getStepCode(), dbStep);
			}
			logger.info("No of steps loaded from DB : " + dbSteps.size());
		}
		return steps;
	}

	public void setSteps(Map<String, Step> steps) {
		this.steps = steps;
	}

	public int getStepId(String stepCode) {
		return getSteps() != null ? getSteps().get(stepCode).getStepId() : 0;
	}

}
