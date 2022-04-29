package Queues;
import Queues.ArrayList.Queue;
import java.util.Scanner;
public class App {
    
    public void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
        Queue cola = new Queue();
      int op;
      do{
        System.out.println("1 Ingresar Nombre 2. Eliminar persona 3. Salir");
        op = Integer.parseInt(scan.nextLine());
switch(op){

      Case 1:
        String nombre = scan.nextLine();
        Persona persona = new Persona();
        persona.setNombre(nombre);

        int edad = Integer.parseInt(scan.nextLine());
        persona.setEdad(edad);
        break;
        
        Case 2:
        
}
            
      }while(op!=3);
        
    }
}
