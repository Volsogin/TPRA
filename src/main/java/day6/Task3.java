package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher Void = new Teacher();
        Student Alex = new Student();
        Void.setNameT("Войд");
        Alex.setNameS("Алекс");
        Void.setLesson("Гиперфизикохимическотехнологическая наука");
        Void.evaluate();
        System.out.println("Преподаватель "+ Void.getNameT() + " оценил студента с именем " +
                Alex.getNameS() + " по предмету "+ Void.getLesson() + " на оценку "+ Void.Mark+"."
        );







    }
}
class Teacher {
    private String NameT;
    private String lesson;
    String Mark = " ";
    Random rand = new Random();

    public void setNameT(String NameT) {
        this.NameT = NameT;
    }

    public String getNameT() {
        return NameT;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    void evaluate() {
        int i = 0;
        i = rand.nextInt(4);
        i = i + 2;
        if(i == 2)
            Mark = "Неудовлетворительно";
        else if(i == 3)
            Mark = "Удовлетворительно";
        else if (i == 4)
            Mark = "Хорошо";
        else if (i == 5)
            Mark = "Отлично";
        }
    }
















class Student{
    private String NameS;


    public void setNameS(String NameS){
        this.NameS = NameS;
    }
    public String getNameS(){
        return NameS;
    }

}






