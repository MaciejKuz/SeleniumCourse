package ZADANIE2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Zadanie2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
//SIGN IN
        WebElement signInButtonTop = driver.findElement(By.cssSelector("#_desktop_user_info span"));
        signInButtonTop.click();
//EMAIL UŻYTKOWNIKA
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("baowaservlevofaasz@adfskj.com");
//HASŁO UŻYTKOWNIKA
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("12345");
//SIGNIN
        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
// POWRÓT NA STRONĘ GŁÓWNĄ
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
// PRZEJŚCIE DO WYBRANEGO TOWARU
        driver.get("https://mystore-testlab.coderslab.pl/index.php?id_product=1&amp;id_product_attribute=1&amp;rewrite=hummingbird-printed-t-shirt&amp;controller=product#/1-size-s/8-color-white");
// ZMIANA KOLORU
        WebElement ColourChange = driver.findElement(By.name("group[2]"));
        ColourChange.click();
// DODANIE DO KOSZYKA
        WebElement AddToBasket = driver.findElement(By.className("btn btn-primary add-to-cart"));
        AddToBasket.click();
// PRZEJŚCIE DO KOSZYKA
        WebElement Checkout= driver.findElement(By.className("btn btn-primary"));
        Checkout.click();
//  POTIWERDZENIE ZAKUPÓW
        WebElement CheckoutFinal= driver.findElement(By.className("btn btn-primary"));
        CheckoutFinal.click();
//  POTWIERDZNIE ADRESU
        WebElement ConfirmAdress= driver.findElement(By.name("confirm-addresses"));
        ConfirmAdress.click();
//  POTWIERDZENIE OPCJI DOSTAWY
        WebElement ConfirmDelivery= driver.findElement(By.name("confirmDeliveryOption"));
        ConfirmDelivery.click();
//  WYBÓR METODY PLATNOSCI
        WebElement PaymentConfig= driver.findElement(By.id("payment-option-1"));
        PaymentConfig.click();
// POTWIERDZENIE WARUNKOW UMOWY
        WebElement ConditionsApproval= driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        ConditionsApproval.click();
//  POTWIERDZENIE PLATNOSCI
        WebElement PaymentConfirm= driver.findElement(By.id("payment-confirmation"));
        PaymentConfirm.click();
//ZAKONCZ
        driver.close();

    }
}
