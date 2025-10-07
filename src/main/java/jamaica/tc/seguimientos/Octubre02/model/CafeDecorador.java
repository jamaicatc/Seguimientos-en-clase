package jamaica.tc.seguimientos.Octubre02.model;

import jamaica.tc.seguimientos.Septiembre23.services.Cafe;

public abstract class CafeDecorador implements Cafe {
    protected Cafe cafe;

    public CafeDecorador(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion();
    }

    @Override
    public double getCosto() {
        return cafe.getCosto();
    }
}
