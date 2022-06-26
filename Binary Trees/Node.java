package Binary Trees;

public class Node {
    
        private  Empleado dato;
        private Node izquierdo;
        private Node derecho;
    
      public Node(){
          
      }  
      public void setDato(Empleado dato){
          this.dato=dato;
      }

      public Empleado getDato(){
          return dato;
      }

      public void setIzquierdo(Node izquierdo){
          this.izquierdo=izquierdo;
      }

      public Node getIzquierdo(){
          return izquierdo;
      }

      public void setDerecho(Node derecho){
          this.derecho=derecho;
      }

      public Node getDerecho(){
          return derecho;
      }
    }
    
