package RoundRobin;
import java.util.ArrayList;

public class queue {
    private ArrayList<Persona> queue;

    public queue() {
        queue = new ArrayList<Persona>();
    }

    public void add(Persona p) {
        queue.add(p);
    }

    public Persona remove() {
        return queue.remove(0);
    }

    public Persona removeindex(int index) {
        return queue.remove(index);
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public Persona get(int i) {
        return queue.get(i);
    }

/*
    String [] Nombre={};
    public String values(){
        
        for(int i=0;i<queue.size();i++){
            Nombre = queue.get(i).getNombre().toString();
            Nombre[i] = Nombre;
        }
        return Nombre;
    }
  */
  
}
