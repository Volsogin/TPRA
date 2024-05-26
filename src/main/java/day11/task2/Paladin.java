package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {

    String name = "Paladin";

    public Paladin(){
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
        healHimself = 25;
        healTeammate = 10;


    }
    public void healHimself() {
        health += healHimself;
    }
    public void healTeammate(Hero hero) {
            hero.health += healTeammate;
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
