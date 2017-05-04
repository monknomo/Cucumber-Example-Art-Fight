package com.gunnargissel.cucumberexample.artfight.stepdefs;

import com.gunnargissel.cucumberexample.artfight.BusinessRules;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

/**
 * Created by gunnar.gissel on 5/3/2017.
 */
public class Stepdefs {
  public Stepdefs() {
  }

  @Given("^a purchaser, (.*), Black 2\\.0 is (not saleable|saleable)$")
  public void testWhoCanPurchaseBlackTwoPointOh(String purchaser, String saleable) {
    boolean actual_saleable = BusinessRules.saleable(purchaser);
    boolean expected_saleable = saleable.equals("saleable");
    assertEquals(expected_saleable, actual_saleable);
  }

}
