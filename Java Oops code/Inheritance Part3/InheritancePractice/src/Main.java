<<<<<<< HEAD
class Learner{
    int id;
    String name;
    String city;

    void setId(int id){
        this.id = id;

    }

    void setName(String name){
        this.name = name;

    }

    void setCity(String city){
        this.city = city;

    }


    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

    String getCity(){
        return city;
=======

class Demo4{

    public static void disp(){
        int a=10;
        System.out.println(a+" of parent class");
>>>>>>> dbb1feb (Inheritance in oops)
    }

}

<<<<<<< HEAD

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Learner l = new Learner();

      l.setId(1);
      l.setName("Pranav");
      l.setCity("Sojat");

     int id =  l.getId();
        System.out.println("The Id of user is "+id);

        System.out.println("Name of user is "+ l.getName() );
        System.out.println("City" + l.getCity());
=======
class Demo5 extends Demo4 //Method Hiding
{

    public static void disp(){
        int a=10;
        System.out.println(a+" of child  class");
    }


}


public class Main {
    public static void main(String[] args) {

        Demo5 d = new Demo5();
        d.disp();
        System.out.println("****************");

        Demo4 d1 = new Demo5();
        d1.disp();
>>>>>>> dbb1feb (Inheritance in oops)


    }
}