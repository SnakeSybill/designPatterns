package com.observer.observer.enums;
import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventTypes {

	INCREMENT("increment"),
	UPDATE_ID("update_id");
	
	private String description;
	
	public static EventTypes getByDescription(String eventType) {
        return Arrays.stream(EventTypes.values()).filter(e -> e.description.equals(eventType)).findFirst()
            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", eventType)));
    }
}
