import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Connection Established");


        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Kindly Enter the Numerator");

            int n = scan.nextInt();

            System.out.println("Please enter the Denominator");

            int d = scan.nextInt();

            int res = n / d;

            System.out.println(res);


            System.out.println("Kindly Enter the size of the array");

            int size = scan.nextInt();
            int[] ar = new int[size];

            System.out.println("Please Enter the element to be inserted");
            int ele = scan.nextInt();

            System.out.println("Kindly Enter the index at which element to be inserted");
            int index = scan.nextInt();

            ar[index] = ele;

            System.out.println("The Data inserted is " + ar[index]);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Please enter valid denominator");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Be within your limits,Dont cross it");
        }

        catch(NegativeArraySizeException e)
        {
            System.out.println("Please dont be negative");
        }

        catch (Exception e)
        {
            System.out.println("Something wrong has happened");
        }

        System.out.println("Connection Terminated");




    }
}