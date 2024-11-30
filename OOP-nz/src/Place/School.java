package Place;

public class School extends Place {
    private String mainSubject;

    public School(String name, String address, double rating, int capacity, String contactNumber, String openingHours, String mainSubject) {
        super(name, address, "Школа", rating, capacity, contactNumber, openingHours);
        this.mainSubject = mainSubject;
    }

    @Override
    public String uniqueFeature() {
        return "Основной предмет: " + mainSubject + ".";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}