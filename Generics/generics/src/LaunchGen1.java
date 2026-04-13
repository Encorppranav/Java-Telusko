import java.util.ArrayList;


class Employees
{
    private String name;
    private int id;
    private double salary;

    public Employees(String name , int id , double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {return "Name:"+ name + ",id:"+id+ ",salary:"+salary; };
}

public class LaunchGen1 {

    public static void main(String[] args) {

         ArrayList al1 = new ArrayList();

         al1.add("Java");
         al1.add("Telusko");
//         al1.add(50);


//  not typeSafety
         String s1 = (String) al1.get(0);

            s1 = s1.toLowerCase();
        System.out.println(s1);


        String s2 = (String) al1.get(1);
         s2 = s2.toLowerCase();
        System.out.println(s2);
//
//        String s3 = (String) al1.get(2);
//         s3 = s3.toLowerCase();
//        System.out.println(s3);

        System.out.println("*----------------------*");

        //typesafety
    ArrayList<String> l1 = new ArrayList<>();

        l1.add("Java");
        l1.add("Telusko");
        l1.add("Microservices");

         for(String data:l1)
         {
             System.out.println(data);
         }


        System.out.println("************************");

         ArrayList<Employees> e1 = new ArrayList<> ();

         e1.add(new Employees("Pranav",50,25000));
        e1.add(new Employees("Prateek",51,30000));
        e1.add(new Employees("Ashutosh",55,40000));
        e1.add(new Employees("Raghav",60,50000));


        for(Employees e : e1)
        {
            System.out.println(e);
        }




    }

}


