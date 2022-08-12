package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.ConnexionPage;
import pages.HomePage;
import utils.SetupTeardown;

import static utils.SetupTeardown.driver;

public class TestClass extends SetupTeardown {
    String title = "Annonces au Maroc | Avito.ma";

    @Test
    public void ScenaroiVerificationTitre(){


        //1 verfier le titre de la page
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.GetTitle(),title);

        //2 verifier affichage
        Assert.assertTrue(homePage.VerfivierBoutonSeConnecter());

    }

    @Test
    public void ScenarioLogin(){
        String email = "test@gmail.com";
        String pass= "azetrdgyvljg@";
        //Ouvrir le site stepup
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.GetTitle(),title);

        //Cliquez Se connecter
        homePage.cliquerSeConnecter();

        //Entrez faux email et password
        ConnexionPage  connexionPage = new ConnexionPage(driver);
        connexionPage.SaisieFauxPasswordAndLogin(email,pass);

        //Cliquez  Se connecter
        connexionPage.cliquerSeConnecter();

    }


}
