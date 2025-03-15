package org.alejo;

public class Pago {
    private MetodoDePago metodoDePago;
    private int valor;

    public Pago(MetodoDePago metodoDePago, int valor) {
        this.metodoDePago = metodoDePago;
        this.valor = valor;
    }

    public void pagar() {
        metodoDePago.procesarPago(this.valor);
    }
}
