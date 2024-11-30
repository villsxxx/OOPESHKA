package Person;

public class Student extends Person {
    private String major; // Специальность

    public Student(String name, int age, String gender, String occupation, String nationality, String major) {
        super(name, age, gender, occupation, nationality);
        this.major = major;
    }

    @Override
    public String describe() {
        return super.describe() + ", Специальность: " + major;
    }
}