package com.greenfox.dorinagy.caloriecounter.model;

import java.sql.Date;

/**
 * Created by Nagy Dóra on 2017.06.01..
 */
public class Meal {
  private Date date;
  private String type;
  private String description;
  private int calories;

  public Meal() {
  }

  public Meal(Date date, String type, String description, int calories) {
    this.date = date;
    this.type = type;
    this.description = description;
    this.calories = calories;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }
}
