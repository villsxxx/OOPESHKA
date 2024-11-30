package Place;

public class Park extends Place {
    private String specialAttraction;

    public Park(String name, String address, double rating, int capacity, String contactNumber, String openingHours, String specialAttraction) {
        super(name, address, "Парк", rating, capacity, contactNumber, openingHours);
        this.specialAttraction = specialAttraction;
    }

    @Override
    public String uniqueFeature() {
        return "Особая достопримечательность: " + specialAttraction + ".";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}