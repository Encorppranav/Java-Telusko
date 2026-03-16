import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer1 implements Comparable<Cricketer1>
{
    String name;
    int age;
    long avg;

    public Cricketer1(String name , int age, long avg)
    {
        super();
        this.name = name;
        this.age = age;
        this.avg = avg;
    }

    @Override

    public String toString()
    {
        return "Cricketer [Name-"+name+" Age-"+age+" Avg-"+avg+"]";
    }

    public int compareTo(Cricketer1 o)
    {
        if(this.avg > o.avg) return 1;
        else return -1;
    }

}






public class LaunchComplexSorting2 {


    public static void main(String[] args) {

        Cricketer1  c1 = new Cricketer1("Virat",35,81);
        Cricketer1  c2 = new Cricketer1("Hardik",32,78);
        Cricketer1  c3 = new Cricketer1("Rohit",34,91);

        ArrayList<Cricketer1> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println(list);

        System.out.println("***********************");

            Collections.sort(list);
        System.out.println(list);

    }




}

