package com.observer.observer.models;

import com.observer.observer.interfaces.EventListeners;

import lombok.Data;

@Data
public class Listener implements EventListeners {

	public void updateValue(String value) {
		
	}

}
