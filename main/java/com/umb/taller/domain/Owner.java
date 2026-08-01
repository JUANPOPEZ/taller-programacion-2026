import java.util.ArrayList;
import java.util.List;

public class Owner {

    private String name;
    private List<Animal> animals;

    public Owner(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal cannot be null");
        }
        animals.add(animal);
    }

    public void displayAnimalNames() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
