
package store;

import java.util.Random;
import static store.Check.getProductInCheck;
import static store.Seller.getSum;
import static store.Store.getRandomNumber;
import static store.Store.productsInTheStore;


public class Main {
public static void main(String[] args) {

        Random r = new Random();
        int randomNumber = getRandomNumber(500);
         System.out.println();
        Product[] prod = new Product[randomNumber];
        
        int[] inStore = productsInTheStore(prod, randomNumber);
        System.out.println();
        Check check1 = new Check();

        int randomCheck = check1.randomCheckNumber(randomNumber);
        if (randomCheck < randomNumber) {
            System.out.println("random check number = "
                    + randomCheck);
        } else {
            System.out.println("random check number = "
                    + randomCheck + ". We haven't got some products.");
            randomCheck = 0;
        }
        System.out.println();

        int[] numberOfProduct = new int[6];
        for (int i = 0; i < 6; i++) {
            numberOfProduct[i] = inStore[i];
        }
       
        int inCheck[] = getProductInCheck(numberOfProduct, randomCheck, inStore[0], 
                inStore[1], inStore[2], inStore[3], inStore[4], inStore[5]);

        System.out.println();
        
        //our check sum
        getSum("check",inCheck[0], inCheck[1], inCheck[2], inCheck[3], inCheck[4],
                inCheck[5]);
       
        //our store sum
        getSum("store",inStore[0], inStore[1], inStore[2], inStore[3], inStore[4], 
                inStore[5]);
    }

}
