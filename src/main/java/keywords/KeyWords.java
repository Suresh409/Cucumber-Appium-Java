package keywords;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.util.Assert;

public class KeyWords {



    public void click(MobileElement element) {

        try{
            element.click();
        }catch (Exception e){
             e.getMessage();
        }
    }

    public void sendKeys(MobileElement element,String text) {

        try{
            element.sendKeys(text);
        }catch (Exception e){
            e.getMessage();
        }
    }
    public void clear(MobileElement element,String text) {

        try{
            element.sendKeys(text);
        }catch (Exception e){
            e.getMessage();
        }
    }

    public String  getText(MobileElement element) {
String var=null;
        try{
         var=   element.getAttribute("text");
        }catch (Exception e){
            e.getMessage();
        }
        return var;
    }


    public void  verifyText(MobileElement element,String expectedText) {
      String var  =null;
        try{
            var=   element.getAttribute("text");
            Assert.hasText(expectedText);
        }catch (Exception e){
            e.getMessage();
        }










        }










}
