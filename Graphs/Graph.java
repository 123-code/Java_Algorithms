
package Graphs;
import java.util.ArrayList;
public class Graph{

// list of nodes in the graph   
ArrayList<Node> nodes = new ArrayList<Node>();
public int matrix [][];

public Graph(){

}


// creates graph using matrix approach.
 
    public void setgraph(int vertices,int edges){
        matrix = new int[vertices][edges];

    }



    public void createnode(String name){
        Node node = new Node();
        node.SetName(name);
        node.setconnected(false);
        node.setconnectedto(null);
        nodes.add(node);

    }

    public void addconnection(int _vertices,int _edges){
        // 1 means there is a connection between edges, 0 means there isnt a connection.
matrix[_vertices][_edges] = 1;
for(int i=0;i<nodes.size();i++){
    if(nodes.get(i).getName().equals(_vertices) && nodes.get(i).getName().equals(_edges)){
        nodes.get(i).setconnected(true);
        nodes.get(i).setconnectedto(nodes.get(_edges));
    }
}
System.out.println("Proceso conexion finalizado.");



    }

    public boolean checkconnection(int vertices, int edges){
        boolean connection = false;
       
                if(matrix[vertices][edges] == 1 && matrix[vertices][edges] == 1){
                    connection = true;

                }
                else connection = false;

         
        return connection;

    }

   

    public void addnodes(){
        Graph graph = new Graph();

        // create node with info as parameter.
        graph.createnode("Jose");
        graph.addconnection(0,0);


    }
}   
