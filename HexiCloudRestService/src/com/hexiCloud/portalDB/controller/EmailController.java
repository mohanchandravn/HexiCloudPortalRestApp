package com.hexiCloud.portalDB.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexiCloud.portalDB.bean.StepDocument;
import com.hexiCloud.portalDB.bean.UserStep;
import com.hexiCloud.portalDB.service.UserStepsService;

@RestController
public class EmailController {
	private static final Logger logger = Logger.getLogger(EmailController.class);
	
}
