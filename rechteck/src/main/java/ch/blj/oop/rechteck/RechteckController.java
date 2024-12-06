package ch.blj.oop.rechteck;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class RechteckController {
    @FXML
    private TextField textFieldBreite;
    @FXML
    private TextField textFieldHoehe;
    @FXML
    private TextField textFieldResultat;

    String eingabe = textFieldBreite.getText();
    double breite = Double.parseDouble(eingabe);

    String eingabee = textFieldHoehe.getText();
    double height = Double.parseDouble(eingabee);


    @FXML
    private void onButtonCalculateClick(){

        if (textFieldBreite.getText().equals("") || textFieldHoehe.getText().equals("")){
            showMessageBox("Bitte geben Sie sowohl die Breite als auch die Höhe des Rechtecks ein.");
        }
    }

    @FXML
    private void showMessageBox(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.setContentText(message);
    }

}
