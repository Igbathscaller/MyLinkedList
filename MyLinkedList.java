public class MyLinkedList{
    
    private int size;
    
    private Node start,end;  
    
    public MyLinkedList(){
        size = 0;
        start = new Node(null);
        end = start;
    }
    
    public int size(){
        return size;
    }
    
    public boolean add(String value){
        Node abc = new Node(value);
        Node k = end;
        k.setNext(abc);
        abc.setPrev(k);
        end = abc;
        size++;
        return true;
    }
    
    public boolean add(int index, String value){
        return false;
    }
    
    public String get(int index){
        return null;
    }
    
    public String set(int index, String value){
        return null;
    }
    
    public String toString(){

        String out = "[";

        Node current = start;
        
        //Start is a header and has absolutely nothing.

        while( current.hasNext() ){
            current = current.next();
            out += current.getValue();
            if ( current.hasNext() ){
                out += ',';
            }
        }

        return out + "]";
    }

//Any helper method that returns a Node object MUST BE PRIVATE!
}
