package com.observer.observer.models;

import com.observer.observer.interfaces.EventListeners;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListenerId extends Listener implements EventListeners{

	private static final String defaultString = "The current State id is";
	private String idValue;

	public ListenerId() {
		this.setIdValue(String.format("%s: 0", ListenerId.defaultString));
	}

	@Override
	public void updateValue(String value) {
		this.setIdValue(String.format("%s: %s", ListenerId.defaultString, value));
		System.out.println(this.idValue);
	}
}
