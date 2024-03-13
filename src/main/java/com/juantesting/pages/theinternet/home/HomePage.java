package com.juantesting.pages.theinternet.home;


import com.juantesting.pages.BaseHomePage;
import com.juantesting.pages.theinternet.alerts.AlertPage;
import com.juantesting.pages.theinternet.contextmenu.ContextMenuPage;
import com.juantesting.pages.theinternet.dorpdown.DropDownPage;
import com.juantesting.pages.theinternet.entry.EntryAdPage;
import com.juantesting.pages.theinternet.forgot.ForgotPassPage;
import com.juantesting.pages.theinternet.frames.NestedFramesPage;
import com.juantesting.pages.theinternet.frames.WysiwygEditorPage;
import com.juantesting.pages.theinternet.horizontalslider.HorizontalSliderPage;
import com.juantesting.pages.theinternet.hovers.HoversPage;
import com.juantesting.pages.theinternet.keypress.KeyPressPage;
import com.juantesting.pages.theinternet.dynamic.DynamicLoadingPage;
import com.juantesting.pages.theinternet.login.LoginPage;
import com.juantesting.pages.theinternet.uploadfile.UploadFilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseHomePage {

    protected final String PRINCIPAL_URL = "https://the-internet.herokuapp.com/";
    private final By formAuthenticationLink = By.linkText("Form Authentication");
    private final By dropDownLink = By.linkText("Dropdown");
    private final By forgotPasswordLink = By.linkText("Forgot Password");
    private final By hoversLink = By.linkText("Hovers");
    private final By keyPressesLink = By.linkText("Key Presses");
    private final By horizontalSliderLink = By.linkText("Horizontal Slider");
    private final By alertsLink = By.linkText("JavaScript Alerts");
    private final By fileUploadLink = By.linkText("File Upload");
    private final By entryAdLink = By.linkText("Entry Ad");
    private final By contextMenuLink = By.linkText("Context Menu");
    private final By frameMenuLink = By.linkText("WYSIWYG Editor");
    private final By nestedFramesLink = By.linkText("Nested Frames");
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");


    public HomePage(WebDriver driver) {
        super(driver);
        setStrUrl(PRINCIPAL_URL);
        openPage();
    }

    public LoginPage clickFormAuthentication() {
        clickOn(formAuthenticationLink);
        return new LoginPage(getDriver());
    }

    public DropDownPage clickDropDown() {
        clickOn(dropDownLink);
        return new DropDownPage(getDriver());
    }

    public ForgotPassPage clickForgotPass() {
        clickOn(forgotPasswordLink);
        return new ForgotPassPage(getDriver());
    }

    public HoversPage clickOnHovers() {
        clickOn(hoversLink);
        return new HoversPage(getDriver());
    }

    public KeyPressPage clickOnKeyPress() {
        clickOn(keyPressesLink);
        return new KeyPressPage(getDriver());
    }

    public HorizontalSliderPage clickOnHorizontalSlider() {
        clickOn(horizontalSliderLink);
        return new HorizontalSliderPage(getDriver());
    }

    public AlertPage clickOnAlertsJS() {
        clickOn(alertsLink);
        return new AlertPage(getDriver());
    }

    public UploadFilePage clickOnFileUpload() {
        clickOn(fileUploadLink);
        return new UploadFilePage(getDriver());
    }

    public EntryAdPage clickOnEntryAd() {
        clickOn(entryAdLink);
        return new EntryAdPage(getDriver());
    }

    public ContextMenuPage clickOnContextMenu() {
        clickOn(contextMenuLink);
        return new ContextMenuPage(getDriver());
    }

    public WysiwygEditorPage clickOnFrameMenu() {
        clickOn(frameMenuLink);
        return new WysiwygEditorPage(getDriver());
    }

    public NestedFramesPage clickOnFramesNested() {
        clickOn(nestedFramesLink);
        return new NestedFramesPage(getDriver());
    }

    public DynamicLoadingPage clickOnDynamicLoad() {
        clickOn(dynamicLoadingLink);
        return new DynamicLoadingPage(getDriver());
    }
}
