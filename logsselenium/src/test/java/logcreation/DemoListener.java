package logcreation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " STARTED");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("PASSED: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED: " + result.getName());

        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).d;

        takeScreenshot(driver, result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("SKIPPED: " + result.getName());
    }

    public void takeScreenshot(WebDriver driver, String testName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String path = System.getProperty("user.dir") + "/screenshots/"
                    + testName + "_" + System.currentTimeMillis() + ".png";

            File dest = new File(path);
            dest.getParentFile().mkdirs(); // create folder if not exists

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot saved: " + path);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}