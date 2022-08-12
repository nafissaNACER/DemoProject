package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTools;

public class ConnexionPage extends BaseTools {

    @FindBy(name="E-mail")
    private WebElement champsEmail;

    @FindBy(name="Mot de passe")
    private WebElement champsMotdepasse;

    @FindBy(xpath="//button[text()='Se connecter']")
    private WebElement buttonSeConnecter;

    @FindBy(tagName = "h4") private WebElement titreConnexion;

    @FindBy(partialLinkText = "inscrire gratuitement")private WebElement lieninscriregratuitement;

    WebDriver driver;

    public ConnexionPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public void SaisieFauxPasswordAndLogin(String login , String password){
        System.out.println("Saisi login" + login);
        champsEmail.sendKeys(login);
        System.out.println("Saisi pass" + password);
        champsMotdepasse.sendKeys(password);

    }

    public void cliquerSeConnecter() {
        System.out.println("Cliquer se connecter");
        buttonSeConnecter.click();
    }

    public Boolean verifierTitreConnexion(String titreConnexionn) {
        System.out.println("verifier titre connexion");
        if(titreConnexion.getText().equals(titreConnexionn)){
            System.out.println("ok");
            return true;
        }else{
            System.out.println("ko");
            return false;
        }


    }

    public void cliquerSinscrire() {
        System.out.println("cliquer inscrire");
        verifierVisibiliteElement(driver, lieninscriregratuitement,"lien s'inscrire",true );
        lieninscriregratuitement.click();

    }


}
