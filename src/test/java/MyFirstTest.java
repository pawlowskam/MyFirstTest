import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstTest {



        private WebDriver driver;

        @Before
        public void setUp() {


            System.setProperty("webdriver.gecko.driver",

                    "src/test/resources/geckodriver");


            // Uruchom nowy egzemplarz przeglądarki Firefox
            driver = new FirefoxDriver();

            // Zmaksymalizuj okno przeglądarki
            driver.manage().window().maximize();
            // Przejdź do katalon-test
            driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        }
        @Test
        public void testGoogleSearch() {
            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement name = driver.findElement(By.id("first-name"));
            // Wyczyść teskst zapisany w elemencie
            name.clear();
            // Wpisz informacje do wyszukania
            name.sendKeys("Karol");

            WebElement lastName = driver.findElement(By.id("last-name"));
            lastName.clear();
            lastName.sendKeys("Kowalski");

            WebElement gender = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div/div/label[1]/input"));
            gender.click();
            gender.sendKeys("Male");

            WebElement dob = driver.findElement(By.id("dob"));
            dob.clear();
            dob.sendKeys("05/22/2010");

            WebElement address = driver.findElement(By.id("address"));
            address.clear();
            address.sendKeys("Prosta 51");

            WebElement email = driver.findElement(By.id("email"));
            email.clear();
            email.sendKeys("karol.kowalski@mailinator.com");

            WebElement password = driver.findElement(By.id("password"));
            password.clear();
            password.sendKeys("Pass123");

            WebElement company = driver.findElement(By.id("company"));
            company.clear();
            company.sendKeys("Coders Lab");

            WebElement role = driver.findElement(By.id("role"));
            Select roleSelect = new Select(role);
            roleSelect.selectByVisibleText("QA");

            WebElement comment = driver.findElement(By.id("comment"));
            comment.clear();
            comment.sendKeys("To jest mój pierwszy automat testowy");

            // Prześlij formularz
            driver.findElement(By.id("infoForm")).submit();

            WebElement successMessage = driver.findElement(By.id("submit-msg"));
            Assert.assertEquals("Successfully submitted" , successMessage.getText());
        }
        @After
        public void tearDown() throws Exception {
            // Zamknij przeglądarkę
            //driver.quit();
        }
    }



