public class Graph{

    Node node = new Node();

public int matrix [][];

public Graph(){

}


// creates graph using matrix approach.
 
    public void setgraph(int vertices,int edges){
        matrix = new int[vertices][edges];

    }

    public void addconnection(int _vertices,int _edges){
        // 1 means there is a connection between edges, 0 means there isnt a connection.
matrix[_vertices][_edges] = 1;

    }

    public void createnode(String name){
        Node node = new Node();
        node.SetName(name);


    }

    public boolean checkconnection(int vertices, int edges){
        boolean connection = false;
        for(int i=0; i<matrix[i].length;i++){
            for(int j=0; j<matrix[j].length;j++){
                if(matrix[i][j] == 1 && matrix[j][i] == 1){
                    connection = true;

                }
                else connection = false;

            }
        }
        return connection;

    }

   

    public void addnodes(){
        Graph graph = new Graph();

        // create node with info as parameter.
        graph.createnode("Jose");
        graph.addconnection(0,0);


    }
}   
