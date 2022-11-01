import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login.feature"}
)

public class FeatureRunnerTest {
    @BeforeClass
    public static void executeBeforeTests() {
        Configuration.browserSize = "1600x900";
        Configuration.browser = "chrome";
        Configuration.headless = false;
    }

    @AfterClass
    public static void executeAfterTests() {

    }
}
