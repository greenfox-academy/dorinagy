package com.greenfox.model;

/**
 * Created by Nagy Dóra on 2017.05.10..
 */
public class Append implements ResponseObject {

  private String appended;

  public Append(String input) {
    this.appended = input + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
