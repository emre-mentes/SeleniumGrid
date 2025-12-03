package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefs {

    WebDriver driver;

    @Given("kullanici {string} adresine {string} ile gider")
    public void kullanici_adresine_ile_gider(String url, String browser) throws URISyntaxException, MalformedURLException {

        URL remoteUrl = new URL("http://192.168.2.103:4444");

        if (browser.equalsIgnoreCase("chrome")){
            driver = new RemoteWebDriver(remoteUrl, new ChromeOptions());

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new RemoteWebDriver(remoteUrl, new FirefoxOptions());

        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new RemoteWebDriver(remoteUrl, new EdgeOptions());
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        driver.get(url);




    }
    @When("kullanici basligin {string} icerdigin dogrula")
    public void kullanici_basligin_icerdigin_dogrula(String title) {
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains(title));


    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        driver.quit();
;
    }


}
