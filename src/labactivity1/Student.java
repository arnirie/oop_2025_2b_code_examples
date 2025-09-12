package labactivity1;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    private static int studentCount = 0;

    Student(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa < 65 || gpa > 100){
            System.out.println("Invalid gpa");
            return;
        }
        this.gpa = gpa;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Student Id: %s\n", studentId);
        System.out.println("GPA: " + gpa);
    }

    public static int getTotalStudents(){
        return studentCount;
    }
}
