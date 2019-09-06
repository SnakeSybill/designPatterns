package com.responsability.ChainOfResponsability.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Container extends Component {

	private List<Component> children = new ArrayList<>();

	public void add(Component component) {
		children.add(component);
		component.container = this;
	}

	public List<Component> getChildren() {
		return children;
	}

	public void setChildren(List<Component> children) {
		this.children = children;
	}
}
