package it.develhope.methods;

public class Testing {

    public static void main(String[] args) {

        Student student1 = new Student("Paolo");
        Student student2 = new Student("Steve");

        Teacher teacher1 = new Teacher();
        teacher1.teacherName = "Signorina Rossi";

        student1.grade = 4;
        student2.grade = 2;

        student1.getStudentsDetails();
        student2.getStudentsDetails();

        /*
        l'esercizio non chiede la stampa del/della teacher ma in caso basterebbe fare
        public void getTeacherDetails(){
        System.out.println("The teacher name is " + name);

        il tutto nella classe Teacher

        e poi fare teacher.getTeacherDetails() qui in Testing

        come fatto nel caso di student, magari facendo anche un this.teacherName = nameTeacher passando
        nameTeacher come parametro in public Teacher()
         */
    }
}
