import handler.impl.AppViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

import static util.AppPaths.RESOURCE_BUNDLE;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        new AppViewHandler(primaryStage, ResourceBundle.getBundle(RESOURCE_BUNDLE, Locale.getDefault()))
                .launchStartWindow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
