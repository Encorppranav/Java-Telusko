
import java.util.Scanner;

class Alpha2 {
    void calc() throws ArithmeticException {
        System.out.println("Alpha Connection Established");


        Scanner scan = new Scanner(System.in);

        try {


            System.out.println("Kindly Enter the Numerator");

            int n = scan.nextInt();

            System.out.println("Please enter the Denominator");

            int d = scan.nextInt();

            int res = n / d;

            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Alpha method exception");
            throw e;
        } finally {
            System.out.println("Alpha Connection Terminated");
        }

    }

    }

    public class LaunchEH4 {
        public static void main(String[] args) {

            try {


                System.out.println("Main Connection Established");

                Alpha2 a2 = new Alpha2();
                a2.calc();
            } catch (ArithmeticException e) {
                System.out.println("Main Method Exception");
            }

            System.out.println("Main Connection Terminated");

        }
    }
