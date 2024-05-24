package day9.Task2;

public class Circle extends Figure {

    private int radiosCircle;

    public Circle(int radiosCircle, String color) {
        super(color);
        this.radiosCircle = radiosCircle;
    }

    @Override
    public double area() {
        return Math.PI * (radiosCircle * radiosCircle);
    }


    @Override
    public double perimeter() {
        return 2 * Math.PI * radiosCircle;
    }





}
