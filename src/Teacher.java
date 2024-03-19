public class Teacher extends User{

private String teacherId;
private Education education;
    public Teacher(String fullName, String userName, String password, int age, String teacherId,Education education) {
        super(fullName, userName, password, age);
        this.teacherId=teacherId;
        this.education=education;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }
}
