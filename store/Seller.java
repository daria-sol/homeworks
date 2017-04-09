package store;
public class Seller extends Store{

    
    
    public static int getSum(String location, int a1, int a2, int a3, int a4, int a5, int a6) {
        
        int sum = (Product.Chemistry.getPrice() * a1)
                + (Product.Clothing.getPrice() * a2)
                + (Product.Fruits.getPrice() * a3)
                + (Product.Other.getPrice() * a4)
                + (Product.Technics.getPrice() * a5)
                + (Product.Vegetables.getPrice() * a6);
        if(location == "check"){
        System.out.println("Our check's sum is: " + sum);
        }
        if(location == "store"){
        System.out.println("Our store's sum is: " + sum);
        }
        return sum;
      

    }
   
}
