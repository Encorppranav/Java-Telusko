
import java.util.Scanner;

class Alpha1
{
    void calc() throws ArithmeticException{
        System.out.println("Alpha Connection Established");


            Scanner scan = new Scanner(System.in);

            System.out.println("Kindly Enter the Numerator");

            int n = scan.nextInt();

            System.out.println("Please enter the Denominator");

            int d = scan.nextInt();

            int res = n / d;

            System.out.println(res);







        System.out.println("Alpha Connection Terminated");
    }

}

public class LaunchEH3 {
    public static void main(String[] args) {

        try {


            System.out.println("Main Connection Established");

            Alpha1 a1 = new Alpha1();
            a1.calc();
        }

        catch(ArithmeticException e)
        {
            System.out.println("Main Method Catch Block");
        }

        System.out.println("Main Connection Terminated");
    }
}
