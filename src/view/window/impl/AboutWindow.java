package view.window.impl;

import controller.AbstractController;
import view.window.AbstractWindow;

import java.util.ResourceBundle;

public class AboutWindow extends AbstractWindow {

	public AboutWindow(AbstractController controller, ResourceBundle bundle) {
		super(controller, bundle);
	}

	@Override
	protected String iconFileName() {
		return "aboutIcon.png";
	}

	@Override
	protected String fxmlFileName() {
		return "about.fxml";
	}

	@Override
	public String titleBundleKey() {
		return "about.title";
	}
}
