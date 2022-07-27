public class Node{
    public int data;
     public Node left;
     public Node right;
 
     public Node(int data){
         this.data = data;
         left = null;
         right = null;
     }
 
     public int getData(){
         return data;
     }
 
     public Node getLeft(){
         return left;
     }
 
     public Node getRight(){
         return right;
     }
 
     public void setData(int data){
         this.data = data;
     }
 
     public void setLeft(Node left){
         this.left = left;
     }
 
     public void setRight(Node right){
         this.right = right;
     }
     
     
     public static void inorden(Node node){
         if(node==null)
             return;
         
         inorden(node.left);
         
         System.out.println(""+ node.data);
         
         inorden(node.right);
                
     }
     
     
     public static Node unirArboles(Node t1,Node t2){
         // si esta vacio, no hay suma y se retorna el otro elemento.
         if(t1==null)
             return t2;
         
         if(t2==null)
             return t1;
         
         // se suma el primer y segundo arbol 
         t1.data+=t2.data;
         // se usa recursividad y no un ciclo repetitivo 
         t1.left = unirArboles(t1.left,t2.left);
         t1.right = unirArboles(t1.right,t2.right);
         return t1;
         
                     
     }
 
 
 }
 
 