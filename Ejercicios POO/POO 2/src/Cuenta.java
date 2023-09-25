public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
        this.titular = "Sin titular";
        this.cantidad = 0.0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Cantidad: " + this.cantidad);
    }

    public void ingresar(double saldoIngresado) {
        if (saldoIngresado > 0) {
            this.cantidad += saldoIngresado;
        }
    }

    public void retirar(double saldoRetirar) {
        if (saldoRetirar > 0) {
            if (saldoRetirar <= this.cantidad) {
                this.cantidad -= saldoRetirar;
            } else {
                System.out.println("Fondos insuficientes");
            }
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}