package org.alejo;

public class PagoPSE implements MetodoDePago{
    @Override
    public void procesarPago(double valor) {
        System.out.println("Procesando: " + valor + " mediante PSE");
    }
}
