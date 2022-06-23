package TA13;

public class Dueño {

    protected String nombre;
    protected int edad;
    protected int dni;

    public Dueño(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }
}
