package labactivity1;

public class StudentQuiz {
    private String fullName;
    private double grade;
    private int age;
    private static int totalStudents;

    static {
        totalStudents = 0;
    }

    StudentQuiz(String fullName, double grade, int age){
        this.fullName = fullName;
        this.grade = grade;
        this.age   =  age;
        totalStudents++;
    }

    String getFullName(){
        return this.fullName;
    }

    double getGrade(){
        return this.grade;
    }

    int getAge(){
        return this.age;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static int getTotalStudents(){
        return totalStudents;
    }

    void displayInfo(){
        System.out.println();
    }
}
