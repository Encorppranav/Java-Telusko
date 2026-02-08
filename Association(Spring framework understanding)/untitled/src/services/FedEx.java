package services;

public class FedEx implements IDeliveryService {

    public Boolean deliverProduct(Double amount){

        System.out.println("The product is delivered by FedEx and the amount is "+ amount);
        return true;

    }

}
