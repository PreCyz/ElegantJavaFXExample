package controller;

import dto.Gatherer;
import handler.ViewHandler;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public abstract class AbstractController implements Initializable {

    protected final ViewHandler viewHandler;
    protected Gatherer gatherer;

    public AbstractController(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
    }

    public void setGatherer(Gatherer gatherer) {
        this.gatherer = gatherer;
    }

    @Override
    public abstract void initialize(URL location, ResourceBundle bundle);

}
