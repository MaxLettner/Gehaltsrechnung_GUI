package at.htl.gehaltsrechnung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GehaltsrechnungApplication extends Application {
    private static Stage _stage;
    @Override
    public void start(Stage stage) throws IOException {
        _stage = stage;
        FXMLLoader fxmlLoader1 = new FXMLLoader(GehaltsrechnungApplication.class.getResource("signin-view.fxml"));

        Scene scene1 = new Scene(fxmlLoader1.load(), 320, 240);

        _stage.setTitle("SAPNew");
        _stage.setScene(scene1);
        _stage.show();
    }

    public static void setScene() throws IOException {
        FXMLLoader fxmlLoader2 = new FXMLLoader(GehaltsrechnungApplication.class.getResource("gehaltsrechnung-view.fxml"));

        Scene scene2 = new Scene(fxmlLoader2.load(), 320, 240);
        _stage.setScene(scene2);





    }
}
