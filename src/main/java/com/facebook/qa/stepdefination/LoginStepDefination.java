package com.facebook.qa.stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefination {
    WebDriver driver;

    @Given("^User navigated to FACEBOOK\\.COM$")
    public void user_navigated_to_FACEBOOK_COM() throws Throwable {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");

    }

    @When("^user enter Username as \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_enter_Username_as_and_Password(String arg1, String arg2) throws Throwable {
        driver.findElement(By.name("email")).sendKeys("james50hasan@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("automation123");

    }

    @When("^user click on login button$")
    public void user_click_on_login_button() throws Throwable {
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

    }

    @Then("^login should be successfulPage$")
    public void login_should_be_successfulPage() throws Throwable {
    String text = driver.findElement(By.xpath("//div[text()='James Hasan']")).getText();
        Assert.assertEquals("James Hasan", text);

    }

    @When("^user Enter \"([^\"]*)\" in the username field and \"([^\"]*)\"in the password field$")
    public void user_Enter_in_the_username_field_and_in_the_password_field(String arg1, String arg2) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(arg1);
        driver.findElement(By.name("pass")).sendKeys(arg2);
    }


}
