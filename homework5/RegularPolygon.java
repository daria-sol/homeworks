package homework5;

/*Создайте класс правильных n-угольников, описав в нём все необходимые свойства,
подобрав им понятные имена и правильные типы данных.
Опишите в классе конструктор, позволяющий при создании нового объекта явно 
задать все его свойства. Если это необходимо, то проверьте допустимость их 
значений в конструкторе (например, в классе обыкновенных дробей нельзя 
создавать дробь с нулевым знаменателем).
Создайте в классе метод, вычисляющий радиус описанной вокруг многоугольника 
окружности.
С использованием построенного класса создайте семиугольник со стороной 6.
Вычилите с помощью метода и выведите на экран радиус и модуль их суммы.*/
public class RegularPolygon {

    int numberSides;
    double lengthSide;
    final double Pi = 3.14;
    //double radius;

    RegularPolygon(int n, double l) {
        if (n < 3 || l <= 0) {
            System.out.println("Error. Incorrect value of number of "
                    + "sides/length");
        }
        this.numberSides = n;
        this.lengthSide = l;
    }

    double radius() {
        return lengthSide / (2 * Math.sin(Pi / numberSides));
    }

    double perimeter() {
        return numberSides * lengthSide;
    }
}
