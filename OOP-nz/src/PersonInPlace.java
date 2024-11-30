import Person.Person;
import Place.Place;
import Action.Activity;

public class PersonInPlace {
    private Person person;
    private Place place;
    private Activity activity; // Добавим активность

    public PersonInPlace(Person person, Place place, Activity activity) {
        this.person = person;
        this.place = place;
        this.activity = activity; // Инициализируем активность
    }

    @Override
    public String toString() {
        return person.toString() + "\nнаходится в " + place.toString() +
                "\nДеятельность в месте: " + activity.getDescription(); // Выводим активность
    }
}