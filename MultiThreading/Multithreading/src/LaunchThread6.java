
class Producer extends Thread
{
    int i=1;
    Queue q;

    public Producer (Queue q)
    {
        this.q = q;
    }

    public void run()
    {
        while(true)
        {
            q.produce(i++);
        }
    }

}


class Consumer extends Thread
{
    Queue q;

    public Consumer(Queue q)
    {
        this.q = q;
    }

    public void run()
    {
        while(true)
        {
            q.consume();
        }
    }
}


class Queue
{
    int data;
    boolean flag = false;


        synchronized public void produce(int i)
        {
            try
            {
            if(flag== true)
            {
                System.out.println("Producer is waiting");
                wait();
            }

            else {
                data = i;
                System.out.println("I have produced the data "+ data);
                flag = true;
                notify();

            }
        }

          catch(Exception e)
        {
            e.printStackTrace();
        }
    }





        synchronized public void consume()
        {
            try
            {
            if(flag== false)
            {
                System.out.println("Consumer is waiting");
                wait();
            }

            else {

                System.out.println("I have consumed the data "+ data);
                flag = false;
                notify();

            }
        }
            catch(Exception e)
        {
            e.printStackTrace();
        }
    }





}





public class LaunchThread6
{
    public static void main(String[] args) {
        Queue q = new Queue();

        Producer prod = new Producer(q);
        Consumer c = new Consumer(q);

        prod.start();
        c.start();

    }
}
