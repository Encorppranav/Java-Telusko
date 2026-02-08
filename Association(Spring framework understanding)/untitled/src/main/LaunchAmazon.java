package main;

import services.BlueDart;
import services.FedEx;
import services.FirstFlight;

public class LaunchAmazon {

    public static void main(String[] args) {

        Amazon amz = new Amazon(new FirstFlight());

//        amz.setService(new BlueDart());

      Boolean status = amz.deliverTheProduct(12650.57);

      if(status)
      {
          System.out.println("Product Delivery Successful");
      }

      else {
          System.out.println("Failed to deliver the product");
      }
    }

}
