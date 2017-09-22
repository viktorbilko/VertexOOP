package jfx.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Viktor Bilko on 21.09.2017.
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/start.fxml"));
        stage.setTitle("vertex Academy");
//      primaryStage.getIcons().add(new Image("/image/PatriotDefence.png"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
//        scene.getStylesheets().add("css/main.css");
        stage.show();
    }
}
