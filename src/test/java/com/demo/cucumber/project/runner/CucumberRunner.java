package com.demo.cucumber.project.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = "com.demo.cucumber.project.steps",
        monochrome = true,
        plugin = {"pretty", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"})
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
