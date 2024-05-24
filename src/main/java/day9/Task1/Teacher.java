package day9.Task1;

public class Teacher extends Human {

    private String subjectname;

    public Teacher(String name, String subjectname) {
        super(name);
        this.subjectname = subjectname;
    }

    public String getSubjectname(){
        return subjectname;
    }

    void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем: " + getName());
    }


}
