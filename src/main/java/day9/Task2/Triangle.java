package day9.Task2;

public class Triangle extends Figure {

    private int fLength;
    private int sLength;
    private int tLength;

    public Triangle(int fLength, int sLength, int tLength, String color) {
        super(color);
        this.fLength = fLength;
        this.sLength = sLength;
        this.tLength = tLength;
    }
    double p = (fLength + sLength + tLength) / 2;

    @Override
    public double area() {
        return Math.sqrt(p * (p - fLength) * (p - sLength) * (p - tLength));
    }

    @Override
    public double perimeter() {
        return fLength + sLength + tLength;
    }



}
