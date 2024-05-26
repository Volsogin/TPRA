package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    String name = "Warrior";

    public Warrior(){
        physAtt = 30;
        physDef = 0.8;
        magicDef = 0;



    }





    public void physicalAttack(Hero hero) {
        hero.health -= (physAtt - physAtt*hero.physDef);
    }

    public String toString(){
        if(health < 0){
            health = 0;
        } else if (health > 100) {
            health = 100;
        }
        return name + "{health = " + health + "}";
    }



}
