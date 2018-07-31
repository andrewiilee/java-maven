package polymorph;

import java.util.ArrayList;
import org.junit.Test;

/**
 * Created by alee2 on 7/27/18.
 *
 * @author alee2
 */
public class PolyMorphTest {

    @Test
    public void vet_data_test() {
        Owner owner = new Owner();
        Bird bird = new Bird();
        bird.setAppointment("1300");

        Cat cat = new Cat();
        cat.setAppointment("2000");
        cat.setVaccinated(false);

        Horse horse = new Horse();
        horse.setAppointment("1800");
        horse.setVaccinated(true);

        owner.setAnimalList(new ArrayList<>());
        owner.getAnimalList().add(bird);
        owner.getAnimalList().add(cat);
        owner.getAnimalList().add(horse);

        for (Animal animal : owner.getAnimalList()) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println("Appointment: " + animal.getAppointment());
        }

        for (Animal animal : owner.getAnimalList()) {
            if (animal instanceof Medicine) {
                System.out.println(animal.getClass().getSimpleName());
                System.out.println("Vaccinated: " + ((Medicine) animal).vaccinated());
            }
        }

    }
}
