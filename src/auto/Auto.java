
package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author USUARIO
 */
public class Auto {

    
   private static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USUARIO\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.navigate().to("https://google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("buggy car rating");
        driver.findElement(By.className("gNO89b")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://buggy.justtestit.org");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Juan158792");
        Thread.sleep(2000);
        driver.findElement(By.name("firstName")).sendKeys("Raul");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("David");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Juan12345@");
        Thread.sleep(2000);
       
        driver.findElement(By.id("confirmPassword")).sendKeys("Juan12345@");
        Thread.sleep(2000);
        driver.findElement(By.className("btn-default")).click();
        
        
        
        String appTitle= driver.getTitle();
        
        System.out.println("Titulo de Aplicacion"+appTitle);
//        driver.navigate().to("http://automationpractice.com");
//        driver.findElement(By.className("login")).click();
//        driver.findElement(By.id("email_create")).sendKeys("Juan251465@gmail.com");
//        driver.findElement(By.name("SubmitCreate")).click();
//        driver.findElement(By.id("id_gender2")).click();
//        driver.findElement(By.name("customer_firstname")).sendKeys("Raul");
//        driver.findElement(By.name("customer_lastname")).sendKeys("Juan");
       

//        driver.findElement(By.id("sign-username")).sendKeys("Raul123456");
//        driver.findElement(By.id("sign-password")).sendKeys("JuanRaul123456");
//        driver.findElement(By.className("btn btn-secondary")).click();
//        
        
        
        
        
        
        
// ----------------------------------------------------------------------       
//        
//        driver.navigate().to("https://buggy.justtestit.org/");
//        driver.findElement(By.linkText("Register")).click();
//        driver.findElement(By.name("username")).sendKeys("Juan130");
//        driver.findElement(By.name("firstName")).sendKeys("Raul");
//        driver.findElement(By.name("lastName")).sendKeys("David");
//        driver.findElement(By.id("password")).sendKeys("Juan12345@");
//       
//        driver.findElement(By.id("confirmPassword")).sendKeys("Juan12345@");
//        driver.findElement(By.id("Register")).click();
//        driver.findElement(By.name("submit")).click();

//---------------------------------------------------
//        driver.navigate().to("https://www.saucedemo.com");Swag Labs
//        driver.findElement(By.name("user-name")).sendKeys("standard_user");
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        driver.findElement(By.name("login-button")).click();
//        driver.findElement(By.className("inventory_item_name")).click();
//        driver.findElement(By.name("back-to-products")).click();
//        driver.findElement(By.id("react-burger-menu-btn")).click();
//        driver.findElement(By.className("bm-item menu-item")).click();
// ------------------------------------------------  
    }
    
}
