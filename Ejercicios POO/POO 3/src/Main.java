public class Main {
        public static void main(String[] args) {
                Cuenta CuentaNueva = new Cuenta("Santiago Vargas", 1800.0);
                CuentaNueva.getDatosCuenta();
                CuentaNueva.setIngreso(2750.0);
                CuentaNueva.setRetiro(920.0);
                CuentaNueva.getDatosCuenta();
        }
}