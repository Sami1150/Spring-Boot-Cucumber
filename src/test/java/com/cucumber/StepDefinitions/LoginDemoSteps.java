package com.cucumber.StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;


import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {

    WebDriver driver=null;

    @Given("^browser is open for use$")
    public void browser_is_open() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside browser is open");

        //To avoid relative path
        String projectPath=System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();

        // Add implicit wait so browser can be loaded completely
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //To load page completely
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //to maximize screen
//        driver.manage().window().maximize();
    }
    @And("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside user is on login page");

        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//        throw new io.cucumber.java.PendingException();
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside user enters username and password");

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
//        throw new io.cucumber.java.PendingException();
    }
    @When("user hits login button")
    public void user_hits_login_button() throws InterruptedException {
        System.out.println("Inside User hits login button");
        driver.findElement(By.id("submit")).click();

        Thread.sleep(5000);
    }
    @Then("user is succssfully logged in")
    public void user_is_navigated_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Then user is navigated to the home page");

        driver.findElement(By.linkText("Log out")).isDisplayed();
//        driver.getPageSource().contains("Your username is invalid!");

        driver.close();
        driver.quit();
    }
}
