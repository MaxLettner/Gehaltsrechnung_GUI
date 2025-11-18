package at.htl.gehaltsrechnung;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class GehaltsabrechnungController {
    List<Mitarbeiter> _mitarbeiterList = new ArrayList<Mitarbeiter>();

    @FXML private Button addButton;

    @FXML private ChoiceBox choiceBox;

    @FXML private TextField namensfeld;
    @FXML private TextField periodenfeld;
    @FXML private TextField gehaltfeld;
    @FXML private TextField stundenlohnfeld;
    @FXML private TextField arbeitsstundenfeld;

    @FXML private Label errorMessageField;

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

    @FXML
    private void onAddButtonClick() {

        try{
            if(namensfeld.getText().isEmpty() ||  periodenfeld.getText().isEmpty()){
                throw new FalseInputException("Name or Period are empty");
            }

            Mitarbeiter mitarbeiter;

            if(choiceBox.getSelectionModel().getSelectedItem().equals("G")){
                if(gehaltfeld.getText().isEmpty()){
                    throw new FalseInputException("Monatsgehalt ist empty");
                }
                mitarbeiter = new Angestellter(namensfeld.getText(), periodenfeld.getText(), Long.parseLong(gehaltfeld.getText()));
            }else {
                if(stundenlohnfeld.getText().isEmpty() ||  arbeitsstundenfeld.getText().isEmpty()){
                    throw new FalseInputException("Stundenlohn or Arbeitsstunden ist empty");
                }
            }
            errorMessageField.setText("");
        }catch (Exception e){
            errorMessageField.setText(e.getMessage());
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
