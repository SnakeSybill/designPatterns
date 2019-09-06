package com.responsability.ChainOfResponsability.models;

import com.responsability.ChainOfResponsability.interfaces.ComponentInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Component implements ComponentInterface {

	protected Container container;

	protected String description;

	public void showHelp() {
		if (description != null) {
			System.out.println(String.format("Description: %s", description));
		} else {
			System.out.println("This component has no description, delegating to parent component.");
			container.showHelp();
		}
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
