package RoundRobin;
import java.util.Scanner;
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
                    System.out.println("Ingrese nombre");
                    String nombre = scan.next();
                    System.out.println("Ingrese edad");
                    int edad = scan.nextInt();
                    Persona p = new Persona(nombre, edad);
                    cola.add(p);
                    break;

                case 2:
                     System.out.println("Nombre a eliminar: ");
                     String nombreEliminar = scan.next();

                        for(int i = 0; i < cola.size(); i++){
                            if(cola.get(i).getNombre().equals(nombreEliminar)){
                                cola.removeindex(i);
                            }
                        }

                    break;

                case 3:
                

                    
            }

        }while(opc != 4);

    }
}
