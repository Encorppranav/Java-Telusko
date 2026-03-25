import java.util.Scanner;


class InvalidCustomerException extends Exception
{
    public InvalidCustomerException(String msg)
    {
        super(msg);
    }
}

class ATM
{
    private int  accNo = 4545;
    private int pw = 1234;

    int accountNo;
    int password;

    public void input()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kindly Enter the account number");
        accountNo = scan.nextInt();

        System.out.println("Kindly enter the password");
        password = scan.nextInt();
    }

    public void verify() throws InvalidCustomerException
    {
        if(accountNo == accNo && password == pw)
        {
            System.out.println("You can withdraw the cash");
        }

        else {
            InvalidCustomerException ice = new InvalidCustomerException("Invalid Credentials! ");
            System.out.println(ice.getMessage());
            throw ice;
        }
    }
}

class Bank
{
    ATM atm = new ATM();

    public void initiate()
    {
        try {


            atm.input();
            atm.verify();
        }

        catch(InvalidCustomerException ice)
        {
            System.out.println("Try Again! ");

            try {


                atm.input();
                atm.verify();
            }

            catch(InvalidCustomerException ice1)
            {
                System.out.println("Last Chance Again! ");



                try {


                    atm.input();
                    atm.verify();
                }

                catch(InvalidCustomerException ice2)
                {
                    System.out.println("You are a legend,cannot be given anymore chances ");

                }

            }

        }

        }



}




public class LaunchEH5 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.initiate();
    }
}
