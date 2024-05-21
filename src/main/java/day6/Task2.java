package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane PRP = new Airplane();
    PRP.setFillUp(1000);
    PRP.setYear(2020);
    PRP.setLength(42);
    PRP.getInfo();




    }



}




class Airplane {



    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;
    private int fillup;
    private String model;

    public void setmf(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public int getFuel(){
        return fuel;
    }

    public void setFillUp(int Fillup){
        this.fillup = Fillup;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){

        return model;
    }

    public int getFillup(){
        return fillup;
    }






    public void getInfo(){
        setFuel(+getFillup());
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + " метров, " +
                "вес: " + weight + " кг, количество топлива в баке: " + getFuel() +  " литров." );
    }


    public Airplane() {
        this.manufacturer = "Италия";
        this.year = 2018;
        this.length = 40;
        this.weight = 20000;
        this.model = "Type S.M.E.H.";


    }




}

