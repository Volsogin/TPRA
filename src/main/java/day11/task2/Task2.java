package day11.task2;

public class Task2 {

    public static void main(String[] args) {




        Warrior Warrior = new Warrior();
        Paladin Paladin = new Paladin();
        Magician Magician = new Magician();
        Shaman Shaman = new Shaman();



        Warrior.physicalAttack(Paladin);
        System.out.println(Paladin);
        Paladin.physicalAttack(Magician);
        System.out.println(Magician);
        Shaman.healTeammate(Magician);
        System.out.println(Magician);
        Magician.magicalAttack(Paladin);
        System.out.println(Paladin);
        Shaman.physicalAttack(Warrior);
        System.out.println(Warrior);
        Paladin.healHimself();
        System.out.println(Paladin);

        for(int i = 0; i<5; i++){
            Warrior.physicalAttack(Magician);
            System.out.println(Magician);
        }






    }
}
