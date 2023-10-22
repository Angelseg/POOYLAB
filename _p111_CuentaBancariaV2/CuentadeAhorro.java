package _p111_CuentaBancariaV2;

public class CuentadeAhorro extends CuentaBancaria {
    private double TasaInteres;

    public CuentadeAhorro(double saldo, double tasaInteres) {
        super(saldo);
        TasaInteres = tasaInteres;
    }


    public void calcularInteres() {
        Saldo += Saldo * TasaInteres;
    }

    
    public boolean retira(double cantidad) {
        if( Saldo >= cantidad) {
            Saldo -= cantidad;
        return true;
    }
    else
        return false;
    }
    
    public String toString() {
        return "CuentaDeAhorro [ " + super.toString() + ",TasaInteres = " + TasaInteres + " ]";
    }
}
