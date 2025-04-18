package controllers;

import models.Persona;

public class MetodoOrdenamiento {

    private Persona[] people;

    public MetodoOrdenamiento(Persona[] personas) {
        this.people = personas;
    }

    public void sortByAge() {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() > people[j + 1].getAge()) {
                    // Intercambiar
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

}
