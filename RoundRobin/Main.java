package RoundRobin;
import java.util.Scanner;
import RoundRobin.Persona;
import RoundRobin.queue;


public class Main {
        



    public void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        queue cola = new queue();
        int opc;

        do{
            System.out.println("1. Agregar persona 2. Eliminar persona 3. Mostrar cola 4. Salir");
            opc = scan.nextInt();

        switch(opc){
            case 1:
            // new persona created and added to queue
                System.out.println("El valor quantum es de 3 segundos.\n");
                System.out.println("Ingrese nombre");
                String nombre = scan.next();
                System.out.println("Ingrese edad");
                int edad = scan.nextInt();
                Persona p = new Persona(nombre, edad);
                cola.add(p);


                break;

            case 2:
            // removes served element from queue
                cola.remove();
                break;
            case 3:
                System.out.println(cola.toString());
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            
        }

        }while(opc != 4);

    }

    public void RoundRobin(int qtm,int burst_time){
        int elapsed = 0;
    
        do{
           
    
        }while(burst_time!=0);
    
    }
}
