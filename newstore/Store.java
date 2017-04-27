package newstore;

import java.util.Random;

public class Store implements Summary {

    Random r = new Random();
    int randomNumber = r.nextInt(500);
    Product[] prod = new Product[randomNumber];
    int[] eachProduct = new int[6];

    //заполняем наш склад
    Store() {
        for (int i = 0; i < randomNumber; i++) {
            prod[i] = Product.values()[r.nextInt(Product.values().length)];
            for (Product p : Product.values()) {
                if (prod[i] == p) {
                    eachProduct[p.ordinal()] = eachProduct[p.ordinal()] + 1;
                }
            }
        }
    }

    //выводим массив на печать
    public void printProd() {
        for (Product p : Product.values()) {
            System.out.println(p + " are: " + eachProduct[p.ordinal()]);
        }
    }

    //печать количества продуктов на складе
    public void printRandom() {
        System.out.println("Random store's number is: " + randomNumber);
    }

    //сумма стоимости продуктов на складе
    public int getSum() {
        int sum = 0;
        for (Product p : Product.values()) {
            sum += p.getPrice() * eachProduct[p.ordinal()];
        }
        return sum;
    }
    //стоимость конкретного продукта

    public int getProductSum(Product product) {
        //int sum = 0;
        for (Product p : Product.values()) {
            if (p == product) {
                return p.getPrice() * eachProduct[p.ordinal()];
            }
        }
        return 0;
    }
}
