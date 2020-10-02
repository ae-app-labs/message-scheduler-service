package org.example.boot.messagescheduler.exceptions;

@SuppressWarnings("serial")
public class ScheduleException extends Exception {

	public ScheduleException() {
		super();
	}

	public ScheduleException(String message) {
		super(message);
	}

	public ScheduleException(String message, Exception cause) {
		super(message, cause);
	}
}
