package at.htl.gehaltsrechnung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GehaltsrechnungApplication extends Application {
    private static Stage primayStage;
    @Override
    public void start(Stage stage) throws IOException {
        primayStage = stage;
        primayStage.setTitle("SAPNew");
        this.setScene("signin");
    }

    public static void setScene(String name) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GehaltsrechnungApplication.class.getResource(name + "-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        primayStage.setScene(scene);
        primayStage.show();
    }
}
