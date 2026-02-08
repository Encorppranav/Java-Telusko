package services;

public class FirstFlight implements IDeliveryService {

    public Boolean deliverProduct(Double amount){

        System.out.println("The product is delivered by FirstFlight and the amount is "+ amount);
        return true;

    }

}
