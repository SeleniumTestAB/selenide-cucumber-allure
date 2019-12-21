package com.demo.cucumber.project.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"},
        glue = "com.demo.cucumber.project.steps",
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber.json", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"})
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
