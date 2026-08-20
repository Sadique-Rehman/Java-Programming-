class Student {

    private String studentID;
    private String studentName;
    private String department;

    Student(String studentID, String studentName, String department) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
    }

    void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
    }
}

class UndergraduateStudent extends Student {

    private int semester;
    private double cgpa;

    UndergraduateStudent(String studentID, String studentName, String department, int semester, double cgpa) {
        super(studentID, studentName, department);
        this.semester = semester;
        this.cgpa = cgpa;
    }

    void displayUGDetails() {
        displayStudentDetails();
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {

    private String specialization;
    private String researchTopic;

    PostgraduateStudent(String studentID, String studentName, String department, String specialization, String researchTopic) {
        super(studentID, studentName, department);
        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }

    void displayPGDetails() {
        displayStudentDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        UndergraduateStudent ugStudent = new UndergraduateStudent("UG101", "Arjun Mehta", "Computer Science", 5, 8.7);
        PostgraduateStudent pgStudent = new PostgraduateStudent("PG201", "Sneha Rao", "Computer Science", "Artificial Intelligence", "Deep Learning Models");

        System.out.println("---- Undergraduate Student Details ----");
        ugStudent.displayUGDetails();

        System.out.println("\n---- Postgraduate Student Details ----");
        pgStudent.displayPGDetails();
    }
}