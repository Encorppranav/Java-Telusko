import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer
{
     String name;
     int age;
    long avg;

   public Cricketer(String name , int age, long avg)
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

}


//class Alpha1 implements Comparator<Cricketer>
//{
//    @Override
//    public int compare(Cricketer o1, Cricketer o2) {
//        if(o1.avg > o2.avg)
//            return 1;
//
//        else return -1;
//    }
//}



public class LaunchComplexSorting1 {


    public static void main(String[] args) {

        Cricketer  c1 = new Cricketer("Virat",35,81);
        Cricketer  c2 = new Cricketer("Hardik",32,78);
        Cricketer  c3 = new Cricketer("Rohit",34,91);

        ArrayList<Cricketer> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println(list);

        System.out.println("***********************");

//         Alpha1 a = new Alpha1();

//       Comparator<Cricketer> c = new Comparator<Cricketer>() //Anonymous Inner Class
//       {
//           @Override
//           public int compare(Cricketer o1, Cricketer o2) {
//               if(o1.avg > o2.avg)
//                   return 1;
//
//               else return -1;
//           }
//       };

        //Lambda Expression
        Comparator<Cricketer> c = (Cricketer o1 , Cricketer o2) -> {


            if(o1.avg > o2.avg)
                return 1;

            else return -1;
        };


       Collections.sort(list,c);
        System.out.println(list);

    }




}
