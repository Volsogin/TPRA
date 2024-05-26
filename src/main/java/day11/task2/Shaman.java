package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {

    String name = "Shaman";

    public Shaman(){
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
        healHimself = 50;
        healTeammate = 30;

    }

    public void healHimself() {
        health += healHimself;
    }


    public void healTeammate(Hero hero) {
        hero.health += healTeammate;
    }

    public void magicalAttack(Hero hero) {
        hero.health -= (magicAtt - magicAtt*hero.magicDef);
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
