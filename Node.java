public class Node {
    public Node(String value){/*create a constructor*/
    
    }
    
    private String data;
    
    private Node next,prev;
    //write get/set methods for all three instance variables.

    public Node next(){
        return next;
    }

    public Node prev(){
        return prev;
    }

    public void setNext(Node ar){
        next = ar;
    }

    public void setPrev(Node ar){
        prev = ar;
    }
}
