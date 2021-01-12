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
            return this.add(value);
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
        
        String temp = current.getValue();

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
/*
*@postcondition: All of the elements from other are removed from the other, and connected to the end of this linked list.
*@postcondition: The size of other is reduced to 0.
*@postcondition: The size of this is now the combined sizes of both original lists
*/

    public void extend(MyLinkedList other){
        
        if (other.size!=0){

        Node abc = other.start.next();
        Node k = end;
        
        k.setNext(abc);
        abc.setPrev(k);
        end = other.end;
        
        size += other.size;
        
        other.start = new Node(null);
        other.end = other.start;

        other.size = 0;
        
        }

    }

    public String remove(int index){
        
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("Bad Index");
        }
        
        Node output;
        Node connection;

        if (index == size-1){
            output = end;
            end = output.prev();
            end.setNext(null);            
            size--;
            return output.getValue();
        }

        Node current = start;
        for(int i = 0; i<index; i++){
            current = current.next();
        }
        
        output = current.next();
        connection = output.next();

        current.setNext(connection);
        connection.setPrev(current);

        size--;

        return output.getValue();
    }


//Any helper method that returns a Node object MUST BE PRIVATE!
}
