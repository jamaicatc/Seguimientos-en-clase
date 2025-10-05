package jamaica.tc.seguimientos.Septiembre23.model;


import jamaica.tc.seguimientos.Septiembre23.services.Cafe;

public class Canela extends CafeDecorador {
    public Canela(Cafe cafe) {
        super(cafe);
    }



    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Canela";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 300;
    }
}
