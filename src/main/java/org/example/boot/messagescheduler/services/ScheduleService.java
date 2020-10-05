package org.example.boot.messagescheduler.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.example.boot.messagescheduler.exceptions.ScheduleException;
import org.example.boot.messagescheduler.models.Schedule;
import org.example.boot.messagescheduler.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service Class
 */
@Service
public class ScheduleService {

	@Autowired
	private ScheduleRepository repository;

	public Schedule addSchedule(String dateTime, String message) throws ScheduleException {

		// Validations
		
		// Try to convert the dateTimeString to date
		Date time = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yy-hh-mm");
		try {
			time = dateFormat.parse(dateTime);
		} catch (ParseException e) {
			throw new ScheduleException(e.getMessage(), e);
		}

		// throw an exception 'ScheduleException' if time is past current date-time
		Date now = Calendar.getInstance().getTime();
		if(now.before(time)) {
			throw new ScheduleException("Cannot schedule for a past date-time");
		}
		
		// Create a model object
		Schedule scheduleToSave = new Schedule();
		scheduleToSave.setMessage(message);
		scheduleToSave.setTime(time);
		scheduleToSave.setMessagePosted(false);

		// Save the object to the database
		return repository.save(scheduleToSave);
	}
}
