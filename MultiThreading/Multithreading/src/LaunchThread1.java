



public class LaunchThread1
{
    public static void main(String[] args) throws InterruptedException
    {

        System.out.println("Application Started....");
       Thread thread = Thread.currentThread();

        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

        thread.sleep(5000);

        thread.setName("Mythread");
        thread.setPriority(4);

        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

        System.out.println("Application Terminated....");




    }
}
