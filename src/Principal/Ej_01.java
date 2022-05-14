/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
 * en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
 * quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Principal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<String> raza = new ArrayList();
        String dato;
        do {
            System.out.print("Ingrese la raza del perro: ");
            raza.add(leer.next());
            System.out.println("¿Desea guardar otro perro?(S/N)");
            dato = leer.next();
        }
        while(dato.equals("S"));
        
        System.out.println("<<<< Perros Guardados >>>>");
        System.out.println("Cantidad: "+raza.size());
        System.out.println(raza.toString());
    }
    
}
