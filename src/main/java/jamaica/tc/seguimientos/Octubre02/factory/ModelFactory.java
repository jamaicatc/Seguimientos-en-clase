package jamaica.tc.seguimientos.Octubre02.factory;

import jamaica.tc.seguimientos.Octubre02.model.VentaSubject;

public class ModelFactory {
    private static ModelFactory instance;
    private final VentaSubject ventaSubject;

    private ModelFactory() {
        ventaSubject = new VentaSubject();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public VentaSubject getVentaSubject() {
        return ventaSubject;
    }
}

