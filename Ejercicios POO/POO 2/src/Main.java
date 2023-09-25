// Elaborado por Santiago Vargas
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Santiago Vargas", 1250.0);
        Cuenta cuenta2 = new Cuenta("David Farfán", 700.0);
        Cuenta cuenta3 = new Cuenta();


        System.out.println("\nDatos de la Cuenta 1:\n");
        cuenta1.mostrar();

        System.out.println("\nDatos de la Cuenta 2:\n");
        cuenta2.mostrar();

        System.out.println("\nDatos de la Cuenta 3:\n");
        cuenta3.mostrar();

        cuenta1.ingresar(500.0);
        cuenta2.retirar(200.0);
        cuenta3.retirar(200.0);


        System.out.println("\nDatos de la Cuenta 1 después del ingreso de dinero:\n");
        cuenta1.mostrar();

        System.out.println("\nDatos de la Cuenta 2 después del retiro de dinero:\n");
        cuenta2.mostrar();
    }
}