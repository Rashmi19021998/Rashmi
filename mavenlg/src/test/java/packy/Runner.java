package packy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"junit:somename.xml"})
//@CucumberOptions(tags="@sanity")
public class Runner {

}
