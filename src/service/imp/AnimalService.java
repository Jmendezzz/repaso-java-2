package service.imp;

import model.Animal;
import service.AnimalFactory;
import service.CrudService;

import java.util.List;

public class AnimalService implements CrudService<Animal>, AnimalFactory {

  @Override
  public void create(Animal animal) {

  }

  @Override
  public List<Animal> getAll() {
    System.out.println("Creando desde animal");
    return  null;
  }

  @Override
  public Animal create() {
    return new Animal("Perro");
  }
}
