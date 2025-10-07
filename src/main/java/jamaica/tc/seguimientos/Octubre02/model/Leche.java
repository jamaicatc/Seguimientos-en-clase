package jamaica.tc.seguimientos.Octubre02.model;


import jamaica.tc.seguimientos.Septiembre23.services.Cafe;

public class Leche extends CafeDecorador {
    public Leche(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Leche";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 500;
    }
}
