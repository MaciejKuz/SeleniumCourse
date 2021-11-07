package ZADANIE1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Zadanie1 {
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
//SPRAWDZ INFO O UZYTKOWNIKU
        WebElement userFullNameButton = driver.findElement(By.cssSelector("#_desktop_user_info span"));
        String userFullName = userFullNameButton.getText();
//ADRESY
        WebElement AddFirstAdress = driver.findElement(By.id("address-link"));
        AddFirstAdress.click();
//UZUPEŁNIENIE ADRESU
        WebElement AdressInput = driver.findElement(By.name("address1"));
        AdressInput.sendKeys("Wiatrakowa");

        WebElement Adress2Input = driver.findElement(By.name("address2"));
        Adress2Input.sendKeys("4/2");

        WebElement CityInput = driver.findElement(By.name("city"));
        CityInput.sendKeys("Bialystok");

        WebElement PostcodeInput = driver.findElement(By.name("postcode"));
        PostcodeInput.sendKeys("15-827");

        WebElement CountryInput = driver.findElement(By.name("id_country"));
        CountryInput.click();
        CountryInput.sendKeys(Keys.ARROW_DOWN);
        CountryInput.sendKeys(Keys.ENTER);

        WebElement PhoneInput = driver.findElement(By.name("phone"));
        PhoneInput.sendKeys("792005192");

        WebElement SaveAdressbutton = driver.findElement(By.name("submitAddress"));
        SaveAdressbutton.click();
//ZAKONCZ
        driver.close();



    }
}
