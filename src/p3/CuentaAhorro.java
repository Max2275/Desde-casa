package p3;

public class CuentaAhorro extends CuentaCorriente {

private double interesAhorro;

    public CuentaAhorro(Titular titular, String numeroCuenta, double saldo, double interes) {
        super(titular, numeroCuenta, saldo);
        this.interesAhorro =interes;
    }

    public CuentaAhorro(Titular titular, String numeroCuenta, double interes) {
        super(titular, numeroCuenta);
        this.interesAhorro = interes;
        setSaldo(15.3);
    }

    public CuentaAhorro(Titular titular, String numeroCuenta) {
        super(titular, numeroCuenta);
        setSaldo(15.3);
        interesAhorro =2.5;
    }

    public double getInteresAhorro() {
        return interesAhorro;
    }
    public void calcularInteres() {

        int contador = 0;
        contador++;
        double total_Interes = 0;
        for (int i = 0; i < contador; i++) {
            total_Interes = total_Interes + (getSaldo() * this.interesAhorro / 100);
        }
        setSaldo(getSaldo() + total_Interes);
    }

}
