package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike voge = new Motorbike("Voge 300R", "Чёрный", 2024);
        voge.getInfo();







    }
}

class Motorbike {
    private String model;
    private String color;
    private int date;

    public Motorbike(String model, String color, int date) {
        this.model = model;
        this.color = color;
        this.date = date;
    }

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDate(){
        return date;
    }
    public void getInfo(){
        System.out.println(getColor() + " " + getModel() + " " + getDate() + " года выпуска");
    }













}







