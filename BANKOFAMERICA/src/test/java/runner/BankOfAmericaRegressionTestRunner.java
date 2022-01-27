package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // For single feature file
        //features = {"src/test/java/com/amazon/features/SignIn.feature"},
        // For Multiple feature file


        // The path of the step Definition files
        //glue = "src/test/java/com/amazon/steps",


        // display the console output in a proper readable format


        // to check the mapping is proper between feature file and step definition file


        // it will check if any step is not defined in step definition file
        //strict = true,
        // To Generate different type of Reports



        //tags = "@RegressionTest and @SmokeTest and @mahmud and not @pending"
        //tags = "(   @mahmud   ) and (not @pending)"
        //tags = "(@SmokeTest or @RegressionTest or @IntegrationTest ) and (not @pending)"
        //tags= "(@junaid ) and (not @pending)"


)


public class BankOfAmericaRegressionTestRunner {


}
