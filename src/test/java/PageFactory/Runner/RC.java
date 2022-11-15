package PageFactory.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/PageFactory/Features/Login.feature"},
        glue={"PageFactory.StepDefination"},plugin={"pretty","html:target/HtmlReports"}
       //tags={"@smoke,@regression"}
       //tags={"@smoke","@regression"}
        //tags={("@smoke,@regression"),"@important"}
        //tags={"@regression","~@smoke"}
        //tags={("@smoke,@regression"),"~@important"}

)
public class RC {
}
