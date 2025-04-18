import java.util.Scanner;

import controllers.MetodoBusqueda;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el numero de personas: ");
        int numeroDePersonas = scanner.nextInt();
        
        Persona[] persona = new Persona[numeroDePersonas];

        System.out.println("---------Ingreso de Personas--------");

        for (int i = 0; i < numeroDePersonas; i++) {
            System.out.println("\nPersona " + (i + 1) + ":");
            
            Persona persona2 =new Persona();
            System.out.println("Edad: ");
            persona2.setAge(scanner.nextInt());
            scanner.nextLine();
            
            System.out.println("Nombre: ");
            persona2.setNombre(scanner.nextLine());

           persona[i]=persona2; 
    
        }
        MetodoBusqueda mBusqueda = new MetodoBusqueda(persona);
        mBusqueda.showPersonByAge();
    }    
}
