package com.greenfox.dorinagy.caloriecounter.service;

import com.greenfox.dorinagy.caloriecounter.model.Meal;
import com.greenfox.dorinagy.caloriecounter.repository.MealRepository;
import com.greenfox.dorinagy.caloriecounter.repository.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nagy Dóra on 2017.06.02..
 */
@Service
public class MealService {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  public void addNewMeal(Meal meal){
    mealRepository.save(meal);
  }

  public void deleteMeal(long id) {
    mealRepository.delete(id);
  }

  public int sumCalories(Iterable<Meal> meals) {
    int sumCalories = 0;
    meals = mealRepository.findAll();
    for(Meal meal : meals) {
      sumCalories += meal.getCalories();
    }
    return sumCalories;
  }
}