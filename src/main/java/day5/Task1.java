package day5;

public class Task1 {
    public static void main(String[] args) {
        Car huananzhi = new Car();
        huananzhi.setModel("Huananzhi Type ZeroY");
        huananzhi.setData(2024);
        huananzhi.setColor("Белый");
        System.out.println("Всем привет, братья. Взял себе новый "+huananzhi.getColor() +
                " " + huananzhi.getModel() + ". Взял последнюю модель " + huananzhi.getData() +" года выпуска" );
        System.out.println(huananzhi.getColor() + " " + huananzhi.getModel() + " " + huananzhi.getData());









    }
}
class Car {
    private String model;
    private String color;
    private int data;
    public void setModel(String AutoModel) {
     model = AutoModel;
    }
    public String getModel() {
        return model;
    }

    public void setColor(String AutoColor) {
        color = AutoColor;
    }

    public String getColor() {
        return color;
    }
    public void setData(int AutoData) {
        data = AutoData;
    }
    public int getData() {
        return data;
    }





}





