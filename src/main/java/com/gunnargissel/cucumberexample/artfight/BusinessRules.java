package com.gunnargissel.cucumberexample.artfight;

/**
 * Created by gunnar.gissel on 5/3/2017.
 */
public class BusinessRules {

  /**
   * Validates whether a purchaser is allowed to purchase Black 2.0
   * @param purchaser A full name
   * @return a boolean indicating whether purchaser is allowed to purchase Black 2.0
   */
  public static final boolean saleable(String purchaser){
    return !purchaser.equals("Anish Kapoor");
  }

}
