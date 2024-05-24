package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student Max = new Student("Макс","Англичане");
        Teacher Aleksey = new Teacher("Алексей", "Программирование");
        System.out.println(Max.getGroupname());
        Max.printInfo();
        System.out.println(Aleksey.getSubjectname());
        Aleksey.printInfo();

    }
}
