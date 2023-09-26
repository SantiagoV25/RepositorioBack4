import java.util.Random;

public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = generarNumeroDeCuentaAleatorio();
    }

    private long generarNumeroDeCuentaAleatorio() {
        Random random = new Random();
        return Math.abs(random.nextLong()); //
    }

    public void setIngreso(double cantidad) {
        if (cantidad > 0) {
            saldoDeCuenta += cantidad;
            System.out.println("Se realizó un ingreso de $" + cantidad);
        } else {
            System.out.println("La cantidad de ingreso debe ser mayor que cero.");
        }
    }

    public void setRetiro(double cantidad) {
        if (cantidad > 0 && cantidad <= saldoDeCuenta) {
            saldoDeCuenta -= cantidad;
            System.out.println("Se realizó un retiro de $" + cantidad);
        } else if (cantidad <= 0) {
            System.out.println("La cantidad de retiro debe ser un número mayor a cero.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }
    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }

    public void getDatosCuenta() {
        System.out.println("Número de la Cuenta: " + numeroDeCuenta);
        System.out.println("Titular de la Cuenta: " + nombreDelTitular);
        System.out.println("Saldo de la Cuenta: $" + saldoDeCuenta);
    }
}