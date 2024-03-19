public class User {
    private String fullName;
    private String userName;
    private String password;
    private int age;


    public User(String fullName, String userName, String password, int age) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public User() {
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
