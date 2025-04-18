package views;

import java.util.Scanner;

import models.Persona;


public class ViewConsole {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("");
    }

    public void showMessage(String message){
        System.out.println(message);
    }



    public int getAge(){
        System.out.println("Ingrese la edad que quiere encontrar: ");
        int edad = scanner.nextInt();
        System.out.println("Edad Ingresada: "+edad);
        return edad;
    }
    
    public void imprimirArreglo(Persona[] personas){
        for(Persona persona : personas){
            System.out.print("\n |"+persona.getAge()+"|"+" ");
        }
    }
}
