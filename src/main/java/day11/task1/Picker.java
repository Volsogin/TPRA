package day11.task1;

public class Picker extends Warehouse implements Worker {

    private int salary;
    private boolean isPayed;



    public void doWork() {
        salary += 80;
        countPickedOrders++;
    }

    public void bonus() {

        if(isPayed)
            System.out.println("Бонус уже выплачен");

        else if(countPickedOrders >= 10000){
            isPayed = true;
            salary += 70000;
        }


        else if(countPickedOrders < 10000)
            System.out.println("Бонус пока не доступен");
    }




    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString(){
        return getSalary() + " - зарплата сборщика. Собранных заказов " + getCountPickedOrders();
    }


}
