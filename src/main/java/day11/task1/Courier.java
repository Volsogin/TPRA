package day11.task1;

public class Courier extends Warehouse implements Worker {

    private int salary;
    private boolean isPayed;


    public void doWork() {
        salary += 100;
        countDeliveredOrders++;
    }

    public void bonus() {
        if(countDeliveredOrders >= 10000){
            isPayed = true;
            salary += 50000;
        }
        else if(isPayed)
            System.out.println("Бонус уже выплачен");

        else if(countDeliveredOrders < 10000)
            System.out.println("Бонус пока не доступен");
    }


    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString(){
        return getSalary() + " - зарплата курьера. Доставленных заказов " + getCountDeliveredOrders();
    }


}
