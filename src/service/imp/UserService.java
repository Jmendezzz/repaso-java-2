package service.imp;

import service.CrudService;

import java.util.List;

public class UserService implements CrudService<String> {
  @Override
  public void create(String s) {

  }

  @Override
  public List<String> getAll() {
    System.out.println("Creando desde user");
    return null;
  }
}
