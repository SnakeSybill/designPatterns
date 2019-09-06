package com.observer.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.observer.observer.models.EventManager;
import com.observer.observer.models.Listener;
import com.observer.observer.models.ListenerCounter;
import com.observer.observer.models.ListenerId;
import com.observer.observer.models.State;

@SpringBootApplication
public class ObserverApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		State state = new State();
		EventManager<Listener> em = new EventManager<>();
		
		// Test event increment
		Listener listenerCounter = new ListenerCounter();
		em.subscribe(listenerCounter);
		state.setEvents(em);
		
		for(int i = 0; i < 10; i++ ) {
			if(i >=5 && !em.getListeners().isEmpty()) {
				em.unSubscribe(listenerCounter);
			}
			
			System.out.println("Incrementing state");
			state.increment();
		}
		
		// Test event update_id
		Listener listenerId = new ListenerId();
		em.subscribe(listenerId);
		
		for(int j = 0; j < 10; j++ ) {
			if(j >=5 && !em.getListeners().isEmpty()) {
				em.unSubscribe(listenerCounter);
			}
			
			System.out.println("Updating id");
			state.updateId(j);
		}
	}
}
