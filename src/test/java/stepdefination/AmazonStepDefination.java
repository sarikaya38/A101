package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class AmazonStepDefination {
    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {

    }
    @Then("sonucun nutella icerdigini kontrol eder")
    public void sonucun_nutella_icerdigini_kontrol_eder() {

    }

}
