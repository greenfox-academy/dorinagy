package com.greenfox.dorinagy.caloriecounter.repository;

import com.greenfox.dorinagy.caloriecounter.model.Meal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
public interface MealRepository extends CrudRepository<Meal, Long> {
  Meal findById(long id);
  List<Meal> findAll();
}
