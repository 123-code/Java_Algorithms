package LinkedLists;
public class CLinkedlist{
// linked lists make references to a previous node.
public Node head = null;
public Node tail = null;


public void adddata(int data){
    // creates new node and adds a header.
    Node nn = new Node(data);

    // checks node has data.
    if(head == null){
        // sets header and pointer to the same node value.
head = nn;
tail = nn ;
    }
    else{
        tail.next = nn;
        tail=nn;
        tail.next = head;
        
    }
    
}
}