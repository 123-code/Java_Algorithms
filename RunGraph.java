import Graphs.Graph;
import java.util.Scanner;

public class RunGraph {
    public static void main(String[] args) {
        // TODO code application logic here
Graph graph = new Graph();
Scanner scan = new Scanner(System.in);

        int op;
        do{
            System.out.println("1. Crear grafo 2. Agregar nodos 3. Agregar conexiones 4. Comprobar Conexión 5. Salir");
            op = Integer.parseInt(scan.nextLine());
            switch(op){
                case 1:
                int vertices;
                int edges;
                System.out.println("Ingrese el numero de vertices");
                vertices = Integer.parseInt(scan.nextLine());
                System.out.println("Ingrese el numero de aristas");
                edges = Integer.parseInt(scan.nextLine());
                graph.setgraph(vertices,edges);
                    break;

                    // creates new graph node
                case 2:
                String name;
                System.out.println("Nombre del nodo");
                name = scan.nextLine();
                graph.createnode(name);
                    break;

                case 3:
                System.out.println("Nodo 1 a agregr a conexion");
                int _vertices = Integer.parseInt(scan.nextLine());
                System.out.println("Nodo 2 a agregr a conexion");
                int _vertices1 = Integer.parseInt(scan.nextLine());

                if(graph.checkconnection(_vertices,_vertices1)==true){
                    System.out.println("ya esxiste la conexión");
                }
                else{
                graph.addconnection(_vertices,_vertices1);
            }
                    break;

            case 4:
            System.out.println("COMPROBACION DE CONEXIONES");
            System.out.println("Nodo 1 a comprobar la conexion");
            int vertices1 = Integer.parseInt(scan.nextLine());
            System.out.println("Nodo 2 a comprobar la conexion");
            int vertices2 = Integer.parseInt(scan.nextLine());

            if(graph.checkconnection(vertices1,vertices2)==true){
                System.out.println("Existe la conexion");
            }
            else if(graph.checkconnection(vertices1,vertices2)==false){
                System.out.println("No existe la conexion");
            }
            

            break;

 

                


                
                    
                case 5:
                    System.out.println(""+graph.toString());
                    break;
            }
        }while(op!=4);

    }
}
