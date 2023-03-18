import package1.Circle;
import package1.GeometricFigure;
import package1.Square;
import package1.Triangle;

public class Main {
    public static void main(String[] args) {


        GeometricFigure[] figure = new GeometricFigure[3];
        figure[0] = new Circle(5);
        figure[1] = new Square(4);
        figure[2] = new Triangle(3,2);


        double totalArea = 0;

        for (GeometricFigure figure1 : figure) {
                totalArea += figure1.getArea();
        }

        System.out.println("The total area of all figures is " + totalArea);

    }
}