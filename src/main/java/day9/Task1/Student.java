package day9.Task1;

public class Student extends Human{

    private String groupname;

    public Student(String name, String groupname) {
        super(name);
        this.groupname = groupname;
    }

    public String getGroupname(){
        return groupname;
    }

    void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем: " + getName());
    }


}
