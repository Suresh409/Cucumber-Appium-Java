package objectRepository;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepo {


    public ObjectRepo(RemoteWebDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(id = "main_search")
    @FindBy(id="test")
    public static MobileElement searchtextbox;

    @AndroidFindBy(id = "name")
    @FindBy(id="test")
    public static MobileElement contactName;


    @AndroidFindBy(id = "phonenumber")
    @FindBy(id="test")
    public static MobileElement phonenumber;

    @AndroidFindBy(id = "email")
    @FindBy(id="test")
    public static MobileElement emailAddress;

    @AndroidFindBy(id = "street1")
    @FindBy(id="test")
    public static MobileElement addressLine1;







}
