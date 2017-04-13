package store;

import java.util.Random;

public class Store implements Summary {

    @Override
    public int getRandom() {
        Random r = new Random();
        int randomNumber = r.nextInt(500);
        System.out.println("Random store's number is: " + randomNumber);
        return randomNumber;
    }

    @Override
    public int getSum(int a[]) {
        int sum = 0;
        for (Product p : Product.values()) {
            sum += p.getPrice() * a[p.ordinal()];
        }
        System.out.println("Our Store's sum is: " + sum);
        return sum;
    }

    public int[] productsInTheStore(Product[] prod,
            int randomNumber) {
        prod = new Product[randomNumber];
        int[] eachProduct = new int[6];
        Random r = new Random();

        for (int i = 0; i < randomNumber; i++) {
            prod[i] = Product.values()[r.nextInt(Product.values().length)];
            for (Product p : Product.values()) {
                if (prod[i] == p) {
                    eachProduct[p.ordinal()] = eachProduct[p.ordinal()] + 1;
                }
            }
        }
        for (Product p : Product.values()) {
            System.out.println(p + " are: " + eachProduct[p.ordinal()]);
        }

        return eachProduct;
    }

}
