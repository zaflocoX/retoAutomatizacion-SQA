package co.sanangel.com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/AgregarProductos.feature",
        glue = "co.sanangel.com.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AgregarProductosRunner {

}
