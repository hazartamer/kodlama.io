public class Driver {
    public static void main(String[] args) {
        Education education1 = new Education("Java",false,0);
        Student student = new Student("Ahmet Haşim","ahmethasim01","123456",20,"01");
        Teacher teacher = new Teacher("Rasim Tamer","rasimtamer01","123456",30,"01",new Education("Java"));
        }
    }

