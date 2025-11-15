class Aeroplane{

    void landing(){System.out.println("Aeroplane is landing");}

    void fly()
    {System.out.println("Aeroplane is flying");}

    public void takingOff() {
        System.out.println("Aeroplane must takeOff in order to fly");
    }




}


class Cargoplane extends Aeroplane
{

    void landing(){
        System.out.println("Cargoplane is landing");

    }


    void fly(){
        System.out.println("Cargoplane is flying");

    }

    public void takingOff() {
        System.out.println("Cargoplane must takeOff in order to fly");
    }



}

class Fighterplane extends Aeroplane
{

    void landing(){
        System.out.println("Fighterplane is landing");

    }


    void fly(){
        System.out.println("Fighterplane is flying");

    }

    public void takingOff() {
        System.out.println("Fighterplane must takeOff in order to fly");
    }



}


class Passengerplane extends Aeroplane
{

    void landing(){
        System.out.println("Passengerplane is landing");

    }


    void fly(){
        System.out.println("Passengerplane is flying");

    }

    public void takingOff() {
        System.out.println("Passengerplane must takeOff in order to fly");
    }

}


class Airport
{
    void permit (Aeroplane aeroplane)
    {
        aeroplane.takingOff();
        aeroplane.fly();
        aeroplane.landing();
    }


}

public class Main {
    public static void main(String[] args) {

        Aeroplane fp = new Fighterplane();
        Aeroplane cp = new Cargoplane();
        Aeroplane pp = new Passengerplane();

        Airport a = new Airport();

        a.permit(cp);
        System.out.println("*********************");
        a.permit(fp);
        System.out.println("***********************");
        a.permit(pp);//jhghhh

        }
    }
