package jamaica.tc.seguimientos.Octubre02.model;


import jamaica.tc.seguimientos.Septiembre23.services.Cafe;

public class Wisky extends CafeDecorador {
    public Wisky(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Wisky";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 1000;
    }
}
