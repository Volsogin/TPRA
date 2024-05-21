package day6;



class Motorbike {
    private String model;
    private String color;
    private int date;
    private int yearDifference;
    private int inputYear;
    int i = 0;



    public Motorbike(String model, String color, int date, int inputYear) {
        this.model = model;
        this.color = color;
        this.date = date;
        this.inputYear = inputYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDate() {
        return date;

    }

    public int getYearDifference(){
        int i = date - this.inputYear ;
        if(i>1)
            yearDifference = date - this.inputYear;
        else if(i<1)
            yearDifference = this.inputYear - date;

        return yearDifference;
    }




    public void getInfo() {
        System.out.println(getColor() + " " + getModel() + " " + getDate() + " года выпуска. Разница: " + getYearDifference());
    }


}












