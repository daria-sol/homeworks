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
        
        // для дробных чисел
        double x=1.05,y=0.3;
        System.out.println("if x="+x+" "+"y="+y);
        System.out.println("x+y=" + sumF(x,y));
        System.out.println("x-y=" + difF(x,y));
        System.out.println("x*y=" + mulF(x,y));
        System.out.println("x/y=" + divF(x,y));

    }
//соответсвенно методы для целых
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int dif(int a, int b) {
        return a-b;
    }
    public static int mul(int a, int b) {
        return a*b;
    }
    public static int div(int a, int b) {
        return a/b;
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
