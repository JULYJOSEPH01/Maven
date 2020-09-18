package com.testrunner;



import org.junit.runner.RunWith;

import com.intuit.karate.junit4.Karate;

import cucumber.api.CucumberOptions;

@RunWith(Karate.class)
	@CucumberOptions(features = "src\\test\\java\\com\\feature\\Test.features"

	)
	public class Testrunner {

	}


