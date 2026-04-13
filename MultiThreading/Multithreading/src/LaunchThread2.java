import java.util.Scanner;

class Alpha extends Thread
{
    @Override
    public void run()
    {
        Banking();
    }

    public void Banking()
    {
        System.out.println("Banking Activity Started ....");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Account No.");
        int an = sc.nextInt();

        System.out.println("Enter the password");
        int pass = sc.nextInt();

        System.out.println("Collect Your Cash");

        System.out.println("Banking Activity Terminated");

    }

}


class Beta extends Thread
{   @Override
    public void run()
    {
        try{
            PrintingStars();
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    public void PrintingStars() throws InterruptedException
    {
        System.out.println("Printing Activity Started ....");

        for (int i = 0; i <= 4; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }

        System.out.println("Printing Activity Terminated");

    }

}

class Gamma extends Thread
{   @Override
    public void run()
    {
        try{
            focus();
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    public void focus() throws InterruptedException
    {
        System.out.println("Printing important message started...");
        for(int i=0;i<=4;i++)
        {
            System.out.println("Focus is the key to master any skills");
            Thread.sleep(4000);
        }

        System.out.println("Printing important message terminated...");

    }
}




public class LaunchThread2 {
    public static void main(String[] args) throws InterruptedException
    {

        System.out.println("Application Started....");


        Alpha a=new Alpha(); //Thread1
        Beta b=new Beta();//Thread2

        Gamma g=new Gamma();//Thread3


        a.start();

        b.start();
        g.start();
        a.join();
        b.join();
        g.join();






        System.out.println("Application Terminated....");


    }
}
