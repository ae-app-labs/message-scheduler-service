package org.example.boot.messagescheduler.controllers;

import org.example.boot.messagescheduler.exceptions.ScheduleException;
import org.example.boot.messagescheduler.models.Schedule;
import org.example.boot.messagescheduler.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

	@Autowired
	private ScheduleService service;
	
	@RequestMapping("/schedule/{dateTime}/{message}")
	public ResponseEntity<String> schedule(@PathVariable String dateTime, @PathVariable String message)  {
		try {
			Schedule saved = service.addSchedule(dateTime, message);
			return ResponseEntity
					.status(HttpStatus.ACCEPTED)
					.body("Message Scheduled");
		} catch (ScheduleException e) {
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(e.getMessage());
		}
	}
}
