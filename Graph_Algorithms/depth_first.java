package Graph_Algorithms;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


public class depth_first {
    public void run(){
// graph adjacency list
HashMap<Integer, LinkedList<Integer>> adjList;
adjList = new HashMap<>();

// adjList.put(1,new LinkedList<>());
adjList.put(0, new LinkedList<>(Arrays.asList( 1, 2)));
adjList.put(1, new LinkedList<>(Arrays.asList( 3)));
adjList.put(2, new LinkedList<>(Arrays.asList( 4)));
adjList.put(3, new LinkedList<>(Arrays.asList( 5)));
adjList.put(4, new LinkedList<>(Arrays.asList( )));
adjList.put(5, new LinkedList<>(Arrays.asList( )));      

DFPrint(adjList, 0);
    }
  
// FIX ME         
    void DFPrint( HashMap<Integer,LinkedList<Integer>> adjList, int startNode){
    Stack <Integer> mystack =  new Stack<>();
    mystack.push(startNode);
    while(mystack.size() > 0){
    int current = mystack.pop();
    Iterator it = adjList.entrySet().iterator();
    while(it.hasNext()){
        HashMap.Entry pair = (HashMap.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        mystack.push(pair.getValue());
    }
    System.out.println(current);
    }
    }
    }
