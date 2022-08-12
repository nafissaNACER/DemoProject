package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTools {
    static int time = 90;

    public void verifierVisibiliteElement(WebDriver driver, WebElement element, String elementName, boolean logIfTrue) {

        String msgIfTrue = "L'element " + elementName + " est bien present et visible.";
        String msgIfFalse = "L'element " + elementName + " est absent ou invisible.";
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.withMessage(msgIfFalse);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            if (logIfTrue == true) {
                System.out.println(msgIfTrue);
            }
        } catch (TimeoutException t) {
            System.out.println(msgIfFalse);
            System.out.println(element.toString());
            throw new NoSuchElementException(msgIfFalse);
        }

    }
}
