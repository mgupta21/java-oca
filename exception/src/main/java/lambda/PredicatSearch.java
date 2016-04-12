package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Mayank on 12/13/2015.
 */
public class PredicatSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", true, true));
        animals.add(new Animal("cat", false, false));
        animals.add(new Animal("bird", true, false));

        List<String> names = getAnimalsThatHop(animals,(Animal a) -> a.canHop);
        System.out.println(names.toString());

    }

    public static List<String> getAnimalsThatHop(List<Animal> animals, Predicate<Animal> checker) {
        List<String> names = new ArrayList<>();
        for(Animal animal : animals){
            if(checker.test(animal)) {
                names.add(animal.name);
            }
        }
        return names;
    }

}
