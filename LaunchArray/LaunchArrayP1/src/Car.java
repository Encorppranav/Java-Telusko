public class Car {

    void run(){
        System.out.println("Car is Running");
    }

    void expense (){
        System.out.println("Car is generally expensive ");
    }


}

class Lamborgini extends Car {

    void run(){
        System.out.println("Lamborgini is fast");
    }

    void expense (){
        System.out.println("Lamborgini is expensive ");
    }
}

class Nano extends Car {
    void run(){
        System.out.println("Nano is slow");
    }

    void expense (){
        System.out.println("Nano is cheaper ");
    }
}

class road {

    void access (Car c)
    {
        c.run();
        c.expense();
    }

}

 class Main1{
    public static void main(String[] args) {

        Lamborgini lb = new Lamborgini();
        Nano no = new Nano();

        road rd = new road();

        rd.access(lb);
        System.out.println("*************************");
        rd.access(no);
    }

}


