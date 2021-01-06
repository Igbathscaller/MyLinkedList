public class MyLinkedList{
    
    private int size;
    
    private Node start,end;  
    
    public MyLinkedList(){
        size = 0;
        start = null;
        end = null;
    }
    
    public int size(){
        return size;
    }
    
    public boolean add(String value){
        Node abc = new Node(value);
        if (size == 0){
            start = abc;
            end = abc;
            return true;
        }
        else{
            Node k = end;
            k.setNext(abc);
            abc.setPrev(k);
            end = abc;
            size++;
        } 
    }
    
    public boolean add(int index, String value){
        return null;
    }
    
    public String get(int index){

    }
    
    public String set(int index, String value){

    }
    
    public String toString(){

    }
//Any helper method that returns a Node object MUST BE PRIVATE!
}
