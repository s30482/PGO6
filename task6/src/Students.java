import java.util.ArrayList;
import java.util.List;
class Students {
    private static List<Student> allStudents = new ArrayList<>();

    public static void addStudent(Student student) {
        allStudents.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : allStudents) {
            if (student.getCurrentSemester() < student.getStudyProgramme().getNumberOfSemesters()) {
                student.promoteToNextSemester();
            } else {
                student.setStudentStatus("Absolwent");
            }
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : allStudents) {
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Numer indeksu: " + student.getIndexNumber());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Adres: " + student.getAddress());
            System.out.println("Numer telefonu: " + student.getPhoneNumber());
            System.out.println("Program studiów: " + student.getStudyProgramme().getName());
            System.out.println("Aktualny semestr: " + student.getCurrentSemester());
            System.out.println("Status: " + student.getStudentStatus());
            System.out.println();
        }
    }
    public static void enrollStudentToFirstSemester(Student student, StudyProgramme studyProgramme) {
        student.setStudyProgramme(studyProgramme);
        student.setCurrentSemester(1);
    }

    public static void addGradeToStudent(Student student, int grade, String courseName) {
        student.addGrade(grade, courseName);
    }
}