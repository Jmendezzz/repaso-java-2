package service;

import model.Animal;

import java.util.List;

public interface CrudService<T> {

  void create(T t);
  List<T> getAll();

}
