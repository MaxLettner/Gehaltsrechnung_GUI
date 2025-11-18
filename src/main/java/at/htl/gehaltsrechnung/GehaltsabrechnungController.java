package at.htl.gehaltsrechnung;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class GehaltsabrechnungController {
    @FXML private Button addButton;

    @FXML private ChoiceBox choiceBox;

    @FXML private TextField namensfeld;
    @FXML private TextField periodenfeld;
    @FXML private TextField gehaltfeld;
    @FXML private TextField stundenlohnfeld;
    @FXML private TextField arbeitsstundenfeld;

    public void initialize() {
        choiceBox.setItems(FXCollections.observableArrayList("G", "L"));
        choiceBox.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> updateButton()
        );
        gehaltfeld.setDisable(true);
        stundenlohnfeld.setDisable(true);
        arbeitsstundenfeld.setDisable(true);
        addButton.setDisable(true);
    }
    private void updateButton() {
        setDefaultSpezifisch();
        if (choiceBox.getSelectionModel().getSelectedItem().equals("G")) {
            gehaltfeld.setDisable(false);
            stundenlohnfeld.setDisable(true);
            arbeitsstundenfeld.setDisable(true);
            addButton.setDisable(false);
        }else {
            gehaltfeld.setDisable(true);
            stundenlohnfeld.setDisable(false);
            arbeitsstundenfeld.setDisable(false);
            addButton.setDisable(false);
        }
    }

    private void onAddButtonClick() {
        try{
            if()
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void setDefaultSpezifisch(){
        gehaltfeld.setText("");
        stundenlohnfeld.setText("");
        arbeitsstundenfeld.setText("");
    }

    private void setDefault(){
        namensfeld.setText("");
        periodenfeld.setText("");
        gehaltfeld.setText("");
        stundenlohnfeld.setText("");
        arbeitsstundenfeld.setText("");
    }
}
