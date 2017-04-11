package handler;

import dto.Gatherer;

import java.io.IOException;

public interface ViewHandler {

	void launchStartWindow() throws IOException;
	void launchAboutWindow() throws IOException;
	void updateGatherer(Gatherer gatherer);
	Gatherer gatherer();

}
