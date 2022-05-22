import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Queue cola = new Queue();
      
       
             
            int op;
            Persona persona = new Persona();
            String nombre;
            do{
              System.out.println("1 Ingresar Nombre 2. Eliminar persona 3. Salir");
              op = Integer.parseInt(scan.nextLine());
      switch(op){
      
            case 1:
              System.out.println("Ingrese nombre");
              nombre = scan.nextLine();
              persona.setNombre(nombre);
              cola.Queuein(persona);
              break;
            
              
              case 2:
              cola.Queueout();

              break;
      
              case 3:
              System.out.println(" "+cola.toString());
              break;

              case 4:
                System.out.println("ha salido!");
      }
                  
            }while(op!=4);
              
          }
}
