package Place;

import java.util.Objects;

public class Place implements LocationInfo {
    private String name ;
    private String address;
    private String type;
    private double rating;
    private int capacity;
    private String contactNumber;
    private String openingHours;
    // Статическая переменная для хранения общего количества созданных объектов
    private static int count = 0;
    private double latitude;
    private double longitude;

    // Первый статический блок
    static {
        System.out.println("Статический блок 1: Класс Place загружен.");
    }

    // Второй статический блок
    static {
        System.out.println("Статический блок 2: Подготовка к созданию объектов класса Place. Текущее количество объектов: " + count);
    }

    // Первый экземплярный блок
    {
        System.out.println("Создан новый объект Place: " + name);
    }

    // Второй экземплярный блок
    {
        System.out.println("Тип заведения: " + type);
    }


    public Place(String name, String address, String type, double rating, int capacity, String contactNumber, String openingHours) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.rating = rating;
        this.capacity = capacity;
        this.contactNumber = contactNumber;
        this.openingHours = openingHours;
        count++; // Увеличиваем счетчик созданных объектов
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public double getRating() {
        return rating;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public static int getCount() {
        return count; // Метод для получения количества созданных объектов
    }

    public String uniqueFeature() {
        return "Общее описание места: Место где хорошо";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(address, place.address) && Objects.equals(type, place.type) && Objects.equals(contactNumber, place.contactNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, type, contactNumber);
    }

    @Override
    public String toString() {
        return name + " (" + type + ")\n" +
                "Адрес: " + address + "\n" +
                "Рейтинг: " + rating + "\n" +
                "Вместимость: " + capacity + "\n" +
                "Телефон: " + contactNumber + "\n" +
                "Часы работы: " + openingHours;
    }

    @Override
    public double calculateDistance(double lat, double lon) {
        // Реализация логики вычисления расстояния между текущим местоположением и заданной точкой
        return Math.sqrt(Math.pow(latitude - lat, 2) + Math.pow(longitude - lon, 2));
    }

}