package homework3;

public class Homework3 {

    public static void main(String[] args) {
        System.out.print("Factorial(5)=");
        System.out.println(factorial(5));
        System.out.print("Power(6,4)=");
        System.out.println(power(6, 4));
        System.out.print("BunnyEars(7)=");
        System.out.println(bunnyEars(7));
        System.out.print("SumDigits(458)=");
        System.out.println(sumDigits(458));
    }

    /*1. Вычислить факториал числа.*/
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    /*2. Вычислить степень числа.*/
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    /*3. Есть зайцы, стоящие в ряд, пронумерованные 1, 2, …, n. У нечетных зайцев
по 2 уха, у четных по 3 уха, так как они из Чернобыля. Вычислить количество
ушей в ряду кроликов.

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5*/
    public static int bunnyEars(int bunny) {
        if (bunny == 0) {
            return 0;
        }
        return bunny % 2 == 0 ? 3 + bunnyEars(bunny - 1) : 2
                + bunnyEars(bunny - 1);
    }

    /*4. Посчитать сумму цифр числа n. Замечание: остаток от деления (%)
на 10 дает в результате самую правую цифру числа (126 % 10 == 6),
а при деление (/) на 10, последняя цифра отпадает из за приведения 
типов (126 / 10 == 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3*/
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n < 10 ? n : n % 10 + sumDigits(n / 10);
    }

  
   
}
