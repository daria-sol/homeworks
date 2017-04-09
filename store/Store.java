package store;

import java.util.Random;

public class Store {

    

    public static int getRandomNumber(int theBiggest) {
        Random r = new Random();
        int randomNumber = r.nextInt(theBiggest);
        System.out.println("random number is: " + randomNumber);
        return randomNumber;
    }

    public static int[] productsInTheStore(Product[] prod, int randomNumber) {
        prod = new Product[randomNumber];
        int[] eachProduct = new int[6];
        Random r = new Random();
        eachProduct[0] = 0;
        eachProduct[1] = 0;
        eachProduct[2] = 0;
        eachProduct[3] = 0;
        eachProduct[4] = 0;
        eachProduct[5] = 0;
        for (int i = 0; i < randomNumber; i++) {
            prod[i] = Product.values()[r.nextInt(Product.values().length)];
            if (prod[i] == Product.Chemistry) {
                eachProduct[0] = eachProduct[0] + 1;
            }
            if (prod[i] == Product.Clothing) {
                eachProduct[1] = eachProduct[1] + 1;
            }
            if (prod[i] == Product.Fruits) {
                eachProduct[2] = eachProduct[2] + 1;
            }
            if (prod[i] == Product.Other) {
                eachProduct[3] = eachProduct[3] + 1;
            }
            if (prod[i] == Product.Technics) {
                eachProduct[4] = eachProduct[4] + 1;
            }
            if (prod[i] == Product.Vegetables) {
                eachProduct[5] = eachProduct[5] + 1;
            }
        }

        System.out.println("number of chemistry = " + eachProduct[0]);
        System.out.println("number of clothing = " + eachProduct[1]);
        System.out.println("number of Fruits = " + eachProduct[2]);
        System.out.println("number of Other = " + eachProduct[3]);
        System.out.println("number of Technics = " + eachProduct[4]);
        System.out.println("number of Vegetables = " + eachProduct[5]);
        return eachProduct;
    }

    
}
