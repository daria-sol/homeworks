package store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store implements Summary {

    Random r = new Random();
    int randomNumber = r.nextInt(50);
    List<ProductType> ourProductsInTheStore = new ArrayList<>();

    Store() {
        for (int i = 0; i < randomNumber; i++) {

            ourProductsInTheStore.add(ProductType.values()[r.nextInt(ProductType.values().length - 1)]);

        }
    }

    public void printProductsInTheStore() {
        for (int i = 0; i < randomNumber; i++) {

            System.out.println(ourProductsInTheStore.get(i));
        }
    }

    @Override
    public int getSum() {
        int sum = 0;
        for (ProductType p : ourProductsInTheStore) {
            sum += p.getPrice();
        }
        return sum;
    }

    public int getProductSum(ProductType product) {
        int sum = 0;
        for (ProductType p : ourProductsInTheStore) {
            if (p == product) {
                sum += p.getPrice();
            }

        }
        return sum;
    }

    public int getIdNumber(Products product) {
        int idNumber = product.getId();
        return idNumber;
    }
}
