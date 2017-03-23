package homework5;

public class Homework5 {

    public static void main(String[] args) {
        //прямоугольники
        Rectangle myRectangle1 = new Rectangle(3, 8);
        Rectangle myRectangle2 = new Rectangle(6, 4);

        double sq1, sq2;

        sq1 = myRectangle1.area();
        System.out.println("Rectangle1 area is: " + sq1);

        sq2 = myRectangle2.area();
        System.out.println("Rectangle2 area is: " + sq2);

        myRectangle1.equalArea(sq1, sq2);

        System.out.println();
        
        //окружности
        Circle myCircle1 = new Circle(0, 0, 12);
        Circle myCircle2 = new Circle(3, 5, 11);

        double cSq1, cSq2;

        cSq1 = myCircle1.circleSquare();
        System.out.println("Circle1 square is: " + cSq1);

        cSq2 = myCircle2.circleSquare();
        System.out.println("Circle2 square is: " + cSq2);

        myCircle1.equalCircleSquare(cSq1, cSq2);
        System.out.println();
        
        //многоугольники
        RegularPolygon myPoly1 = new RegularPolygon(7, 6);

        double radP, perP;

        radP = myPoly1.radius();
        System.out.println("Radius is: " + radP);

        perP = myPoly1.perimeter();
        System.out.println("Perimeter is: " + perP);
        System.out.println();
        
        //треугольники
        Triangle myTriangle1 = new Triangle(3, 4);

        double h;

        h = myTriangle1.height();
        System.out.println("Height is: " + h);
    }

}
