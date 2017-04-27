package newstore;

import java.util.Random;

public class Seller implements Summary {

    Random r = new Random();
    int numberOfChecks = r.nextInt(10);
    int numberOfStores = 1;
    Store[] stores = new Store[numberOfStores];
    Check[] checks = new Check[numberOfChecks];

    Seller() {
        for (int i = 0; i < numberOfStores; i++) {
            stores[i] = new Store();
        }
        for (int i = 0; i < numberOfChecks; i++) {
            checks[i] = new Check();
        }

    }

    public void printProductsInTheStores() {
        System.out.println("We have " + numberOfStores + " stores");
        for (int i = 0; i < numberOfStores; i++) {
            System.out.println("We have these products in our " + (i + 1)
                    + " store:");
            stores[i].printProd();
            System.out.println("-------------------");
        }
    }

    public void printProductsInTheChecks() {
        System.out.println("We have " + numberOfChecks + " checks");
        for (int i = 0; i < numberOfChecks; i++) {
            System.out.println("We have these products in our " + (i + 1)
                    + " check:");
            checks[i].printProd();
            System.out.println("-------------------");
        }
    }

    @Override
    public int getSum() {
        int sumInChecks = 0;
        int sumInStores = 0;

        for (int i = 0; i < numberOfChecks; i++) {
            sumInChecks += checks[i].getSum();
        }
        for (int i = 0; i < numberOfStores; i++) {
            sumInStores += stores[i].getSum();
        }
        return sumInChecks + sumInStores;

    }

    public int getProductSum(Product product) {
        int productPrice1 = 0;
        int productPrice2 = 0;
        for (Product p : Product.values()) {
            if (product == p) {
                for (int i = 0; i < numberOfChecks; i++) {
                    productPrice1 += checks[i].getProductSum(product);
                }
                for (int i = 0; i < numberOfStores; i++) {
                    productPrice2 += stores[i].getProductSum(product);
                }
            }

        }
        return productPrice1 + productPrice2;
    }
}
