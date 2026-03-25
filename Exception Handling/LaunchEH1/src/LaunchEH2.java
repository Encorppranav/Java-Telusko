import java.util.Scanner;

class Alpha
{
    void calc(){
        System.out.println("Alpha Connection Established");

        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Kindly Enter the Numerator");

            int n = scan.nextInt();

            System.out.println("Please enter the Denominator");

            int d = scan.nextInt();

            int res = n / d;

            System.out.println(res);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Kindly Enter Valid Denominator");
        }




            System.out.println("Alpha Connection Terminated");
    }

}

class Beta
{
    void disp(){

        System.out.println("Beta Connection Established");
        Alpha a = new Alpha();
        a.calc();

        System.out.println("Beta Connection Terminated");

    }
}



public class LaunchEH2 {
    public static void main(String[] args) {

        System.out.println("Main Connection Established");

        Beta b = new Beta();
        b.disp();

        System.out.println("Main Connection Terminated");
    }

}
