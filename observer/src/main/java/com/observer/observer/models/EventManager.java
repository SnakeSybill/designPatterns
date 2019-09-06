package com.observer.observer.models;

import java.util.ArrayList;
import java.util.List;

import com.observer.observer.enums.EventTypes;

import lombok.Data;

@Data
public class EventManager<T> {

	private List<Listener> listeners = new ArrayList<>();

	public void subscribe(Listener listener) {
		this.listeners.add(listener);
	}

	public void unSubscribe(Listener listener) {
		this.listeners.remove(listener);
	}

	public void notify(State state, String typeEvent) {
		for (Listener l : listeners) {
			if(typeEvent.equals(EventTypes.INCREMENT.getDescription()))
				l.updateValue(Integer.toString(state.getCounter()));
			
			if(typeEvent.equals(EventTypes.UPDATE_ID.getDescription()))
				l.updateValue(Integer.toString(state.getId()));
		}
	}

}
