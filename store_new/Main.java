package store;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Store store1 = new Store();
        int randomNumber = store1.getRandom();

        System.out.println();
        System.out.println("We have these products in our store:");
        Product[] prod = new Product[randomNumber];

        int[] inStore = store1.productsInTheStore(prod, randomNumber);
        System.out.println("-------------------");
        int storeSum = store1.getSum(inStore);
        System.out.println();

        Seller seller1 = new Seller();
        int numberOfChecks = seller1.getRandom();
        System.out.println();

        Check[] checks = new Check[numberOfChecks];
        int[] randomChecksNumber = new int[numberOfChecks];
        int[] inChecks = new int[numberOfChecks];
        int[] checksSum = new int[numberOfChecks];
        for (int i = 0; i < numberOfChecks; i++) {
            checks[i] = new Check();
            randomChecksNumber[i] = checks[i].getRandom();
            System.out.println("We have these products in our " + (i + 1)
                    + " check:");
            inChecks = checks[i].getProductInCheck(prod, randomChecksNumber[i]);
            System.out.println("-------------------");
            checksSum[i] = checks[i].getSum(inChecks);
            System.out.println();
        }

        seller1.getAllSum(seller1.getSum(checksSum), storeSum);

    }

}
