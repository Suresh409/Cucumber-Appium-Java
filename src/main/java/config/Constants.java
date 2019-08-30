package config;

public class Constants {

    public static final int DEFAULT_TIMEOUT = 50;
    public static final String DEFAULT_URL = "http://www.tapqa.com";

    public static final String ANDROID_APP = "C:\\IdeaProjects\\appium-cucumber-java\\src\\main\\resources\\apk\\Contacts.apk";
    public static final String IOS_APP = "TestApp-iphonesimulator.app";
    public static final String IOS_APP_BUNDLE_ID = "io.appium.TestApp";

    public static final String IOS = "ios";
    public static final String ANDROID = "android";
    public static final String CHROME = "chrome";
    public static final String SAFARI = "safari";
    public static final String FIREFOX = "firefox";
    public static final String EDGE = "edge";
    public static final String INTERNET_EXPLORER = "internet explorer";

    // For SauceLabs or TestObject - not currently used.
    public static final String SAUCE_LABS_USERNAME = "";
    public static final String SAUCE_LABS_ACCESS_KEY = "";
    public static final String SAUCE_LABS_PARTIAL_URL = "";
    public static final String SAUCE_LABS_URL = "https://"+SAUCE_LABS_USERNAME+":"+SAUCE_LABS_ACCESS_KEY+SAUCE_LABS_PARTIAL_URL;

}