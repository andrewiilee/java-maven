package polymorph;

import java.util.List;

/**
 * Created by alee2 on 7/27/18.
 *
 * @author alee2
 */
public class Owner {

    private String name;
    private String address;
    private List<Animal> animalList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }
}
