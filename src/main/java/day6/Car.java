package day6;




public class Car {
    private String model;
    private String color;
    private int data;
    private int inputYear;
    private int yearDifference;

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

    public void setInputYear(int inputYear){
        this.inputYear = inputYear;
    }

    public int getYearDifference(){
        int i = data - this.inputYear ;
        if(i>1)
            yearDifference = data - this.inputYear;
        else if(i<1)
            yearDifference = this.inputYear - data;

        return yearDifference;
    }


    public int getData() {
        return data;
    }

    public void getInfo() {
        System.out.println(getColor() + " " + getModel() + " " + getData() + " года выпуска. Разница: " + getYearDifference());
    }




}