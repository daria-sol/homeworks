package arrays;

public class Arrays {

    public static void main(String[] args) {
       
        // на матрицы
        /*1. Вывести матрицу на экран. 
2. Вывести все элементы над / под главной / побочной диагональю, включая / не включая диагональ.
Итого 8 функций должно выйти*/

        //1.задаём  матрицу
        System.out.println("Our matrix:");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //и выводим её на печать
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //выводим числа над побочной диагональю с самой диагональю
        System.out.println("With adverse diagonal and top:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < (3 - i); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //выводим числа над побочной диагональю без самой диагонали
        System.out.println("Without adverse diagonal and top:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < (3 - (i + 1)); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //выводим числа под побочной диагональю с ней же
        System.out.println("With adverse diagonal and down:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (j >= 3 - (i + 1)) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();
        //выводим числа под побочной диагональю 
        System.out.println("Without adverse diagonal and down:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (j > 3 - (i + 1)) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        //выводим числа над главной диагональю с самой диагональю
        System.out.println("With main diagonal and top:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //выводим числа над главной диагональю 
        System.out.println("Without main diagonal and top:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (j > i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //выводим числа под главной диагональю с самой диагональю
        System.out.println("With main diagonal and down:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (j <= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //выводим числа под главной диагональю 
        System.out.println("Without main diagonal and down:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("firstLast6:");
        int[] arr = {1, 3, 6, 5, 5, 7, 8, 6};
        System.out.println(firstLast6(arr));

        System.out.println();
        System.out.print("commonEnd:");
        int[] a = {1, 3, 6, 5, 5, 7, 8, 6};
        int b[] = {0, 1, 0, 5, 6};
        System.out.println(commonEnd(a, b));

        System.out.println();
        System.out.print("reverse3:");
        int[] avers = {1, 3, 6, 5, 5, 7, 8, 6};
        System.out.println(reverse3(avers));
        
    }
    //задачи на массивы

    /* 1. Дан массив, вернуть true, если в начале или конце масства 
        стоит число 6. Массив должен быть длинной 1 или больше.
        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false*/
    public static boolean firstLast6(int[] array) {
        if ((array[0] == 6) || (array[array.length - 1] == 6)) {
            return true;
        }
        return false;
    }

    /*2. Даны 2 массива, a и b, вернуть true если они имеют одинаковые 
       первый и последний элементы. Оба массива длинной 1 илил больше.
        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true*/
    public static boolean commonEnd(int a[], int b[]) {
        if ((a[0] == b[0]) && (a[a.length - 1] == b[b.length - 1])) {
            return true;
        }
        return false;
    }

    /*3. Дан массив длинной 3. Вернуть новый массив с элементами в обратном
        порядке.
        reverse3([1, 2, 3]) → [3, 2, 1]
        reverse3([5, 11, 9]) → [9, 11, 5]
        reverse3([7, 0, 0]) → [0, 0, 7]*/
    public static int[] reverse3(int a[]) {
        int[] aReverse = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            aReverse[i] = a.length - 1 - i;
        }
        return a;
        
    }
    

}
