package it.develhope.methods;

public class Teacher {

    public String teacherName;

    public Teacher(){
        System.out.println("New teacher!");
    }

    public void assignGrade(Student alum, int finalGrade){
        alum.grade = finalGrade;
    }

}
