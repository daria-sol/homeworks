package store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Seller implements Summary {

    Random r = new Random();
    int numberOfChecks = r.nextInt(20);
    List<Check> checks = new ArrayList<>();
    Store store = new Store();

    Seller() {
        for (int i = 0; i < numberOfChecks; i++) {
            checks.add(new Check());
        }
    }

    public void printProductsInTheChecks() {
        System.out.println("We have " + numberOfChecks + " checks");
        for (int i = 0; i < numberOfChecks; i++) {
            System.out.println("We have these products in our " + (i + 1)
                    + " check:");
            checks.get(i).printProductsInTheCheck();
            System.out.println("-------------------");
        }
    }

    public int getSumInChecks() {
        int sumInChecks = 0;

        for (Check check : checks) {
            sumInChecks += check.getSum();
        }
        return sumInChecks;

    }

    @Override
    public int getSum() {
        return getSumInChecks() + store.getSum();

    }

    public int getProductSum(ProductType product) {
        int productPrice1 = 0;

        for (Check check : checks) {
            productPrice1 += check.getProductSum(product);

        }
        return productPrice1 + store.getProductSum(product);
    }
}
