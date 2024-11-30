package Person;

import java.util.Objects;

public class Person {
    private String name;
    private int age ;
    private String gender;
    private String occupation;
    private String nationality;
    // Статическая переменная для хранения общего количества созданных объектов Person
    private static int personCount = 0;

    // Первый статический блок
    static {
        System.out.println("Класс Person загружен.");
    }
    // Второй статический блок
    static {
        System.out.println("Общее количество созданных объектов Person: " + personCount);
    }

    // Первый экземплярный блок
    {
        System.out.println("Создан новый объект Person: " + name);
    }

    // Второй экземплярный блок
    {
        System.out.println("Текущий возраст: " + age);
    }



    public Person(String name, int age, String gender, String occupation, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.nationality = nationality;
        // Увеличиваем счетчик при создании нового объекта
        personCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getNationality() {
        return nationality;
    }

    public static int getPersonCount() {
        return personCount;
    }

    // Полиморфный метод
    public String describe() {
        return "Общие сведения о человеке: " + name + "\n" +
                "Возраст: " + age + " лет\n " +
                "Пол: " + gender + "\n " +
                "Профессия:  " + occupation +  "\n " +
                "Национальность: " + nationality + "\n " ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(gender, person.gender) && Objects.equals(occupation, person.occupation) && Objects.equals(nationality, person.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, occupation, nationality);
    }

    @Override
    public String toString() {
        return name + "\n" +
                "Возраст: " + age + " лет\n" +
                "Пол: " + gender + "\n" +
                "Национальность: " + nationality+ "\n" +
                "Профессия: " + occupation;
    }
}