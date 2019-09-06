package com.responsability.ChainOfResponsability;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.responsability.ChainOfResponsability.models.Button;
import com.responsability.ChainOfResponsability.models.Container;
import com.responsability.ChainOfResponsability.models.Dialog;
import com.responsability.ChainOfResponsability.models.Panel;

@SpringBootApplication
public class ChainOfResponsabilityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChainOfResponsabilityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Dialog dialog = new Dialog();
		dialog.setUrl("Url is a Dialog's specific property");
		Panel panel = new Panel();
		panel.setTitle("Title is a Panel's specific property");
		Button button = new Button();
		button.setDescription("Button has no specific property, so it get the super property 'description'");
		Button anotherButton = new Button();
		anotherButton.setDescription("Another Button description inherited from super class 'Component'");
		
		Button buttonWithoutDescription = new Button();
		Container container = new Container();
		container.add(buttonWithoutDescription);
		container.setDescription("ButtonWithoutDescription's parent container description");
		
		System.out.println("Dialog help:");
		dialog.showHelp();
		System.out.println("Panel help:");
		panel.showHelp();
		System.out.println("Button help:");
		button.showHelp();
		System.out.println("AnotherButton help:");
		anotherButton.showHelp();
		
		System.out.println("Button without description help:");
		buttonWithoutDescription.showHelp();
	}
}
