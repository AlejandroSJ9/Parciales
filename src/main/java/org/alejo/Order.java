package org.alejo;

public class Order {
    public String date;
    public User user;
    public Pago pago;
    public int total;

    public Order(String date, User user) {
        this.date = date;
        this.user = user;
    }

    public void realizarPago(MetodoDePago metodoDePago){
        this.pago = new Pago(metodoDePago,this.total);
    }
}
