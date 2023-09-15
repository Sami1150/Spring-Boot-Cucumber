package com.cucumber.StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver=null;

    @Given("browser is open")
    public void browser_is_open() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside 1");

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
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside 2");
        driver.navigate().to("https://www.google.com");
    }
    @When("user enters a test in the search box")
    public void user_enters_a_test_in_the_search_box() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

//        Get element by name and search for Automation Step by Step
        driver.findElement(By.name("q")).sendKeys("redmath");

        Thread.sleep(2000);

        System.out.println("Inside 3");
    }
    @And("hits enter")
    public void hits_enter() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

//        Get element by name and hit enter button
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        System.out.println("Inside 4");
    }
    @Then("user is navigated to results page")
    public void user_is_navigated_to_results_page() {
        // Write code here that turns the phrase above into concrete actions

        driver.getPageSource().contains("Who we are");

        driver.close();
        driver.quit();

        System.out.println("Inside 5");
    }
}
