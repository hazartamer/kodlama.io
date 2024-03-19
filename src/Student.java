public class Student extends User{
    private String studentId;

    public Student(String fullName, String userName, String password, int age, String studentId) {
        super(fullName, userName, password, age);
        this.studentId = studentId;
    }
}
