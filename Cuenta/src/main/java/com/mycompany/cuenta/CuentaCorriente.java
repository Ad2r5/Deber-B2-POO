package com.mycompany.cuenta;
 public class CuentaCorriente extends Cuenta {
    public double saldodispo;
    public double  intereses = 0.07;
    public CuentaCorriente(String titular, double saldo) {
        super(titular);
        this.saldodispo = saldodispo;
    }
    public void mostrarSaldo() {
        System.out.println("Su saldo en esta cuenta es: " + saldodispo);
    }
    public void mostrarTipoInteres() {
        double inte = saldodispo * intereses;
        System.out.println("Los intereses son de: " + inte);
    }
}
