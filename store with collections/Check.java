package store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Check implements Summary {

    Random r = new Random();
    int randomCheckNumber = r.nextInt(10);
    List<ProductType> ourProductsInTheCheck = new ArrayList<>();

    Check() {
        for (int i = 0; i < randomCheckNumber; i++) {

            ourProductsInTheCheck.add(ProductType.values()[r.nextInt(ProductType.values().length - 1)]);

        }
    }

    public void printProductsInTheCheck() {
        for (int i = 0; i < randomCheckNumber; i++) {

            System.out.println(ourProductsInTheCheck.get(i));
        }
    }

    @Override
    public int getSum() {
        int sum = 0;
        for (ProductType p : ourProductsInTheCheck) {
            sum += p.getPrice();
        }
        return sum;
    }

    public int getProductSum(ProductType product) {
        int sum = 0;
        for (ProductType p : ourProductsInTheCheck) {
            if (p == product) {
                sum += product.getPrice();
            }
        }
        return sum;
    }

    public int getIdNumber(Products product) {
        int idNumber = product.getId();
        return idNumber;
    }
}
