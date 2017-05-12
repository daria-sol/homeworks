package store;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //create a new Seller     
        Seller seller1 = new Seller();
        System.out.println("Sum in the store is: " + seller1.store.getSum()); 
        System.out.println("Sum in the checks is: " + seller1.getSumInChecks()); 
        //all sum of products
        System.out.println("All  sum is: " + seller1.getSum());
        
        //sum of one of product
        System.out.println("Sum of " + Products.ProductType.Fruits + " is: "
                + seller1.getProductSum(Products.ProductType.Fruits));
       
        Products product = new Products();
        System.out.println("id = " + seller1.store.getIdNumber(product));

    }

}
