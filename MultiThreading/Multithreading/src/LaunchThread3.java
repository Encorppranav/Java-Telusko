import java.util.Scanner;

class Alpha2 implements Runnable
{
    @Override
    public void run()
    {
        String threadName = Thread.currentThread().getName();

        if(threadName.equals( "Banking"))
        {
            Banking();
        }

        else if(threadName.equals( "PrintingStars"))
        {
            PrintingStars();
        }

        else
        {
            focus();
        }

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


    public void PrintingStars()
    {
        System.out.println("Printing Activity Started ....");

        for (int i = 0; i <= 4; i++) {

            try{
                System.out.println("**");
                Thread.sleep(4000);
            }

            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }

        System.out.println("Printing Activity Terminated");

    }



    public void focus()
    {
        System.out.println("Printing important message started...");
        for(int i=0;i<=4;i++)
        {
            try{
                System.out.println("Focus is the key to master any skills");
                Thread.sleep(4000);
            }

            catch (InterruptedException e)
            {
                e.printStackTrace();
            }


        }

        System.out.println("Printing important message terminated...");

    }

}







public class LaunchThread3 {
    public static void main(String[] args) throws InterruptedException
    {

        System.out.println("Application Started....");

           Alpha2 a =  new Alpha2();
             Thread thread1 = new Thread(a);
            Thread thread2 = new Thread(a);
            Thread thread3 = new Thread(a);

            thread1.setName("Banking");
            thread2.setName("PrintingStars");
             thread3.setName("Focus");

             thread1.start();
             thread2.start();
             thread3.start();







        System.out.println("Application Terminated....");


    }
}
