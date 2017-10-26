package homework1;

public class Homework1 {

    public static void main(String[] args) {
        //для целых чисел
        int a = 8, b = 2;

        System.out.println("if a="+a+" "+"b="+b);
        System.out.println("a+b=" + sum(a,b));
        System.out.println("a-b=" + dif(a,b));
        System.out.println("a*b=" + mul(a,b));
        System.out.println("a/b=" + div(a,b));



    }


    //и для дробных
    public static double sumF(double x, double y) {
        return x+y;
    }
    public static double difF(double x, double y) {
        return x-y;
    }
    public static double mulF(double x, double y) {
        return x*y;
    }
    public static double divF(double x, double y) {
        return x/y;
    }
}
