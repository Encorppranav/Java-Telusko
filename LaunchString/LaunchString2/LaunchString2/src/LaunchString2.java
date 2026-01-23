//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Virat");

        StringBuilder sb2 = new StringBuilder("Virat");

//        s1.append(" Java");

//        String s1 = "Telusko";
//        s1 = s1.concat(" Java");
        int res = sb1.compareTo(sb2);
        System.out.println(sb1.compareTo(sb2));

        if(res==0)
            System.out.println("Both strings are equal");

        else System.out.println("Strings are not equal");

    }
}