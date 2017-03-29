package view.window.impl;

import controller.AbstractController;
import view.window.AbstractWindow;

import java.util.ResourceBundle;

public class StartWindow extends AbstractWindow {

	public StartWindow(AbstractController controller, ResourceBundle bundle) {
		super(controller, bundle);
	}

	@Override
	protected String iconFileName() {
		return "startIcon.png";
	}

	@Override
	protected String fxmlFileName() {
		return "start.fxml";
	}

	@Override
	public String titleBundleKey() {
		return "start.title";
	}

}
