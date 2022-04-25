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

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public Persona get(int i) {
        return queue.get(i);
    }

    public void removeatindex(String dato){
        for(int i=0;i<queue.size();i++){
            if(queue.get(i).getNombre()==dato){
                queue.remove(i);
            }
            else{
                System.out.println("Not in Queue");
            }
            
        }
        
    }
    }

    

