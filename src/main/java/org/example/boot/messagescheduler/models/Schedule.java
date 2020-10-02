package org.example.boot.messagescheduler.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Schedule {

	public static final Schedule EMPTY = new Schedule();

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "schedule_time")
	private Date time;

	@Column(name = "schedule_message")
	private String message;

	@Column(name = "message_posted")
	private boolean isMessagePosted;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isMessagePosted() {
		return isMessagePosted;
	}

	public void setMessagePosted(boolean isMessagePosted) {
		this.isMessagePosted = isMessagePosted;
	}

}
