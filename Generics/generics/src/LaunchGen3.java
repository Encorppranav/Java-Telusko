import java.util.ArrayList;
import java.util.List;

class Human {
    int age;

   public void disp(){
       System.out.println("We are Humans");
   }
}

class Student extends Human{}

class Employee{}



public class LaunchGen3 {
    public static void main(String[] args) {

        ArrayList<Human> hlist1 = new ArrayList<>();
        ArrayList<Student> slist1 = new ArrayList<>();

        //hlist1 = slist1;//compile time error (ce)

        ArrayList<?> hlist2 = new ArrayList<>();//unknown --> Wild Card(Can Access All)
        ArrayList<Student> slist2 = new ArrayList<>();
        ArrayList<Employee> elist2 = new ArrayList<>();
        ArrayList<Object> olist2 = new ArrayList<>();

        hlist2 = elist2;
        hlist2 = slist2;
        hlist2 = olist2;

        ArrayList<? extends Human> hlist3 = new ArrayList<>();//UpperBounding(Parent or its lower)
        ArrayList<Student> slist3 = new ArrayList<>();
        ArrayList<Employee> elist3 = new ArrayList<>();
        ArrayList<Object> olist3 = new ArrayList<>();

       // hlist3 = elist3;//ce
        //hlist3 = olist3;//ce
        hlist3 = slist3;

        ArrayList<? super Human> hlist4 = new ArrayList<>();//LowerBounding(Parent or its higher)
        ArrayList<Student> slist4 = new ArrayList<>();
        ArrayList<Employee> elist4 = new ArrayList<>();
        ArrayList<Object> olist4 = new ArrayList<>();

        // hlist4 = elist4;//ce
        hlist4 = olist4;
        //hlist4 = slist4;//ce

        ArrayList<Human> hlist = new ArrayList<>();

        hlist.add(new Human());
        hlist.add(new Human());
        hlist.add(new Human());

        invokeDisp(hlist);

        System.out.println("***********************");

        ArrayList<Student> slist = new ArrayList<>();

        slist.add(new Student());
        slist.add(new Student());
        slist.add(new Student());

        invokeDisp(slist);









    }

    public static void invokeDisp(List<? extends Human> list)
//    public static void invokeDisp(List<Human> list)
    {
        for(Human h: list)
        {
            System.out.println(h);
        }
    }
}
