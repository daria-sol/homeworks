package homework5;

/*Создайте класс окружностей на плоскости, описав в нём все необходимые
свойства, подобрав им понятные имена и правильные типы данных.
Опишите в классе конструктор, позволяющий при создании нового объекта явно 
задать все его свойства. Если это необходимо, то проверьте допустимость их 
значений в конструкторе (например, в классе обыкновенных дробей нельзя 
создавать дробь с нулевым знаменателем).
Создайте в классе метод, проверяющий имеют ли две окружности равную площадь.
С использованием построенного класса создайте две окружности: одну с центром в 
(0;0) и радиусом 12, а вторую с центром в (3;5) и радиусом 11. Проверьте
с помощью созданного метода равна ли их площадь и если равна, то выведите 
соответсвующее сообщение на экран.*/
public class Circle {

    int coordinateX, coordinateY;
    double radius;
    final double Pi = 3.14;
    Circle(int x, int y, double r) {
        if (r <= 0) {
            System.out.println("Error. Incorrect value of radius");
        }
        this.coordinateX = x;
        this.coordinateY = y;
        this.radius = r;
    }
    double circleSquare(){
        return Pi * radius * radius;
    }
    void equalCircleSquare(double area1, double area2) {
        if (area1 == area2) {
            System.out.println("The area of circles are equal");
        } else {
            System.out.println("The area of circles aren't equal");
        }
    }
}
