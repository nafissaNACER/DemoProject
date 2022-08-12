package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTools;

public class CreerComptePage extends BaseTools {

    @FindBy(id="name")
    WebElement champsName;

    @FindBy(id="phone")
    WebElement champsPhone;

    @FindBy(xpath = "//button[@type='submit']")
     WebElement buttonCreerCompte;

    WebDriver driver;
    public CreerComptePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }

    public void remplirFormulaire(String name, String phone){
        System.out.println("remplire formaulaire");
        champsName.sendKeys(name);
        champsPhone.sendKeys(phone);

    }

    public void cliquerCreerCompte(){
        System.out.println("cliquer creer compte");
        buttonCreerCompte.click();
    }




}
