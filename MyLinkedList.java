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
            return true;
        }
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

            if (size == 0){
                return "[]";
            }

        String out = "[" + start.getValue();

        Node current = start;

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
