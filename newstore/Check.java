package newstore;

import java.util.Random;

public class Check implements Summary {

    Random r = new Random();
    int randomCheckNumber = r.nextInt(100);
    Product[] prodInCheck = new Product[randomCheckNumber];
    int[] eachProductInCheck = new int[6];

    Check() {
        for (int i = 0; i < randomCheckNumber; i++) {
            prodInCheck[i] = Product.values()[r.nextInt(Product.values().length)];
            for (Product p : Product.values()) {
                if (prodInCheck[i] == p) {
                    eachProductInCheck[p.ordinal()]
                            = eachProductInCheck[p.ordinal()] + 1;
                }
            }
        }
    }

    public void printRandom() {
        System.out.println("Random check's number is: " + randomCheckNumber);
    }

    //выводим массив на печать
    public void printProd() {
        for (Product p : Product.values()) {
            System.out.println(p + " are: " + eachProductInCheck[p.ordinal()]);
        }
    }

    //стоимость продуктов в чеке
    public int getSum() {
        int sum = 0;
        for (Product p : Product.values()) {
            sum += p.getPrice() * eachProductInCheck[p.ordinal()];
        }
        return sum;
    }

    //стоимость конкретного продукта
    public int getProductSum(Product product) {
        //int sum = 0;
        for (Product p : Product.values()) {
            if (p == product) {
                return p.getPrice() * eachProductInCheck[p.ordinal()];
            }
        }
        return 0;
    }
}
