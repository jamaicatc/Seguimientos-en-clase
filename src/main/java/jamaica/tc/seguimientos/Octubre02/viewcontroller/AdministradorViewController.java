package jamaica.tc.seguimientos.Octubre02.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import jamaica.tc.seguimientos.Octubre02.services.VentaObserver;
import jamaica.tc.seguimientos.Octubre02.factory.ModelFactory;

public class AdministradorViewController implements VentaObserver {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField conteoField;

    @FXML
    private Label conteotxt;

    @FXML
    void initialize() {
        assert conteoField != null : "fx:id=\"conteoField\" was not injected: check your FXML file 'Administrador.fxml'.";
        assert conteotxt != null : "fx:id=\"conteotxt\" was not injected: check your FXML file 'Administrador.fxml'.";
        ModelFactory.getInstance().getVentaSubject().agregarObservador(this);
    }

    @Override
    public void onVentaRealizada(int totalVentas) {
        conteoField.setText(String.valueOf(totalVentas));
    }
}
