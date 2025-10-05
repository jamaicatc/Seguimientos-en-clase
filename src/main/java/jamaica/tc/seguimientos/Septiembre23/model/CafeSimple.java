package jamaica.tc.seguimientos.Septiembre23.model;


import jamaica.tc.seguimientos.Septiembre23.services.Cafe;

public class CafeSimple implements Cafe {

    @Override
    public String getDescripcion() {
        return "Café simple";
    }

    @Override
    public double getCosto() {
        return 2000; // precio base
    }
}
