package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\PragatiSharma\\IdeaProjects\\NopCommerceBddPropertiesAndExcel\\src\\test\\java\\FeatureFile\\Book.feature"},
        glue = {"stepDefinition"},
        monochrome = true,
        plugin = {"pretty", "json:Report/Cucumber.json", "junit:Report/XMLReport.xml",
                "html:Report/cucumberReport"}
)
class Runner1  {
}

