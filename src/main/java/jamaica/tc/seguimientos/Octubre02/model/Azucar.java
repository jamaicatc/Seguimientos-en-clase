package jamaica.tc.seguimientos.Octubre02.model;

import jamaica.tc.seguimientos.Septiembre23.services.Cafe;

public class Azucar extends CafeDecorador {
    public Azucar(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Azúcar";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 200;
    }
}
