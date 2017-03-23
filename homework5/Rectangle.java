package homework5;


/*1. Создайте класс прямоугольников, описав в нём все необходимые свойства,
подобрав им понятные имена и правильные типы данных.
Опишите в классе конструктор, позволяющий при создании нового объекта явно
задать все его свойства. Если это необходимо, то проверьте допустимость их
значений в конструкторе (например, в классе обыкновенных дробей нельзя 
создавать дробь с нулевым знаменателем).
Создайте в классе метод, проверяющий равны ли два прямоугольника по площади.
С использованием построенного класса создайте один прямоугольник со сторонами 
3 и 8 и второй прямоугольник со сторонами 6 и 4. Проверьте с помощью созданного
метода равны ли прямоугольники по площади и если да, то выведите соответсвующее
сообщение на экран.*/
public class Rectangle {

    double height;
    double width;

    // This is the constructor for Rectangle.
    Rectangle(double w, double h) {
        if (w < 0 || h < 0) {
            System.out.println("Error. Incorrect value of width"
                    + " or height.");
        }
        this.width = w;
        this.height = h;
    }

    // compute and return square
    double area() {
        return width * height;
    }

    void equalArea(double area1, double area2) {
        if (area1 == area2) {
            System.out.println("The area of rectangles are equal");
        } else {
            System.out.println("The area of rectangles aren't equal");
        }
    }
}
