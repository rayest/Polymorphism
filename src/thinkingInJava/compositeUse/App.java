package thinkingInJava.compositeUse;

/**
 * Created by Rayest on 2016/6/7 0007.
 */

//每一个类都有toString方法，用于返回对象本身
class Student {
    private String description;

    public Student(){
        System.out.println("Student()");
        description = "Students Who should be the hope of the state!";
    }

    public String toString(){
        return description;
    }
}

class Lesson{
    Student student = new Student();

    public String toString(){
        return "" + student;
    }
}

public class App{
    public static void main(String[] args) {
        Lesson lesson = new Lesson();
        System.out.println(lesson);
    }
}
