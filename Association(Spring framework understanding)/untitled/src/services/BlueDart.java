package services;

public class BlueDart implements IDeliveryService {

    public Boolean deliverProduct(Double amount){

        System.out.println("The product is delivered by BlueDart and the amount is "+ amount);
        return true;

    }
}
