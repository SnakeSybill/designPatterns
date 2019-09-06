package com.responsability.ChainOfResponsability.models;

public class Panel extends Component {

	private String title;

	@Override
	public void showHelp() {
		if (title != null) {
			System.out.println(String.format("Title: %s", title));
		} else
			super.showHelp();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
