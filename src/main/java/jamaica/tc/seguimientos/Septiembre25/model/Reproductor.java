package jamaica.tc.seguimientos.Septiembre25.model;


import jamaica.tc.seguimientos.Septiembre25.strategy.ReproduccionStrategy;

public class Reproductor {

    private ReproduccionStrategy strategy;

    public void setStrategy(ReproduccionStrategy strategy) {
        this.strategy = strategy;
    }

    public String ejecutarReproduccion(String nombreArchivo) {
        if (strategy == null) {
            return "No hay estrategia de reproducción seleccionada.";
        }
        return strategy.reproducir(nombreArchivo);
    }
}
