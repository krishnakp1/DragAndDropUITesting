package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PlumfuseWebpage {
    WebDriver driver;

    public PlumfuseWebpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "link-create")
    WebElement createAppButton;

    @FindBy(xpath = "//*[@id='intro-dialog-cont']/div[2]/button")
    WebElement letsStarted;

    @FindBy(id = "add-page")
    WebElement newPage;

    @FindBy(xpath = "//*[@id='create-dialog']/form/p/input")
    WebElement pageNameEditTextBox;

    @FindBy(xpath = "//*[@id='accordion']/h3[4]/a")
    WebElement messagesTab;

    @FindBy(xpath = "//*[@id='accordion']/div[4]/ul/li[3]")
    WebElement sendSmsOption;

    @FindBy(xpath = "//*[@id='module-1']/div[1]/div[3]/div/div[1]/img")
    WebElement start;

    @FindBy(id = "module-2")
    WebElement smsDialog;

    @FindBy(xpath = "//textarea[@name='phone_constant']")
    WebElement phoneInputText;

    @FindBy(xpath = "//textarea[@name='message_phrase[]']")
    WebElement messageInputText;

    @FindBy(xpath = "//*[@id='module-1']/div[5]/div")
    WebElement startDot;

    @FindBy(xpath = "//*[@id='module-2']/div[2]/div")
    WebElement smsArrow;

    @FindBy(xpath = "//*[@id='accordion']/div[4]/ul/li[2]")
    WebElement sendEmail;

    @FindBy(id = "module-3")
    WebElement emailDialog;

    @FindBy(xpath = "//input[@name='smtp_url']")
    WebElement smtpHostTextBox;

    @FindBy(xpath = "//input[@name='port']")
    WebElement smtpPort;

    @FindBy(xpath = "//input[@name='username']")
    WebElement emailDialogUserName;

    @FindBy(xpath = "//input[@name='password']")
    WebElement emailDialogPassword;

    @FindBy(xpath = "//textarea[@name='from_constant']")
    WebElement emailDialogFrom;

    @FindBy(xpath = "//textarea[@name='to_constant']")
    WebElement emailDialogTo;

    @FindBy(xpath = "//textarea[@name='subject_constant']")
    WebElement emailDialogSubject;

    @FindBy(xpath = "//textarea[@name='cc_constant']")
    WebElement emailDialogCC;

    @FindBy(xpath = "//textarea[@name='cc_constant']")
    List<WebElement> emailDialogMessageTextBoxes;

    @FindBy(xpath = "//*[@id='module-2']/div/div[3]/div/div[3]/div[2]")
    WebElement smsDialogDot;

    @FindBy(xpath = "//*[@id='module-3']/div[2]/div")
    WebElement emailDialogArrowMark;

    @FindBy(xpath = "//*[@id='accordion']/h3[1]/a")
    WebElement basicTab;

    @FindBy(xpath = "//*[@id='accordion']/div[1]/ul/li[1]")
    WebElement hangUpOption;

    @FindBy(id = "module-4")
    WebElement hangUpDialog1;

    @FindBy(xpath = "//*[@id='module-2']/div/div[3]/div/div[3]/div")
    WebElement smsDialogLeftDot;

    @FindBy(xpath = "//*[@id='module-4']/div[2]/div")
    WebElement hangUpDialog1ArrowMark;

    @FindBy(id = "module-5")
    WebElement hangUpDialog2;

    @FindBy(xpath = "//*[@id='module-3']/div/div[3]/div/div[4]/div")
    WebElement emailDialogLeftDot;


    @FindBy(xpath = "//*[@id='module-5']/div[2]/div")
    WebElement hangUpDialog2ArrowMark;

    @FindBy(id = "module-6")
    WebElement hangUpDialog3;

    @FindBy(xpath = "//*[@id='module-3']/div/div[3]/div/div[4]/div[2]")
    WebElement emailDialogRightDot;

    @FindBy(xpath = "//*[@id='module-6']/div[2]/div")
    WebElement hangUpDialog3ArrowMark;

    public WebElement createAppButton() {
        return createAppButton;
    }

    public WebElement letsStarted() {
        return letsStarted;
    }

    public WebElement newPage() {
        return newPage;
    }

    public WebElement pageNameEditTextBox() {
        return pageNameEditTextBox;
    }

    public WebElement messagesTab() {
        return messagesTab;
    }

    public WebElement sendSmsOption() {
        return sendSmsOption;
    }

    public WebElement start() {
        return start;
    }

    public WebElement smsDialog() {
        return smsDialog;
    }

    public WebElement phoneInputText() {
        return phoneInputText;
    }

    public WebElement messageInputText() {
        return messageInputText;
    }

    public WebElement startDot() {
        return startDot;
    }

    public WebElement smsArrow() {
        return smsArrow;
    }

    public WebElement sendEmail() {
        return sendEmail;
    }

    public WebElement emailDialog() {
        return emailDialog;
    }

    public WebElement smtpHostTextBox() {
        return smtpHostTextBox;
    }

    public WebElement smtpPort() {
        return smtpPort;
    }

    public WebElement emailDialogUserName() {
        return emailDialogUserName;
    }

    public WebElement emailDialogPassword() {
        return emailDialogPassword;
    }

    public WebElement emailDialogFrom() {
        return emailDialogFrom;
    }

    public WebElement emailDialogTo() {
        return emailDialogTo;
    }

    public WebElement emailDialogSubject() {
        return emailDialogSubject;
    }

    public WebElement emailDialogCC() {
        return emailDialogCC;
    }

    public List<WebElement> emailDialogMessageTextBoxes() {
        return emailDialogMessageTextBoxes;
    }

    public WebElement smsDialogDot() {
        return smsDialogDot;
    }

    public WebElement emailDialogArrowMark() {
        return emailDialogArrowMark;
    }

    public WebElement basicTab() {
        return basicTab;
    }

    public WebElement hangUpOption() {
        return hangUpOption;
    }

    public WebElement hangUpDialog1() {
        return hangUpDialog1;
    }

    public WebElement smsDialogLeftDot() {
        return smsDialogLeftDot;
    }

    public WebElement hangUpDialog1ArrowMark() {
        return hangUpDialog1ArrowMark;
    }

    public WebElement hangUpDialog2() {
        return hangUpDialog2;
    }

    public WebElement emailDialogLeftDot() {
        return emailDialogLeftDot;
    }

    public WebElement hangUpDialog2ArrowMark() {
        return hangUpDialog2ArrowMark;
    }

    public WebElement hangUpDialog3() {
        return hangUpDialog3;
    }

    public WebElement emailDialogRightDot() {
        return emailDialogRightDot;
    }

    public WebElement hangUpDialog3ArrowMark() {
        return hangUpDialog3ArrowMark;
    }
}
