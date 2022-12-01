package it.develhope.methods;

public class Student {

    public String name;
    public int grade;

    public Student(String studentName){
        System.out.println("New student!");
        this.name = studentName;
    }

    public void getStudentsDetails(){
        System.out.println("The student name is " + name + " and his/her grade is " +  grade);
    }


}
