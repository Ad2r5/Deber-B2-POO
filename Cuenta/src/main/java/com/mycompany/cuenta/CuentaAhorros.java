package com.mycompany.cuenta;

 public class CuentaAhorros extends Cuenta {
    public double saldodispo;
    public double intereses = 0.05; 
    public CuentaAhorros(String titu, double saldo) {
        super(titu);
        this.saldodispo = saldo;
    }
    public void mostrarSaldo() {
        System.out.println("Su saldo en esta cuenta es : " + saldodispo);
    }

    public void mostrarTipoInteres() {
        double interesAplicado = saldodispo * intereses;
        System.out.println("Los intereses son de: " + interesAplicado);
    }
}
