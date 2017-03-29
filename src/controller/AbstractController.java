package controller;

import handler.ViewHandler;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public abstract class AbstractController implements Initializable {

    protected final ViewHandler viewHandler;

    public AbstractController(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
    }

    @Override
    public abstract void initialize(URL location, ResourceBundle bundle);

}
