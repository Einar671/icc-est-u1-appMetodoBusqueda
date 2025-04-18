package controllers;

import models.Persona;
import views.ViewConsole;

public class MetodoBusqueda {
    private Persona[] persona;
    private ViewConsole showConsole;
    
    
    public MetodoBusqueda(Persona[] persona) {
        this.persona = persona;
        this.showConsole = new ViewConsole();
        showConsole.showMessage("Metodo de Busqueda Binario");
    }

    public int findPersonByCode(int age) {
        MetodoOrdenamiento  mO = new MetodoOrdenamiento(persona);
        mO.sortByAge();
        int bajo = 0;
        int alto = persona.length - 1;

        while (bajo <= alto) {
            for (Persona p : persona) {
                System.out.print(p.getAge() + " | ");
            }
            System.out.println();
            
        
            int central = bajo + (alto - bajo) / 2;
            System.out.print("bajo=" + bajo + "\talto=" + alto + "\tcentro=" + central +
    "\tvalorCentro=" + persona[central].getAge());

            
            if (persona[central].getAge() == age) {
                System.out.print("\t --> ENCONTRADO");
                return central;
            }
            if (persona[central].getAge() < age) {
                bajo = central + 1;
                System.out.print("\t --> DERECHA");
            } else {
                alto = central - 1;
                System.out.print("\t --> IZQUIERDA");
            }

        }
        return -1;
    }

    public void showPersonByAge(){
        boolean rep = true;
        while (rep == true) {
            int ageToFind = showConsole.getAge();
            int indexPerson = findPersonByCode(ageToFind);
            if (indexPerson == -1) {
                showConsole.showMessage("\n No hay persona con esa edad");
            } else {
                showConsole.showMessage("\n Persona con la edad "
                + ageToFind +" encontrada");
                showConsole.showMessage(persona[indexPerson].toString());
                rep = false;
                break;
            }
        }
    }
    
}