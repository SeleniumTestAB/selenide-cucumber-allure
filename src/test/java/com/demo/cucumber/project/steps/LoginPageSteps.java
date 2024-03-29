package com.demo.cucumber.project.steps;

import com.codeborne.selenide.WebDriverRunner;
import com.demo.cucumber.project.config.PropertyFileReader;
import com.demo.cucumber.project.pages.LoginPage;
import com.demo.cucumber.project.utils.CucumberScreenshoter;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageSteps {
    private LoginPage loginPage = new LoginPage();
    private String adminLogin, adminPassword;
    private Scenario scenario;
   @Before
    public void getLoginAndPassword(Scenario scenario) {
        adminLogin = PropertyFileReader.getProperty("setup.properties", "adminLogin");
        adminPassword = PropertyFileReader.getProperty("setup.properties", "adminPassword");
        this.scenario = scenario;

    }
    @Given("User is on Login Page")
    public void user_is_on_Login_Page() {
        open(loginPage.getLoginPageUrl());
        CucumberScreenshoter.embedScreenshot(scenario, WebDriverRunner.getWebDriver());
        scenario.write("Test");
        String html = "<html><body><h1>To jest Test HTML</h1><p>aaa</p></body></html>";
        byte[] htmlBytes = html.getBytes();
        scenario.embed(htmlBytes, "text/html");
    }

    @When("User gives proper credentials to Admin account")
    public void user_gives_proper_credentials_to_Admin_account() {
        loginPage.fillLoginField(adminLogin)
                .fillPasswordField(adminPassword)
                .login();
    }

    @Then("User should be logged as Admin")
    public void user_should_be_logged_as_Admin() {
        System.out.println("not now");
    }
}
