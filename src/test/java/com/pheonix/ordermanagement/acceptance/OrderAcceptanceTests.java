package com.pheonix.ordermanagement.acceptance;

import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/")
@WebAppConfiguration
public class OrderAcceptanceTests {

}
