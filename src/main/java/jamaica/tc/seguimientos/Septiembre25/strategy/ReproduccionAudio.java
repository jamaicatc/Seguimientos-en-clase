package jamaica.tc.seguimientos.Septiembre25.strategy;

public class ReproduccionAudio implements ReproduccionStrategy {
    @Override
    public String reproducir(String nombreArchivo) {
        return "Reproduciendo audio: " + nombreArchivo;
    }
}
