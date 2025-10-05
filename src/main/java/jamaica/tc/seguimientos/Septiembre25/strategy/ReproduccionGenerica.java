package jamaica.tc.seguimientos.Septiembre25.strategy;

public class ReproduccionGenerica implements ReproduccionStrategy {
    @Override
    public String reproducir(String nombreArchivo) {
        return "Reproduciendo archivo: " + nombreArchivo;
    }
}
