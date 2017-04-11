package controller.impl;

import controller.AbstractController;
import handler.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AboutController extends AbstractController {

	@FXML private Label messageLabel;

	public AboutController(ViewHandler viewHandler) {
		super(viewHandler);
	}

	@Override
	public void initialize(URL location, ResourceBundle bundle) {
		messageLabel.setText(gatherer.getMessage());
	}
}
