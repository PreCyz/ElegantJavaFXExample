package view;

import controller.AbstractController;
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
			final AbstractController controller = new StartController(viewHandler);
			controller.setGatherer(viewHandler.gatherer());
			return new StartWindow(controller, bundle);
		}
	},

	ABOUT {
		@Override
		public AbstractWindow createWindow(ViewHandler viewHandler, ResourceBundle bundle) {
			final AbstractController controller = new AboutController(viewHandler);
			controller.setGatherer(viewHandler.gatherer());
			return new AboutWindow(controller, bundle);
		}
	};

	public abstract AbstractWindow createWindow(ViewHandler viewHandler, ResourceBundle bundle);

}
