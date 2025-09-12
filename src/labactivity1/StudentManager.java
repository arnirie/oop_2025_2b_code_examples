package labactivity1;

import java.util.Scanner;

public class StudentManager {
    static final int MAX_STUDENTS  = 3;
    static Student[] students = new Student[MAX_STUDENTS];
    static Scanner sc = new Scanner(System.in);
    static int studentIndex = 0;

    public static void main(String[] args) {
        String input = "";
        do{
            displayMenu();
            input = sc.nextLine();
            switch (input.toUpperCase()){
                case "A":
                    addStudent();
                    break;
                case "B":
                    removeStudent();
                    break;
                case "C":
                    displayAll();
                    break;
            }
        }while(!input.toUpperCase().equals("D"));
    }

    public static void displayMenu(){
        System.out.println("=== Student Management System ===");
        System.out.println("A. Add Student");
        System.out.println("B. Remove Student by ID");
        System.out.println("C. Display All Students");
        System.out.println("D. Exit");
        System.out.print("Choose an option: ");
    }

    public static void addStudent(){
        if(studentIndex == MAX_STUDENTS){
            System.out.println("Array is full");
            return;
        }
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        System.out.print("Enter gpa: ");
        double gpa = sc.nextDouble();
        sc.nextLine();
        students[studentIndex++] = new Student(name, age, id, gpa);
//        //create an object
//        Student student = new Student(name, age, id, gpa);
//        //add array
//        students[studentIndex++] = student;
    }

    private static void displayAll(){
//        for(Student s : students){
//            s.displayInfo();
//        }
        if(studentIndex == 0) {
            System.out.println("No students to display");
            return;
        }
        for(int i = 0 ; i < studentIndex ; i++){
            students[i].displayInfo();
        }
        System.out.println("Total students: " + Student.getTotalStudents());
    }

    private static void removeStudent(){
        //search id
        System.out.print("Enter ID to remove: ");
        String searchId = sc.nextLine();
        int searchIndex = findIndex(searchId);
        if(searchIndex < 0){
            System.out.println("Student not found");
            return;
        }
        //shift
        for(int i = searchIndex ; i < studentIndex - 1; i++){
            students[i] = students[i+1];
        }
        students[--studentIndex] = null;
        System.out.println(searchId + " was removed");
    }

    private static int findIndex(String id){
        for(int i = 0 ; i < studentIndex ; i++){
            if(students[i].getStudentId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
