package jamaica.tc.seguimientos.Octubre02.model;

import jamaica.tc.seguimientos.Octubre02.services.VentaObserver;

import java.util.ArrayList;
import java.util.List;

public class VentaSubject {
    private final List<VentaObserver> observadores = new ArrayList<>();
    private int totalVentas = 0;

    public void agregarObservador(VentaObserver o) {
        observadores.add(o);
    }

    public void eliminarObservador(VentaObserver o) {
        observadores.remove(o);
    }

    public void registrarVenta() {
        totalVentas++;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (VentaObserver o : observadores) {
            o.onVentaRealizada(totalVentas);
        }
    }
}
