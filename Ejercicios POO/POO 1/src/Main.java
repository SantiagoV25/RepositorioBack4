import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona p1 = new Persona("Lugel", 27, "112345689");

        personas.add(p1);

        personas.add(new Persona("Camilo", 28, "122345689"));


        for (int i = 0; i<personas.size(); i++){
            System.out.println(personas.get(i).mostrar());
        }
                    

    }
}