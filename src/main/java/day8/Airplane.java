package day8;

class Airplane {



    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;
    private int fillup;
    private String model;


    public Airplane(String manufacturer, int year, int length, int weight, int fillup, String model) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.model = model;
        this.fillup = fillup;

    }

    public void setfuel(int fuel){
        this.fuel = fuel;
    }

    public int getFuel(){
        return fuel;
    }
    public String getModel(){
        return model;
    }

    public int getFillup(){
        return fillup;
    }






    public void info(){
        setfuel(+getFillup());
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + " метров, " +
                "вес: " + weight + " кг, количество топлива в баке: " + getFuel() +  " литров." );
    }

    public String toString(){
        setfuel(+getFillup());
        return "Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + " метров, " +
                "вес: " + weight + " кг, количество топлива в баке: " + getFuel() +  " литров.";
    }









}
