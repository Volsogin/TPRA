package day7;

class Airplane {



    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;
    private int fillup;
    private String model;
    private static String compareAirplanes;



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
    public int getLength(){
        return length;
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


    public static void setcompareAirplanes(int i , int i1 ){


        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane();

        airplane1.setLength(i);
        airplane2.setLength(i1);

        if (airplane1.getLength() > airplane2.getLength())
            compareAirplanes = "Первый самолёт больше второго самолёта.";
        else if (airplane2.getLength() > airplane1.getLength()) {
            compareAirplanes = "Второй самолёт больше первого самолёта.";
        }



    }

    public static void getCompareAirplanes(){
        System.out.println(compareAirplanes);
    }



}