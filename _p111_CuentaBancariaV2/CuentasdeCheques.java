package _p111_CuentaBancariaV2;

public class CuentasdeCheques extends CuentaBancaria{
    private double Sobregiro;

    public CuentasdeCheques(double saldo, double sobregiro) {
        super(saldo);
        Sobregiro = sobregiro;
    }

    public boolean retira(double cantidad) {
        if( Saldo >= cantidad)
            Saldo -= cantidad;
    else {
        double requerida = cantidad - Saldo;
        if( Sobregiro >= requerida ) {
            Saldo = 0;
            Sobregiro -= requerida;
        }
    }
        return true;
    }

    public String toString() {
    return "CuentaDeCheques [ " + super.toString() + ",Sobregiro = " + Sobregiro + " ]";
    }
}
