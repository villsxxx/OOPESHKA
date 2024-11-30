package Person;

public class Adult extends Person {
    private int workExperience; // Стаж работы в годах

    public Adult(String name, int age, String gender, String occupation, String nationality, int workExperience) {
        super(name, age, gender, occupation, nationality);
        this.workExperience = workExperience;
    }

    @Override
    public String describe() {
        return super.describe() + "Стаж работы: " + workExperience + " лет";
    }

    @Override
    public String toString() {
        return describe();
    }
}