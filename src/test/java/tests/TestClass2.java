package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConnexionPage;
import pages.CreerComptePage;
import pages.HomePage;
import utils.SetupTeardown;

import static utils.SetupTeardown.driver;

public class TestClass2 extends SetupTeardown {

    @Test
    public void scenarioCreatioCompte(){
        String title = "Annonces au Maroc | Avito.ma";
        String titreConnexion = "Connexion";
        String name="test";
        String phone= "065567808709";


        //Ouvrir le site
        //Vérifiez titre du site  ‘avito.ma’
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.GetTitle(),title);

        //Cliquez Se connecter
        homePage.cliquerSeConnecter();

        //Vérifiez affichage titre «Connexion»
        ConnexionPage connexionPage = new ConnexionPage(driver);
        Assert.assertTrue(connexionPage.verifierTitreConnexion(titreConnexion));

        //Cliquez  S'inscrire gratuitement.
        connexionPage.cliquerSinscrire();

        //Remplir le formulaire avec des données valide sans préciser la ville
        CreerComptePage creerComptePage = new CreerComptePage(driver);
        creerComptePage.remplirFormulaire(name,phone);

        //Valider le formulaire
        creerComptePage.cliquerCreerCompte();


    }
}
