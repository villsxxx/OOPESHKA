package Action;

public enum Activity {
    WORKS("Работает"),
    EATING("Ест"),
    STUDYING("Учиться"),
    RELAXING("Расслабляется"),
    MEETING("Встречается с коллегой за ланчем");

    private final String description;

    Activity(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}