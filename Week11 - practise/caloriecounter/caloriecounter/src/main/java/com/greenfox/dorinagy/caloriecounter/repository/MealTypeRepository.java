package com.greenfox.dorinagy.caloriecounter.repository;

import com.greenfox.dorinagy.caloriecounter.model.Type;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
public interface MealTypeRepository extends CrudRepository<Type, Long> {
}
