package jamaica.tc.seguimientos.Septiembre25.strategy;

public class ReproduccionVideo implements ReproduccionStrategy {
    @Override
    public String reproducir(String nombreArchivo) {
        return "Reproduciendo video: " + nombreArchivo;
    }
}
