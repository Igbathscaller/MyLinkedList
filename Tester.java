public class Tester {
    public static void main(String[]args){
        MyLinkedList Bob = new MyLinkedList();
        System.out.println(Bob);
        Bob.add("hi");
        System.out.println(Bob);
        Bob.add("what up my dudes?");
        System.out.println(Bob);
        Bob.add(0,"Terrible");
        System.out.println(Bob);
    }
}
