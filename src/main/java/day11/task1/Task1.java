package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker){
         for(int i = 0; i<10000; i++)
             worker.doWork();
             worker.bonus();
    }

    public static void main(String[] args) {

        Warehouse Wildberries = new Warehouse();
        Picker Vladimir = new Picker();
        Courier Anatoliy = new Courier();

        businessProcess(Vladimir);
        businessProcess(Anatoliy);

        System.out.println("Wildberries");

        System.out.println(Vladimir);
        System.out.println(Anatoliy);


        System.out.println("Ozon");

        Warehouse Ozon = new Warehouse();
        Picker Artem = new Picker();
        Courier Roman = new Courier();

        businessProcess(Artem);
        businessProcess(Roman);

        System.out.println(Artem);
        System.out.println(Roman);


    }
}
