import model.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class InterfacesFuncionales {
  public static void main(String[] args) {
    /* Consumer<String> consumer = (value) -> System.out.println(value); //No return
    List<String> names = new ArrayList<>();
    names.add("Sebastian");
    names.add("David");
    names.add("Gerard");

    names.forEach(item -> System.out.println(item));
    names.forEach(consumer); */


    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("Perro"));
    animals.add(new Animal("Gato"));
    animals.add(new Animal("Pato"));

    animals.forEach(animal -> changeAnimalName(animal));

    //a function that accepts an argument and, in return, generates a boolean value as an answer is known as a predicate.
    List<Animal> animalsStartsWithP =  animals.stream().filter(animalPredicate("P")).toList();
    animals.forEach(animal -> System.out.println(animal.getName()));
    Predicate<Animal> x = animalPredicate("X");
    boolean startsWithX = x.test(new Animal("Xano"));
    System.out.println(startsWithX);
  }

  public static Predicate<Animal> animalPredicate(String regex){
    return animal -> animal.getName().startsWith(regex);
  }

  public static void changeAnimalName(Animal animal){
    animal.setName(animal.getName().toUpperCase(Locale.ROOT));
  }


}
