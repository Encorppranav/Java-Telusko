import java.util.LinkedList;

public class LaunchLinkedList {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add(50);
        ll.add("Telusko");
        ll.add(45.6);
        ll.add('c');
        ll.add(25);
        ll.add(175);

        System.out.println(ll);


        ll.addFirst("Pranav");

        System.out.println(ll.offer(""));
        System.out.println(ll.poll());



    }

}
