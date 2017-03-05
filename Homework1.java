package homework1;

public class Homework1 {

    public static void main(String[] args) {
        //для целых чисел
        int sum, dif, mul, div;
        int a, b;
        
        a = 8;
        b = 4;
        
        sum = a + b;
        dif = a - b;
        mul = a * b;
        div = a / b;
        
        System.out.println("if a="+a+" "+"b="+b);
        System.out.println("a+b=" + sum);
        System.out.println("a-b=" + dif);
        System.out.println("a*b=" + mul);
        System.out.println("a/b=" + div);

        //для дробных
        double sumF, difF, mulF, divF;
        double x, y;
        
        x =1.05;
        y =0.3;
        
        sumF = x + y;
        difF = x - y;
        mulF = x * y;
        divF = x / y;
        
        System.out.println("if x="+x+" "+"y="+y);
        System.out.println("x+y=" + sumF);
        System.out.println("x-y=" + difF);
        System.out.println("x*y=" + mulF);
        System.out.println("x/y=" + divF);

    }

}
