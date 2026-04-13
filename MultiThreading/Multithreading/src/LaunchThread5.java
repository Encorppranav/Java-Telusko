
class Library implements Runnable
{
    String res1 = new String("Java");
    String res2 = new String("SpringBoot");
    String res3 = new String("DSA");

    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();


            if(name.equals("Student1"))
            {
                try
                {
                System.out.println("Student1 has entered the library");
                Thread.sleep(3000);

                synchronized (res1)
                {
                    System.out.println("Student1 hs acquired "+res1);
                    Thread.sleep(4000);

                    synchronized (res2)
                    {
                        System.out.println("Student1 hs acquired "+res2);
                        Thread.sleep(4000);

                        synchronized (res3)
                        {
                            System.out.println("Student1 hs acquired "+res3);
                            Thread.sleep(4000);
                        }
                    }
                }

            }

                catch(Exception e)
                {
                    e.printStackTrace();
                }

        }


            else
            {
                try
                {
                    System.out.println("Student 2 got into Library");
                    Thread.sleep(3000);
                    synchronized(res1)
                    {
                        System.out.println("Student2 has acquired "+ res1);
                        Thread.sleep(4000);
                        synchronized(res2)
                        {
                            System.out.println("Student2 has acquired "+ res2);
                            Thread.sleep(4000);
                            synchronized(res3)
                            {
                                System.out.println("Student2 has acquired "+ res3);
                                Thread.sleep(4000);
                            }
                        }
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }

    }


}




    







public class LaunchThread5 {
    public static void main(String[] args) {

        Library  lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("Student1");
        t2.setName("Student2");

        t1.start();
        t2.start();
    }
}
