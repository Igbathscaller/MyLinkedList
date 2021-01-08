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
        MyLinkedList David = new MyLinkedList();
        David.add("1");
        David.add("2");
        David.add("One");
        Bob.extend(David);
        System.out.println(Bob);
        System.out.println(Bob.size());
        System.out.println(David);
        System.out.println(David.size());
        David.add("twelve");
        System.out.println(David);
        System.out.println(David.size());
    }
}
