package com.hexiCloud.portalDB.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexiCloud.portalDB.bean.UserEmail;
import com.hexiCloud.portalDB.service.EmailsService;

@RestController
public class EmailController {
	private static final Logger logger = Logger.getLogger(EmailController.class);

	@Autowired
	private EmailsService emailsService;

	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Not found in the system")
	@ExceptionHandler(Exception.class)
	public void exceptionHandler() {

	}

	@RequestMapping(value = "/services/rest/findUserEmails/{userId}", method = RequestMethod.GET)
	public ResponseEntity<List<UserEmail>> findUserEmails(@PathVariable("userId") String userId) throws Exception {
		logger.info("******* Start of findUserEmails() in controller ***********");

		List<UserEmail> emailsList = emailsService.getUserEmails(userId);
		if (emailsList.isEmpty()) {

			logger.info("Emails with id " + userId + " not found");
			return new ResponseEntity<List<UserEmail>>(HttpStatus.NO_CONTENT);
		}

		logger.info("******** End of findUserEmails() in controller ***********");
		return new ResponseEntity<List<UserEmail>>(emailsList, HttpStatus.OK);

	}

}
