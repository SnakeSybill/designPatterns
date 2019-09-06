package com.observer.observer.models;

import com.observer.observer.enums.EventTypes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class State {

	private Integer counter;
	
	private Integer id;
	
	public EventManager<Listener> events;
	
	public void increment() {
		this.counter++;
		events.notify(this, EventTypes.INCREMENT.getDescription());
	}
	
	public void updateId(Integer newId) {
		this.id = newId;
		events.notify(this, EventTypes.UPDATE_ID.getDescription());
	}
	
	public State() {
		this.counter = 0;
	}
}
