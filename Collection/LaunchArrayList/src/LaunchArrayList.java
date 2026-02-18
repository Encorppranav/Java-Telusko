import java.util.ArrayList;

public class LaunchArrayList {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        al.add(50);
        al.add(100);
        al.add(75);
        al.add(125);
        al.add(25);
        al.add(175);

        System.out.println(al);



        System.out.println(al.contains(51));//false
        System.out.println(al.contains(50));//true

        ArrayList al2  = new ArrayList();

        al2.addAll(al);
        System.out.println(al2);

        al2.add(3,10);
        System.out.println(al2);

        System.out.println(al2.contains(al));//false




    }
}