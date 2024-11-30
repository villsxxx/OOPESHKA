package Place;

public class Restaurant extends Place {
    private String cuisine; // Поле для типа кухни

    public Restaurant(String name, String address, double rating, int capacity, String contactNumber, String openingHours, String cuisine) {
        super(name, address, "Ресторан", rating, capacity, contactNumber, openingHours);
        this.cuisine = cuisine; // Инициализация поля типа кухни
    }

    @Override
    public String uniqueFeature() {
        return "Тематика заведения: " + cuisine + ".";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}