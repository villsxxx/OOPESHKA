package Person;

public class Schoolboy extends Person {
    private String klass; // Класс

    public Schoolboy(String name, int age, String gender, String occupation, String nationality, int grade) {
        super(name, age, gender, "Школьник", nationality); // Указываем "Школьник" как профессию
        this.klass = klass;
    }

    @Override
    public String describe() {
        return super.describe() + ", Специальность: " + klass;
    }
}
