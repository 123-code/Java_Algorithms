public class BinaryTree {

public Node root;

public BinaryTree(){
    root = null;
}
public void preorder(){
    if(root != null){
        System.out.println("root:" + root);
        do{

        }while(node.getData() != null);

    }
    else if(root == null){
        System.out.println("tree is empty");
    }

}

// insert nodes, starting from the left. 
public void insert(Node node,int data){
    if(data > node.getData()){
        if(node.getLeft()!=null){
insert(node.left,data);
        }
        else if(node.getData()>data){

            if(node.right != null){
                insert(node.right,data);
            }
            else{
                node.right = new Node(data);
            }
            
        }

    }
  

}


public void insertright(Node node,int data){
    if(data>node.getData()){
        if(node.right != null){
           insertright(node.right,data);
        }
        else{
            node.right = new Node(data);

        }
        

    }
    else if(node.getData()>data){
        if(node.left!= null){
            insertright(node.left,data);
        }

        else{
            node.left = new Node(data);
        }

    }

}

public void run(){
    Node rootnode = new Node(1);
    System.out.println("Inserting nodes");
    insert(rootnode,2);
    insert(rootnode,3);
    insert(rootnode,5);
    insert(rootnode,7);
}
    /*
     * 
     *   private NodoArbol raiz;

    public Tree(){
        raiz=null;
    }

  public Arbol(Empleado nuevo){
raiz = new NodoArbol(nuevo,null,null);
  }  


public void insertar(NodoArbol nuevo,NodoArbol actual){

if(nuevo.getDato().getCodigo()<actual.getDato().getCodigo()){
    if(actual.getIzquierdo()==null){
        actual.setIzquierdo(nuevo);
    }
    else{
        insertar(nuevo,actual.getIzquierdo());
    }
    else{
        if(actual.getDerecho()==null){
            actual.setDerecho(nuevo);
        }
        else{
            insertar(nuevo,actual.getIzquierdo());
        }
    }
}


}

   
  public void insertarelementos(Empleado nuevo){
insertarelementos(new NodoArbol(nuevo,null,null));
if(raiz==null){
    raiz = new NodoArbol(nuevo,null,null);
}
else
insertar(new NodoArbol(nuevo,null,null));
}

public void preorden(NodoArbol actual){

}

public void preorden(){
    if(!raiz!=null){
        preorden(raiz);
    }
}


     * 
     */
  

}
