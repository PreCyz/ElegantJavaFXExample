package controller.impl;

import controller.AbstractController;
import handler.ViewHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartController extends AbstractController {

	@FXML private Button aboutButton;

	public StartController(ViewHandler viewHandler) {
		super(viewHandler);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		aboutButton.setOnAction(aboutAction());
	}

	private EventHandler<ActionEvent> aboutAction() {
		return e -> {
			try {
				viewHandler.launchAboutWindow();
			} catch (IOException ex) {
				/* implementation of alert dialog */
			}
		};
	}

}
