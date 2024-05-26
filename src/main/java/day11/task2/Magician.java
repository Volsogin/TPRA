package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    String name = "Magician";

    public Magician(){
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.8;
    }

    public void physicalAttack(Hero hero) {
        hero.health -= (physAtt - physAtt*hero.physDef);
    }

    public void magicalAttack(Hero hero) {
        hero.health -= (magicAtt - magicAtt*hero.magicDef);
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
