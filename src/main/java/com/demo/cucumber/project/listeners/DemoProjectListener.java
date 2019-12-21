package com.demo.cucumber.project.listeners;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener2;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

import java.util.Map;

public class DemoProjectListener implements ISuiteListener, IInvokedMethodListener2 {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {

    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

    }

    private DesiredCapabilities firefoxCapabilities() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
        cap.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
        return cap;
    }

    @Override
    public void onStart(ISuite suite) {
        Configuration.browser = System.getProperty("selenide.browser", "firefox");
        Configuration.remote = System.getenv("ZALENIUM_HUB");

        Map.of("firefox", WebDriverManager.firefoxdriver(),
                "chrome", WebDriverManager.chromedriver(),
                "edge", WebDriverManager.edgedriver(),
                "phantomjs", WebDriverManager.phantomjs())
                .get(Configuration.browser)
                .setup();

        Configuration.browserCapabilities = Map.of("firefox", firefoxCapabilities())
                .get(Configuration.browser);
        Configuration.timeout = 15000;

    }

    @Override
    public void onFinish(ISuite suite) {

    }



}
