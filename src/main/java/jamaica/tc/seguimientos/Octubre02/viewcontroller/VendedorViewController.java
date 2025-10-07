package jamaica.tc.seguimientos.Octubre02.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import jamaica.tc.seguimientos.Octubre02.factory.ModelFactory;
import jamaica.tc.seguimientos.Octubre02.model.VentaSubject;
import jamaica.tc.seguimientos.Septiembre23.model.*;
import jamaica.tc.seguimientos.Septiembre23.services.Cafe;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class VendedorViewController {

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
    private ChoiceBox<String> preparacionChoise;

    @FXML
    private CheckBox wiskybox;

    @FXML
    public void initialize() {
        preparacionChoise.getItems().addAll("Prensa francesa", "Cafetera italiana");
        preparacionChoise.setValue("Prensa francesa");
        btnCalcular.setOnAction(event -> {
            calcularCafe();
            ModelFactory.getInstance().getVentaSubject().registrarVenta();
        });
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
        double costoFinal = cafe.getCosto();
        String preparacion = preparacionChoise.getValue();
        if ("Prensa francesa".equals(preparacion)) {
            costoFinal += 2000;
        } else if ("Cafetera italiana".equals(preparacion)) {
            costoFinal += 3000;
        }
        ingredientestxt.setText("Ingredientes: " + cafe.getDescripcion() + ", " + preparacion);
        costotxt.setText("Costo: $" + costoFinal);
    }
}
