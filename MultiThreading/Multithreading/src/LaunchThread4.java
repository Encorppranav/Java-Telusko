

class Car implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+" has entered the parking lot");
            Thread.sleep(4000);
            synchronized (this)
            {
                System.out.println(Thread.currentThread().getName()+" has entered the car");
                Thread.sleep(4000);

                System.out.println(Thread.currentThread().getName() +" is driving the car");
                Thread.sleep(4000);


                System.out.println(Thread.currentThread().getName()+" has came back and parked the car");

            }

        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }



    }


}




public class LaunchThread4 {
    public static void main(String[] args) {

        Car car = new Car();

        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);

        t1.setName("Ramiya");
        t2.setName("Pakiya");
        t3.setName("Suriya");

        t1.start();
        t2.start();
        t3.start();

    }
}
