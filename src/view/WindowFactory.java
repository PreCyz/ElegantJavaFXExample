package view;

import controller.impl.AboutController;
import controller.impl.StartController;
import handler.ViewHandler;
import view.window.AbstractWindow;
import view.window.impl.*;

import java.util.ResourceBundle;

public enum WindowFactory {

	START {
		@Override
		public AbstractWindow createWindow(ViewHandler viewHandler, ResourceBundle bundle) {
			return new StartWindow(new StartController(viewHandler), bundle);
		}
	},

	ABOUT {
		@Override
		public AbstractWindow createWindow(ViewHandler viewHandler, ResourceBundle bundle) {
			return new AboutWindow(new AboutController(viewHandler), bundle);
		}
	};

	public abstract AbstractWindow createWindow(ViewHandler viewHandler, ResourceBundle bundle);

}
