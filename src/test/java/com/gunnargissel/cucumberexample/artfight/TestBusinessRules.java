package com.gunnargissel.cucumberexample.artfight;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by gunnar.gissel on 5/3/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "junit:target/cucumber/black_two_point_oh_sales_list.xml"},
        features = {"classpath:no_anish_kapoor.feature"},
        glue={"com.gunnargissel.cucumberexample.artfight.stepdefs"}
)
public class TestBusinessRules {
}
