
/*un método que calcule y devuelva la 
frecuencia cardiaca máxima de esa persona, y 
otro método que calcule y devuelva
la frecuencia cardiaca esperada de la persona.*/
import java.util.Calendar;

public class FrecuenciaCardiaca {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;
    private int frecuenciaCardiacaMaxima;
    private int[] frecuencias;


    // create constructor.
    public FrecuenciaCardiaca(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

// getter and setter
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public int getDia() {
    return dia;
}

public void setDia(int dia) {
    this.dia = dia;
}

public int getMes() {
    return mes;
}

public void setMes(int mes) {
    this.mes = mes;
}

public int getAnio() {
    return anio;
}

public void setAnio(int anio) {
    this.anio = anio;
}

public double getFrecuenciaCardiacaMaxima() {
    return frecuenciaCardiacaMaxima;
}

public void setFrecuenciaCardiacaMaxima(int frecuenciaCardiacaMaxima) {
    this.frecuenciaCardiacaMaxima = frecuenciaCardiacaMaxima;
}

public int[] getFrecuencias() {
    return frecuencias;
}

public void setFrecuencias(int[] frecuencias) {
    this.frecuencias = frecuencias;
}

public int calculaedad(int dia, int mes, int anio) {
    int canio = Calendar.getInstance().get(Calendar.YEAR);
    int edada = canio - anio;

    int cmes = Calendar.getInstance().get(Calendar.MONTH);
    int cdia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

    int edadm = cmes - mes;
    int edadd = cdia - dia;


System.out.println("Edad:");
System.out.println("Anios" +  " " + edada + " " + "Meses" + " "+ edadm +" " +  "Dias" + edadd);
return edada;
}


public double Devuelvefcardiaca(int edad){
    
double fcardiaca = 220 - edad;
return fcardiaca;
}

public double getesperada(double fcardiaca){
return fcardiaca * 0.5;
}


}