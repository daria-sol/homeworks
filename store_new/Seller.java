package store;

import java.util.Random;

public class Seller implements Summary {

    @Override
    public int getRandom() {
        Random r = new Random();
        int NumberOfChecks = r.nextInt(100);
        System.out.println("Our seller have " + NumberOfChecks + " checks:");
        return NumberOfChecks;
    }

    @Override
    public int getSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("All checks sum is: " + sum);
        return sum;

    }

    public int getAllSum(int a, int b) {
        System.out.println("All sum is: " + (a + b));
        return a + b;
    }

    /*public int getProductSum(Product ourProduct, int inStore, int inChecks) {
        int sum = 0;
        int s = 0;
        for (Product p : Product.values()) {
            if (ourProduct == p) {
                s = ourProduct.getPrice();
            }
            sum = (inStore + inChecks) * s;
        }
        System.out.println("Sum of " + ourProduct + " is: " + sum);
        return sum;
    }*/
}
