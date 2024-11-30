import Person.Person;
import Person.Adult;
import Person.Student;
import Person.Schoolboy;
import Place.Place;
import Place.School;
import Place.Restaurant;
import Place.Park;
import Action.Activity;

public class Main {
    public static void main(String[] args) {
        // Создаем массив мест
        Place[] places = new Place[]{
                new Park("Городской Парк", "Улица Лесная, 10", 4.5, 100, "+7-919-234-43-21", "08:00 - 22:00", "Памятник Достоевскому"),
                new Restaurant("ДиДи", "Улица Гусевочная, 5", 4.5, 100, "+7-953-876-09-90", "10:00 - 23:00", "Итальянская"),
                new Restaurant("Ресторан Вкуса", "Улица Вкуса, 20", 4.8, 150, "+7-923-455-75-69", "09:00 - 00:00", "Итальянская кухня"),
                new School("Библиотека", "Улица Знаний, 15", 4.4, 50, "+7-954-321-43-74", "09:00 - 18:00", "Всеобщая история"),
                new Park("Центральный Парк", "Улица Центральная, 1", 4.7, 200, "+7-912-345-67-89", "07:00 - 21:00", "Фонтан"),
                new Restaurant("Суши-Бар", "Улица Суши, 30", 4.9, 120, "+7-900-123-45-67", "11:00 - 23:00", "Японская кухня"),
                new School("Математическая Школа", "Улица Науки, 25", 4.6, 70, "+7-911-987-65-43", "08:00 - 17:00", "Алгебра")
        };

        // Создаем людей (студенты, школьники и взрослые)
        Person[] persons = new Person[]{
                new Student("Алексей", 20, "Мужской", "Официант", "Русский", "Принж"),
                new Schoolboy("Мария", 17, "Женский", "Школьник", "Русский", 10),
                new Adult("Иван", 40, "Мужской", "Учитель", "Русский", 20),
                new Adult("Ольга", 35, "Женский", "Менеджер", "Русский", 10),
                new Student("Максим", 19, "Мужской", "Сварщик", "Русский", "Исит"),
                new Schoolboy("Екатерина", 16, "Женский", "Школьник", "Русский", 10),
                new Adult("Анастасия", 45, "Женский", "Врач", "Русский", 35),
                new Adult("Дмитрий", 32, "Мужской", "Инженер", "Русский", 2)
        };

        // Создаем массив объектов PersonInPlace с активностями
        PersonInPlace[] personInPlaces = new PersonInPlace[]{
                new PersonInPlace(persons[0], places[0], Activity.RELAXING), // Алексей в Парке
                new PersonInPlace(persons[1], places[2], Activity.EATING), // Мария в Ресторане
                new PersonInPlace(persons[2], places[3], Activity.WORKS), // Иван в Библиотеке
                new PersonInPlace(persons[3], places[1], Activity.MEETING), // Ольга в Кинотеатре
                new PersonInPlace(persons[4], places[4], Activity.RELAXING), // Максим в Центральном Парке
                new PersonInPlace(persons[5], places[5], Activity.EATING), // Екатерина в Суши-Баре
                new PersonInPlace(persons[6], places[6], Activity.STUDYING), // Анастасия в Математической Школе
                new PersonInPlace(persons[7], places[0], Activity.RELAXING)  // Дмитрий в Городском Парке
        };

        // Вывод информации о каждом человеке и месте, где он находится
        System.out.println(" ");
        System.out.println("Люди в местах города:");
        System.out.println(" ");
        for (PersonInPlace personInPlace : personInPlaces) {
            System.out.println(personInPlace);
            System.out.println(" ");
            System.out.println(" ");
        }

        // Вывод информации о местах и их уникальных особенностях
        for (Place place : places) {
            System.out.println(place.toString());
            System.out.println(place.uniqueFeature());
            System.out.println();
            place.displayWeatherInfo();
        }

        System.out.println("Общее количество созданных объектов класса Place: " + Place.getCount());
        System.out.println("Количество созданных объектов Person: " + Person.getPersonCount());
    }


}