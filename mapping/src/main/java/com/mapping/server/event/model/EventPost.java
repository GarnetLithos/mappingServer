package com.mapping.server.event.model;

public class EventPost {
	String eventId;
	String eventName;
	String location;
	String contents;
	String image;
	
	public EventPost(){
		
	}

	public EventPost(String eventId, String eventName, String location,
			String contents, String image) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.location = location;
		this.contents = contents;
		this.image = image;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
