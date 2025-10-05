package jamaica.tc.seguimientos.Septiembre25.controller;


import jamaica.tc.seguimientos.Septiembre25.model.Reproductor;
import jamaica.tc.seguimientos.Septiembre25.strategy.ReproduccionAudio;
import jamaica.tc.seguimientos.Septiembre25.strategy.ReproduccionGenerica;
import jamaica.tc.seguimientos.Septiembre25.strategy.ReproduccionVideo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;

public class ReproductorController {

    @FXML
    private TextField archivoField;

    @FXML
    private Button cargarBtn;

    @FXML
    private TextArea reproduciendoField;

    @FXML
    private Button reproducirBtn;

    private final Reproductor reproductor = new Reproductor();
    private String nombreArchivoSeleccionado = null;
    private String extensionSeleccionada = null;

    @FXML
    public void initialize() {
        cargarBtn.setOnAction(event -> cargarArchivo());
        reproducirBtn.setOnAction(event -> reproducirArchivo());
    }

    private void cargarArchivo() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar archivo");
        File archivo = fileChooser.showOpenDialog(null);

        if (archivo != null) {
            nombreArchivoSeleccionado = archivo.getName();

            int i = nombreArchivoSeleccionado.lastIndexOf('.');
            if (i > 0) {
                extensionSeleccionada = nombreArchivoSeleccionado.substring(i + 1).toLowerCase();
            } else {
                extensionSeleccionada = "";
            }

            // Mostrar en el TextField el nombre + extensión
            archivoField.setText(nombreArchivoSeleccionado);
        }
    }

    private void reproducirArchivo() {
        if (nombreArchivoSeleccionado == null) {
            reproduciendoField.appendText("No se ha cargado ningún archivo.\n");
            return;
        }

        // Seleccionar estrategia según extensión
        switch (extensionSeleccionada) {
            case "mp3":
            case "wav":
                reproductor.setStrategy(new ReproduccionAudio());
                break;
            case "mp4":
            case "avi":
                reproductor.setStrategy(new ReproduccionVideo());
                break;
            default:
                reproductor.setStrategy(new ReproduccionGenerica());
                break;
        }

        // Mostrar mensaje en el TextArea
        String mensaje = reproductor.ejecutarReproduccion(nombreArchivoSeleccionado);
        reproduciendoField.appendText(mensaje + "\n");
    }
}
