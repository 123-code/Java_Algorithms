import java.util.Random;   

/**
 *
 * @author joseignacionaranjo
 */
public class linkedlist {
   
    Random random = new Random();
    int [] numeros;
    
    Node ultimo;
  
    public linkedlist(){
        ultimo=null;
        
    }
    
    public boolean isempty(){
        return ultimo==null;
    }
    
    // insertar  nodos.
    public linkedlist insertar(int elemento){
       Node nuevo = new Node(elemento);
        if(ultimo  != null){
            // ya hay un nodo
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo = nuevo;
        return this;
                
    }
    // show list
    public int mostrarlista(){
        Node auxiliar = ultimo.siguiente;
        Integer cadena = null;
        
        do{
            cadena = cadena + auxiliar.dato;
        }while(auxiliar != ultimo.siguiente);
        System.out.println("" + cadena);
        return cadena;
    }
    
 public void mostrarnumeros(){
       int i=0;
    while(i<5){
   int numero = random.nextInt();
   numeros[i] = numero;
    i++;
}
 }
  
}
