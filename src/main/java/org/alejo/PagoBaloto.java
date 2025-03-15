package org.alejo;

import java.io.Serializable;

public class PagoBaloto implements MetodoDePago {

    @Override
    public void procesarPago(double valor) {
        System.out.println("Procesando: " + valor + " mediante BALOTO");
    }
}
