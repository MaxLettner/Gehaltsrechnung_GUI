package at.htl.gehaltsrechnung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class GehaltsrechnungApplication extends Application {
    private static Stage primayStage;
    @Override
    public void start(Stage stage) throws IOException {
        primayStage = stage;
        primayStage.setTitle("SAPNew");
        this.switchScene("signin");

        stage.getIcons().add(new Image(GehaltsrechnungApplication.class.getResourceAsStream("/at/htl/gehaltsrechnung/images/SAP.jpg")));
    }

    public static void switchScene(String name) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GehaltsrechnungApplication.class.getResource(name + "-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        primayStage.setScene(scene);
        primayStage.show();
    }
}
