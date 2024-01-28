package p3;

import p3.Titular;

public abstract class CuentaCorriente {

protected Titular titular;

protected String numeroCuenta;
protected double saldo;

    public CuentaCorriente(Titular titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Titular titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        saldo=15.3;
    }



    public Titular getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso (double cantidad){
        saldo=saldo+cantidad;
    }

    public void reintegro (double cantidad){

        setSaldo(saldo-cantidad);
    }

    @Override
    public String toString() {
        return "p3.CuentaCorriente{" +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public boolean  compararCuentas (String otraCuenta){
        int resultado = this.numeroCuenta.compareToIgnoreCase(otraCuenta);
        return resultado==0;
    }


}
