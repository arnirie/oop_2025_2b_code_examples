package labactivity1;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("von",20, "123", 95);
        Student student2 = new Student("christian",20, "123", 95);
        Student student3 = new Student("jolo",20, "123", 95);
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student2.study();
        System.out.println(Student.getTotalStudents());
    }
}
