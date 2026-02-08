package main;

import services.IDeliveryService;

public class Amazon {

    private IDeliveryService service;

    public Amazon(IDeliveryService service)
    {
        this.service = service;
    }

    public Amazon(){

    }

    public void setService(IDeliveryService service)
    {
        this.service = service;
    }

    public Boolean deliverTheProduct(Double amount) {

        return service.deliverProduct(amount);


    }

}
