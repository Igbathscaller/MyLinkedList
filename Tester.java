public class Tester {
    public static void main(String[]args){
        MyLinkedList Bob = new MyLinkedList();
        System.out.println(Bob);
        System.out.println(Bob.size());
        Bob.add("hi");
        System.out.println(Bob);
        System.out.println(Bob.size());
        Bob.add("what?");
        System.out.println(Bob);
        System.out.println(Bob.size());
        Bob.add(0,"Terrible");
        System.out.println(Bob);
        System.out.println(Bob.size());
        Bob.add(2,"Listen");
        System.out.println(Bob.get(2));
        System.out.println(Bob);
        System.out.println(Bob.size());
        Bob.set(2,"one");
        System.out.println(Bob.get(2));
        System.out.println(Bob);
        System.out.println(Bob.size());
        
    }
}
