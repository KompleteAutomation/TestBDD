package test.cucu;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = {"stepDefinition"},
//		tags = {"@Weekly","@Daily"}
//		tags = {"@Weekly,@Daily"}
		tags = {"~@Weekly"}
		
		
		)
public class TestRunner {
	
		@AfterClass
		public static void writeExtentReport() throws IOException {

		}
		
}