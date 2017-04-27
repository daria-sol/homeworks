package newstore;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //create a new Seller     
        Seller seller1 = new Seller();
        //Seller's products on his Stores
        seller1.printProductsInTheStores();
        // we can use this: seller1.stores[0].printProd();
        //Seller's products on his Checks
        seller1.printProductsInTheChecks();
        seller1.getSum();

        System.out.println("All  sum is: " + seller1.getSum());
        Product p;
        p = Product.Technics;
        System.out.println("Sum of " + p + " is: "
                + seller1.getProductSum(Product.Technics));
    }

}
