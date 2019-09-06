package com.responsability.ChainOfResponsability.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Dialog extends Component {

	private String url;

	@Override
	public void showHelp() {
		if (url != null) {
			System.out.println(String.format("URL: %s", url));
		} else
			super.showHelp();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
