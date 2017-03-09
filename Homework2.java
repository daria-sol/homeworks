package homework2;

public class Homework2 {

    public static void main(String[] args) {
        
        //задачи на матрицы
        //1.задаём  матрицу
        System.out.println("Our matrix:");
        int[][] matrix = {{1, 8, 15}, {3, 2, 0}, {5, -1, 4}};
        //и выводим её на печать
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //выводим числа над побочной диагональю с самой диагональю
        System.out.println("With adverse diagonal:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < (3 - i); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //выводим числа над побочной диагональю без самой диагонали
        System.out.println("Without adverse diagonal:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < (3 - (i + 1)); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        
//Задачи на логические выражения
        //для 1 задачи
        System.out.print("for 1 exercise: ");
        System.out.println(cigarParty(70, false));
        //для 2 задачи
        System.out.print("for 2 exercise: ");
        System.out.println(dateFashion(8, 4));
        //для 3 задачи
        System.out.print("for 3 exercise: ");
        System.out.println(squirrelPlay(18, false));
        //для 4 задачи
        System.out.print("for 4 exercise: ");
        System.out.println(caughtSpeeding(82, true));
        //для 5 задачи
        System.out.print("for 5 exercise: ");
        System.out.println(sortaSum(7, 6));
        //для 6 задачи
        System.out.print("for 6 exercise: ");
        System.out.println(love6(5, 2));
        //для 7 задачи
        System.out.print("for 7 exercise: ");
        System.out.println(in1To10(5, true));
        //для 8 задачи
        System.out.print("for 8 exercise: ");
        System.out.println(answerCell(false, false, false));
        //для 9 задачи
        System.out.print("for 9 exercise: ");
        System.out.println(noTeenSum(15, 7, 13));
        //для 10 задачи
        System.out.print("for 10 exercise: ");
        System.out.println(blackjack(16, 18));
        //для 11 задачи
        System.out.print("for 11 exercise: ");
        System.out.println(loneSum(1, 5, 1));
        //для 12 задачи
        System.out.print("for 12 exercise: ");
        System.out.println(luckySum(3, 24, 13));
    }
    //задачи на логические выражения
    //1 задача

    /*Когда белки устраивают вечеринку, они курят сигары. 
        Вечеринка белок считается успешной, когда количество выкуренных
        сигар находится между 40 и 60, включительно. Но в выходные верхнего
        предела по количеству выкуренных сигар нет. Вернуть true если вечеринка
        успешная, false иначе. */
    public static boolean cigarParty(int cigar, boolean weekend) {

        if ((cigar > 40 && cigar < 60) || weekend == true) {
            return true;
        } else {
            return false;
        }
    }

    //2 задача
    /*Вы и ваш партнер пытаетесь заказать столик в ресторане. 
        Результат получения столика зашифрован в видео 0 = нет, 
        1 = может быть, 2 = да. Решение принимается на основе вашей, и вашего 
        партнера, стильности. Этот параметр оценивается от 0 до 10. Если любой
        из вас очень стильный, 8 или больше, то результат всегда будет 2 = да.
        Но если кто-то из вас будет очень не стильным, 2 или меньше, то
        результат нет. В остальных случаях результат будет 1 = может быть.*/
    public static int dateFashion(int me, int partner) {
        if (((me >= 0) && (me <= 10)) && ((partner >= 0) && (partner <= 10))) {
            if ((me >= 8) && (me <= 10) || (partner >= 8) && (partner <= 10)) {
                return 2;
            } else if ((me >= 0) && (me <= 2) || (partner >= 0) && (partner <= 2)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    //3 задача
    /*Белки в парке Шевченко проводят большую часть дня за играми. 
        Обычно они играют при температуре от 20 до 30 градусов.
        Но если на дворе лето, верхний лимит температуры поднимается до 50 
        градусов. Даны int temperature и boolean isSummer, вернуть true если 
        белки играют и false в обратном случае.*/
    public static boolean squirrelPlay(int temperature, boolean isSummer) {
        if ((((temperature >= 20) && (temperature <= 30)) && (isSummer == false))
                || (((temperature >= 20) && (temperature <= 50))
                && (isSummer == true))) {
            return true;
        } else {
            return false;
        }
    }

    //4 задача
    /*Вы нарушали скоростной режим и гаи вас остановило. 
        Напишите код для вычисления результата, зашифрованного в виде: 
        0 = нет наказания, 1 = устный выговор, 2 = штраф. 
        Если скорость 60 или меньше, результат 0. Если скорость в пределах 61 и
        80, результат 1. Если выше 81 - результат 2. Но если у вас день
        рождения, вам простят лишние 5 км/час в любом случае.*/
    public static int caughtSpeeding(int speed, boolean bithday) {
        //int speed;
        //boolean bithday;
        // speed = 82;
        //bithday = true;
        if (bithday == false) {
            if (speed <= 60) {
                return 0;
            }
            if ((speed > 60) && (speed <= 80)) {
                return 1;
            }
            if (speed > 80) {
                return 2;
            }
        } else {
            int newSpeed = speed - 5;
            if (newSpeed <= 60) {
                return 0;
            }
            if ((newSpeed > 60) && (newSpeed <= 80)) {
                return 1;
            }
            if (newSpeed > 80) {
                return 2;
            }
        }
        return 0;
    }

    //5 задача
    /*Даны 2 int, a и b, нужно вернуть их сумму. 
        Но, сумма в пределах 10..19, включительно, запрещена. 
        В этом случае вернуть просто 20.*/
    public static int sortaSum(int a, int b) {
        if (((a + b) > 9) && ((a + b) < 20)) {
            return 20;
        } else {
            return a + b;
        }
    }

    //6 задача
    /*Число 6 очень крутое. Даны два int, a и b, вернуть true, если 
    любое из них равняется 6. Или если их сумма или разность равна 6. */
    public static boolean love6(int a, int b) {
        if (((a + b) == 6) || (a == 6) || (b == 6) || ((a - b) == 6)) {
            return true;
        } else {
            return false;
        }
    }

    //7 задача
    /*Дано число n, верните true, если n в пределах 1..10, включительно. 
    Но если активна переменная outsideMode, то возвращать true в случае если
    число меньше или равно 1, или больше или равно 10*/
    public static boolean in1To10(int n, boolean outsideMode) {
        if ((outsideMode == false) && ((n > 0) && (n < 11))) {
            return true;

        }
        if ((outsideMode == true) && ((n <= 1) || (n >= 10))) {
            return true;
        } else {
            return false;
        }
    }

    //задача 8
    /* Ваш мобильник звонит. Верните true, если вы можете ответить. 
    Обычно вы отвечаете, за исключение утра. Но если звонит мама, то
    отвечаете. Если вы спите, телефон на беззвучном, и вы не отвечаете 
    ни на какие звонки. 
     */
    public static boolean answerCell(boolean isMorning, boolean isMom,
            boolean isSleeping) {
        if (isSleeping == false) {
            if (isMorning == true) {
                if (isMom == true) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    //9 задача
    /*Даны 3 значения int, a, b и c, верните их сумму. Но, 
    если любое из этих значений подросток - в отрезке 13..19, 
    включительно, то значение считается как 0, за исключением 15 и 16,
    которые не считаются подростками. Напишите отдельную функцию 
    "public int fixTeen(int n)” для решения, является ли число подростком.
     */
    public static int fixTeen(int n) {
        if ((n == 13) || (n == 14) || (n == 17) || (n == 18) || (n == 19)) {
            return 0;
        } else {
            return n;
        }
    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    //10 задача
    /*10. Даны два числа, больших 0.
    Верните число, которое ближе всего к 21, 
    но не превышает его. Верните 0, если оба числа больше 21.

     */
    public static int blackjack(int a, int b) {
        if ((a > 0) && (b > 0)) {
            if (((21 - a) < (21 - b)) && ((21 - b) >= 0) && ((21 - a) >= 0)) {
                return a;
            }
            if (((21 - a) > (21 - b)) && (((21 - a) >= 0) && ((21 - b) >= 0))) {
                return b;
            }
            if (((21 - a) < 0) && ((21 - b) >= 0)) {
                return b;
            }
            if (((21 - a) >= 0) && ((21 - b) < 0)) {
                return a;
            }
            if (((21 - a) < 0) && ((21 - b) < 0)) {
                return 0;
            }
        } else {
            return 0;
        }
        return 0;
    }

    //задача 11
    /*Даны 3  числа, a,  b и c, верните их сумму. Но, если одно из чисел
    равняется любому другому из двух, оно не учитывается при вычислении суммы.
     */
    public static int loneSum(int a, int b, int c) {
        if ((a != b) && (a != c) && (b != c)) {
            return a + b + c;
        }
        if ((a == b) && (a != c) && (b != c)) {
            return c;
        }
        if ((a != b) && (a == c) && (b != c)) {
            return b;
        }
        if ((a != b) && (a != c) && (b == c)) {
            return a;
        }
        if ((a == b) && (a == c)) {
            return 0;
        }
        return 0;
    }

    //задача 12
    /*Даны 3 числа, a,  b и c, верните их сумму. Но, если одно из чисел 13,
    то все числа после него и само число 13 не учитываются в общей сумме.
     */
    public static int luckySum(int a, int b, int c) {
        if ((a != 13) && (b != 13) && (c != 13)) {
            return a + b + c;
        }
        if ((a != 13) && (b != 13) && (c == 13)) {
            return a + b;
        }
        if ((a!=13)&&(b==13)){
            return a;
        }else{
            return 0;
        }
    }
}
