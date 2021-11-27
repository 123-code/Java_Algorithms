import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
      


        
       String nombre; 

     do{
        System.out.println("Ingrese el nombre");
        nombre = scanner.nextLine();
     }while(nombre.length()<3);
       


    String apellido;
    do{
        System.out.println("Ingrese el apellido");
        apellido = scanner.nextLine();
    }while(apellido.length()<3);


int anio;
do{
        System.out.println("Ingrese anio");
        anio = scanner.nextInt();
}while(anio<1900 || anio>2021);


int mes;
do{
        System.out.println("Ingrese mes");
        mes = scanner.nextInt();
}while(mes<1 || mes>12);


int dia;
do{

        System.out.println("Ingrese dia");
        dia = scanner.nextInt();
}while(dia<1 || dia>31);


System.out.println("----INFORMACION CARDIACA------");
         
        FrecuenciaCardiaca frecuenciaCardiaca = new FrecuenciaCardiaca(nombre, apellido, dia, mes, anio);

        System.out.println("Edad:\n");
        System.out.println(frecuenciaCardiaca.calculaedad(dia,mes,anio));

        System.out.println("Frecuencia cardiaca:\n");
        double fmax = frecuenciaCardiaca.Devuelvefcardiaca(frecuenciaCardiaca.calculaedad(dia,mes,anio));
        System.out.println(fmax);

System.out.println("Frecuencia Esperada:\n");
System.out.println(frecuenciaCardiaca.getesperada(fmax));

scanner.close();
    }
    
}
