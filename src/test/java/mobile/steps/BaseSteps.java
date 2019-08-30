package mobile.steps;

import config.Config;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driver.MobileDriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import keywords.KeyWords;
import mobile.support.Hooks;
import objectRepository.ObjectRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static config.Constants.DEFAULT_TIMEOUT;

public class BaseSteps {
    private static MobileDriverFactory factory;
    private RemoteWebDriver driver;
    public Config config;
    public  ObjectRepo repo;
    public  KeyWords keyWord;

    public BaseSteps()throws Exception {
        Thread.sleep(10000);
    }

    @Given("^the app is open$")
    public void OpenApp() throws Exception{
        config = new Config(); // Set the config values directly in the Config class (not in Hooks).
        factory = new MobileDriverFactory(config);
        driver = factory.createDriver();
        driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        repo = new ObjectRepo(driver);
        Thread.sleep(10000);
        keyWord = new KeyWords();
    }

    @Then("^I should see the splash screen$")
    public void Verifyonj()throws Exception{

        keyWord.sendKeys(repo.searchtextbox,"joy");
        keyWord.click(repo.contactName);
        Thread.sleep(5000);
        keyWord.verifyText(repo.phonenumber,"+1(555)-9779202");
        keyWord.verifyText(ObjectRepo.emailAddress,"alstclair11@yopmail.com");
        keyWord.verifyText(ObjectRepo.addressLine1,"53 Woodside Way");
        driver.navigate().back();
      //  repo.searchtextbox.sendKeys("joy");
       // driver.findElementById("com.jayway.contacts:id/main_search").sendKeys("Joy");
        Thread.sleep(5000);
       repo.searchtextbox.clear();
       // driver.findElementById("com.jayway.contacts:id/main_search").clear();
    }

}
