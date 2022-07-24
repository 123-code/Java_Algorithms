 //package Binary Binary Trees;
 
public class Node{
   public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

    public int getData(){
        return data;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public void setRight(Node right){
        this.right = right;
    }


}