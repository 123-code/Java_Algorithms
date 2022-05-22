import java.util.ArrayList;
public class Queue {
    private ArrayList<Persona> personas;

public Queue(){
    personas = new ArrayList<Persona>();
}

public void Queuein(Persona persona){
personas.add(persona);
}

public void Queueout(){
    personas.remove(0);
}

public Persona peek(){
    return personas.get(0);
}

@Override
public String toString() {
    String resultado = " ";

for(int i=0;i<personas.size();i++){
resultado += personas.get(i).getNombre().toString()+"\n";
}

    return resultado;
}
    
}
