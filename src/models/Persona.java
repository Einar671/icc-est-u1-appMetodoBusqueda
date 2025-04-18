package models;

public class Persona {
    private int age;
    private String nombre;


    public Persona(int age, String name){
        this.age=age;
        this.nombre=nombre;
    }

    public Persona(){
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [age=" + age + ", nombre=" + nombre + "]";
    }

    
}
