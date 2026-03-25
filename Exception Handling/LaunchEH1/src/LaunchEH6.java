import java.util.Scanner;

class UnderAgeException extends Exception
{
    public UnderAgeException(String msg)
    {
        super(msg);
    }
}

class OverAgeException extends Exception
{
    public OverAgeException(String msg)
    {
        super(msg);
    }
}

class Applicant
{
    int age;

    public void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kindly Enter your age");
        age = sc.nextInt();
    }

    public void verify() throws UnderAgeException , OverAgeException
    {
        if(age >= 18 && age<= 60)
            System.out.println("You can apply for license");

        else if (age < 18) {
            UnderAgeException uae = new UnderAgeException("Hey kiddo, Have Patience");

            System.out.println(uae.getMessage());
            throw uae;
        }

        else{
            OverAgeException oae = new OverAgeException("Your time near,Rest at home");
            System.out.println(oae.getMessage());
            throw oae;
        }
    }
}

class RTO {

    Applicant app = new Applicant();

    public void initiate()
    {
        try
        {
            app.input();
            app.verify();
        }

        catch(UnderAgeException | OverAgeException e)
        {
            System.out.println("Try Again !!");

            try
            {
                app.input();
                app.verify();
            }

            catch(UnderAgeException | OverAgeException e1)
            {
                System.out.println("You are blocked for license application due to age related restrictions");


            }


        }

    }

}




public class LaunchEH6 {
    public static void main(String[] args) {
        RTO rto = new RTO();
        rto.initiate();
    }
}
