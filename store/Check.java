package store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Check implements Summary {

    Random r = new Random();
    int randomCheckNumber = r.nextInt(10);
    List<Products.ProductType> ourProductsInTheCheck = new ArrayList<>();

    Check() {
        for (int i = 0; i < randomCheckNumber; i++) {

            ourProductsInTheCheck.add(Products.ProductType.values()[r.nextInt(Products.ProductType.values().length - 1)]);

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
        for (Products.ProductType p : ourProductsInTheCheck) {
            sum += p.getPrice();
        }
        return sum;
    }

    public int getProductSum(Products.ProductType product) {
        int sum = 0;
        for (Products.ProductType p : ourProductsInTheCheck) {
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
