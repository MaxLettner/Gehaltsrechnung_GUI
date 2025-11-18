package at.htl.gehaltsrechnung;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class SigninController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSigninButtonClick() throws IOException {
        GehaltsrechnungApplication.switchScene("gehaltsabrechnung");
    }
}
