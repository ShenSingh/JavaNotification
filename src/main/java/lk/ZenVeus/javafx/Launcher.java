package lk.ZenVeus.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(getClass().getResource("/View/mainPage.fxml"));
        stage.setTitle("ZenVeus");
        stage.setScene(new javafx.scene.Scene(rootNode));
        stage.show();

    }
}
