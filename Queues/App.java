package Queues;

import java.util.Scanner;


public class App {
    
  Scanner scan = new Scanner(System.in);
  Queue cola = new Queue();

    public void main(String[] args) throws Exception {
      
      int op;
      do{
        System.out.println("1 Ingresar Nombre 2. Eliminar persona 3. Salir");
        op = Integer.parseInt(scan.nextLine());
switch(op){

      case 1:
        String nombre = scan.nextLine();
        Persona persona = new Persona();
        persona.setNombre(nombre);
        int edad = Integer.parseInt(scan.nextLine());
        persona.setEdad(edad);
        cola.Queuein(persona);
        System.out.println(""+cola.toString());
        break;
        
        case 2:
        cola.Queueout();
        System.out.println(""+cola.toString());
        break;

        case 3:
        
}
            
      }while(op!=3);
        
    }
}
