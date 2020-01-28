package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.PlumfuseWebpage;

import java.util.concurrent.TimeUnit;

public class TestPlumfuse {

    public Actions act;
    public WebDriver driver;
    public PlumfuseWebpage pageObject;
    WebDriverWait wait;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/sivashankar/Desktop/KP/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        pageObject = new PlumfuseWebpage(driver);
        act = new Actions(driver);
        driver.get("http://quickfuseapps.com/");
    }

    @Test
    public void test_dragAndDrop() throws InterruptedException {
        pageObject.createAppButton().click();
        pageObject.letsStarted().click();

        /*Create a new file*/
        pageObject.newPage().click();
        pageObject.pageNameEditTextBox().sendKeys("Drag and drop actions");
        pageObject.pageNameEditTextBox().sendKeys(Keys.ENTER);

        /*SMS dialog*/
        pageObject.messagesTab().click();
        wait.until(ExpectedConditions.elementToBeClickable(pageObject.sendSmsOption()));
        dragByElement(pageObject.sendSmsOption(), pageObject.start());

        //Fill data to the SMS dialog
        pageObject.phoneInputText().sendKeys("98765453210");
        pageObject.messageInputText().sendKeys("Hello world!");

        //Drag the SMS dialog down below to the start dialog
        dragByCoordinates(pageObject.smsDialog(), -25, 80);

        //Joining the lines from start to SMS dialog.
        dragByElement(pageObject.startDot(), pageObject.smsArrow());

        /*Email Dialog*/
        dragByCoordinates(pageObject.sendEmail(), 780, 120);

        //Fill data to the Email dialog
        pageObject.smtpHostTextBox().sendKeys("smtp.gmail.com");
        pageObject.smtpPort().sendKeys("645");
        pageObject.emailDialogUserName().sendKeys("abc@gmail.com");
        pageObject.emailDialogPassword().sendKeys("kpkpkp");
        pageObject.emailDialogFrom().sendKeys("abc@gmail.com");
        pageObject.emailDialogTo().sendKeys("xyz@gmail.com");
        pageObject.emailDialogSubject().sendKeys("SMS not sent");
        pageObject.emailDialogCC().sendKeys("All");
        pageObject.emailDialogMessageTextBoxes().get(0).sendKeys("Hello all! How are you doing?");
        dragByElement(pageObject.smsDialogDot(), pageObject.emailDialogArrowMark());

        /*HangupDialog1*/
        pageObject.basicTab().click();
        dragByElement(pageObject.hangUpOption(), pageObject.smsDialog());
        dragByCoordinates(pageObject.hangUpDialog1(), -135, 100);
        dragByElement(pageObject.smsDialogLeftDot(), pageObject.hangUpDialog1ArrowMark());

        /*HangupDialog2*/
        dragByElement(pageObject.hangUpOption(), pageObject.emailDialog());
        dragByCoordinates(pageObject.hangUpDialog2(), -135, 170);
        dragByElement(pageObject.emailDialogLeftDot(), pageObject.hangUpDialog2ArrowMark());

        /*HangupDialog3*/
        dragByElement(pageObject.hangUpOption(), pageObject.emailDialog());
        dragByCoordinates(pageObject.hangUpDialog3(), 185, 170);
        dragByElement(pageObject.emailDialogRightDot(), pageObject.hangUpDialog3ArrowMark());
    }

    @AfterTest
    public void tearDown() {
        System.out.print("Executed successfully");
        driver.quit();
    }

    public void dragByElement(WebElement element1, WebElement element2) throws InterruptedException {
        act.dragAndDrop(element1, element2).perform();
        Thread.sleep(3000);
    }

    public void dragByCoordinates(WebElement element, int a, int b) {
        act.dragAndDropBy(element, a, b).perform();
    }
}
