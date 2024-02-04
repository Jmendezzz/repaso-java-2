import model.Animal;
import service.AnimalFactory;
import service.CrudService;
import service.imp.AnimalService;
import service.imp.AnimalService2;

public class Main {
  public static void main(String[] args) {
    CrudService<Animal> cr = new AnimalService2();

    AnimalFactory factory =new AnimalService();
    Animal animal = factory.create();
    System.out.println(animal.getName());
    cr.getAll();
  }
}