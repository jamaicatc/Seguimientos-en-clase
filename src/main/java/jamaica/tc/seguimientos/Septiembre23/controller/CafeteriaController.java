package jamaica.tc.seguimientos.Septiembre23.controller;

import java.net.URL;
import java.util.ResourceBundle;

import jamaica.tc.seguimientos.Septiembre23.model.*;
import jamaica.tc.seguimientos.Septiembre23.services.Cafe;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class CafeteriaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox azucarbox;

    @FXML
    private Button btnCalcular;

    @FXML
    private CheckBox canelabox;

    @FXML
    private Label costotxt;

    @FXML
    private RadioButton especialcheck;

    @FXML
    private Label ingredientestxt;

    @FXML
    private Label labeltxt;

    @FXML
    private CheckBox lechebox;

    @FXML
    private RadioButton pasillacheck;

    @FXML
    private ChoiceBox<?> preparacionChoise;

    @FXML
    private CheckBox wiskybox;

    @FXML
    public void initialize() {
        btnCalcular.setOnAction(event -> calcularCafe());
    }

    private void calcularCafe() {

        Cafe cafe = new CafeSimple();
        
        if (lechebox.isSelected()) {
            cafe = new Leche(cafe);
        }
        if (azucarbox.isSelected()) {
            cafe = new Azucar(cafe);
        }
        if (wiskybox.isSelected()) {
            cafe = new Wisky(cafe);
        }
        if (canelabox.isSelected()) {
            cafe = new Canela(cafe);
        }

        ingredientestxt.setText("Ingredientes: " + cafe.getDescripcion());
        costotxt.setText("Costo: $" + cafe.getCosto());
    }
}
