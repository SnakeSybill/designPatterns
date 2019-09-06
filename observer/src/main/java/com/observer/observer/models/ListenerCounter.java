package com.observer.observer.models;

import com.observer.observer.interfaces.EventListeners;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListenerCounter extends Listener implements EventListeners {

	private static final String defaultString = "The current value in State counter is";
	private String value;

	public ListenerCounter() {
		this.setValue(String.format("%s: 0", ListenerCounter.defaultString));
	}

	@Override
	public void updateValue(String value) {
		this.setValue(String.format("%s: %s", ListenerCounter.defaultString, value));
		System.out.println(this.value);
	}
}
