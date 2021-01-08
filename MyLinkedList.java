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

        if (index<0 || index>size){
            throw new IndexOutOfBoundsException("Bad Index");
        }

        if (index==size){
            this.add(value);
            return true;
        }
        
        Node abc = new Node(value);
        Node current = start;
        for( int i = 0; i < index; i++ ){
            current = current.next();
        }

        //temp value
        Node following = current.next();
        
        //Chain current -> abc
        current.setNext(abc);
        abc.setPrev(current);
        //Chain abc -> following
        abc.setNext(following);
        following.setPrev(abc);
        size++;
        return false;
    }
    
    public String get(int index){
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("Bad Index");
        }
        Node current = start;
        for( int i = 0; i < index; i++ ){
            current = current.next();
        }
        return current.next().getValue();
    }
    
    public String set(int index, String value){
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("Bad Index");
        }
        Node current = start;
        for( int i = 0; i < index; i++ ){
            current = current.next();
        }
        current = current.next();
        
        String temp = current.toString();

        current.setValue(value);

        return temp;

    }
    
    public String toString(){

        String out = "[";

        Node current = start;
        
        //Start is a header and has absolutely nothing.

        while( current.hasNext() ){
            current = current.next();
            out += current.getValue();
            if ( current.hasNext() ){
                out += ", ";
            }
        }

        return out + "]";
    }

    public String toStringReversed(){
        String out = "[";

        Node current = end;
        
        //Start is a header and has absolutely nothing.

        for(int i = 0; i<size; i++){
            out += current.getValue();
            current = current.prev();
            if ( i < size-1 ){
                out += ", ";
            }
        }

        return out + "]";
    }

//Any helper method that returns a Node object MUST BE PRIVATE!
}
