package RoundRobin;

public class Persona {
    private String Nombre;
    private int edad;

    public Persona(String Nombre,int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
