package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTools;

public class HomePage extends BaseTools {

    //Declaration

    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Se connecter')]")
    WebElement buttonSeConnecter;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String GetTitle(){
        String title = driver.getTitle();
        System.out.println("title = " + title);
        return title;
    }


    public Boolean VerfivierBoutonSeConnecter() {
        verifierVisibiliteElement(driver,buttonSeConnecter,"button se connecter", true);
        return buttonSeConnecter.isDisplayed();
    }


    public void cliquerSeConnecter() {
        verifierVisibiliteElement(driver,buttonSeConnecter,"button se connecter", true);
        buttonSeConnecter.click();
    }
}
