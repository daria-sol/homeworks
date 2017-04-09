
package store;

import java.util.Random;


public class Check extends Store{
    
   public int randomCheckNumber(int randomNumberCheck){
       Random k = new Random();
       randomNumberCheck = k.nextInt(100);
       return randomNumberCheck;
   } 
   
   public static int[] getProductInCheck(int[] numberOfProduct, int randomCheck,
            int ch, int cl, int fr, int ot, int th, int vg) {
        numberOfProduct = new int[6];
        numberOfProduct[0] = ch;
        numberOfProduct[1] = cl;
        numberOfProduct[2] = fr;
        numberOfProduct[3] = ot;
        numberOfProduct[4] = th;
        numberOfProduct[5] = vg;

        Random k = new Random();
        int[] ourProductInCheck = new int[6];
        int sum = 0;

        for (int h = 0; h < numberOfProduct.length; h++) {
            ourProductInCheck[h] = k.nextInt(randomCheck - sum + 1);
            sum += ourProductInCheck[h];
            System.out.println("ourProductInCheck[" + h + "] = "
                    + ourProductInCheck[h]);
        }
        System.out.println();
        System.out.println("Products in check are " + sum);
        return ourProductInCheck;

    }

   

}
