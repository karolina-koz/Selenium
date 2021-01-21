package zadaniazaliczeniowe;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/create-new-address-mystore.feature",
        plugin = {"pretty","html:out"})

public class zadanie1test {
}
