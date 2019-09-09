import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
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

            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement lastName = driver.findElement(By.id("last-name"));
            // Wyczyść teskst zapisany w elemencie
            lastName.clear();
            // Wpisz informacje do wyszukania
            lastName.sendKeys("Kowalski");

            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement dob = driver.findElement(By.id("dob"));
            // Wyczyść teskst zapisany w elemencie
            dob.clear();
            // Wpisz informacje do wyszukania
            dob.sendKeys("05/22/2010");

            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement address = driver.findElement(By.id("address"));
            // Wyczyść teskst zapisany w elemencie
            address.clear();
            // Wpisz informacje do wyszukania
            address.sendKeys("Prosta 51");

            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement email = driver.findElement(By.id("email"));
            // Wyczyść teskst zapisany w elemencie
            email.clear();
            // Wpisz informacje do wyszukania
            email.sendKeys("karol.kowalski@mailinator.com");

            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement password = driver.findElement(By.id("password"));
            // Wyczyść teskst zapisany w elemencie
            password.clear();
            // Wpisz informacje do wyszukania
            password.sendKeys("Pass123");

            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement company = driver.findElement(By.id("company"));
            // Wyczyść teskst zapisany w elemencie
            company.clear();
            // Wpisz informacje do wyszukania
            company.sendKeys("Coders Lab");

            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement comment = driver.findElement(By.id("comment"));
            // Wyczyść teskst zapisany w elemencie
            comment.clear();
            // Wpisz informacje do wyszukania
            comment.sendKeys("To jest mój pierwszy automat testowy");

            // Prześlij formularz
            //element.submit();
        }
        @After
        public void tearDown() throws Exception {
            // Zamknij przeglądarkę
            driver.quit();
        }
    }



