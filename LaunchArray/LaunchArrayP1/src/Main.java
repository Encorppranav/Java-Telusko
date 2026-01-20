<<<<<<< HEAD
class Aeroplane{

    void landing(){System.out.println("Aeroplane is landing");}

    void fly()
    {System.out.println("Aeroplane is flying");}

    public void takingOff() {
        System.out.println("Aeroplane must takeOff in order to fly");
    }




}


class Cargoplane extends Aeroplane
{

    void landing(){
        System.out.println("Cargoplane is landing");

    }


    void fly(){
        System.out.println("Cargoplane is flying");

    }

    public void takingOff() {
        System.out.println("Cargoplane must takeOff in order to fly");
    }



}

class Fighterplane extends Aeroplane
{

    void landing(){
        System.out.println("Fighterplane is landing");

    }


    void fly(){
        System.out.println("Fighterplane is flying");

    }

    public void takingOff() {
        System.out.println("Fighterplane must takeOff in order to fly");
    }



}


class Passengerplane extends Aeroplane
{

    void landing(){
        System.out.println("Passengerplane is landing");

    }


    void fly(){
        System.out.println("Passengerplane is flying");

    }

    public void takingOff() {
        System.out.println("Passengerplane must takeOff in order to fly");
    }

}


class Airport
{
    void permit (Aeroplane aeroplane)
    {
        aeroplane.takingOff();
        aeroplane.fly();
        aeroplane.landing();
    }


}

public class Main {
    public static void main(String[] args) {

        Aeroplane fp = new Fighterplane();
        Aeroplane cp = new Cargoplane();
        Aeroplane pp = new Passengerplane();

        Airport a = new Airport();

        a.permit(cp);
        System.out.println("*********************");
        a.permit(fp);
        System.out.println("***********************");
        a.permit(pp);//jhghhh

        }
    }
=======
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     int  [][] arr = new int[5][5];

     Scanner scan = new Scanner(System.in);

        for(int i=0; i<arr.length;i++) {
            System.out.println("Enter for class " + (i+1));

            for (int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter the marks of student "+ (j+1));

                arr[i][j] = scan.nextInt();
            }

        }


     for(int i=0; i<arr.length;i++)
     {
         for (int j=0;j<arr[i].length;j++)
         {
             System.out.println("The marks of Class "+(i+1)+" are");

             System.out.print(arr[i][j]);


         }

         System.out.println("");
     }

    }
}
>>>>>>> 8972e44 (Arrays in Java)
