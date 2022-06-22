public class Tree {
    private NodoArbol raiz;

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



}
