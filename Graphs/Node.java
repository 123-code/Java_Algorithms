package Graphs;

public class Node
{
    private String Name;
    public boolean connected;
    private Node connectedto;



public Node(){
    

}

    public void setconnectedto(Node connectedto){
        this.connectedto = connectedto;
    }
    
    public Node getconnectedto(){
        return connectedto;
    }
    
 
public void setconnected(boolean  value){
    connected = value;
}

public boolean getconnected(){
    return connected;
}

public String getName(){
    return Name; 
}

public void SetName(String _Name){
this.Name = _Name;
}





}