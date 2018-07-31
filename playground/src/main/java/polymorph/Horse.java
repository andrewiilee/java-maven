package polymorph;

/**
 * Created by alee2 on 7/27/18.
 *
 * @author alee2
 */
public class Horse extends Animal implements Medicine {

    private boolean vaccinated;

    @Override
    public boolean vaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
