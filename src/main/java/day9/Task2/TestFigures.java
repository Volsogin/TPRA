package day9.Task2;

public class TestFigures {
    static int in = 0;


    public static void main(String[] args) {

        TestFigures.calculateRedArea(new Figure[]{
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")


        });

        TestFigures.calculateRedPerimeter(new Figure[]{
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")

        });














    }


    public static int FullP = 0;
    public static int FullPL = 0;

    public static double calculateRedPerimeter(Figure[] figures){
        for(int i = 0; i<=7; i++) {
            boolean bool = "Red".equals(figures[i].getColor());
            if(bool){
                FullP += figures[i].perimeter();
            }
            in++;


        }
        System.out.println(FullP + " - Сумма всех периметров ");
        return FullP;
    }
    public static double calculateRedArea(Figure[] figures){
        for(int i = 0; i<=7; i++) {
            boolean bool = "Red".equals(figures[i].getColor());
            if(bool){
                FullPL += figures[i].area();

            }


        }
        System.out.println(FullPL + " - Сумма всех площадей");
        return FullPL;
    }




}
