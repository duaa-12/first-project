package JAVA;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Smart {
	WebDriver driver = new  ChromeDriver();
	String Myname="https://smartbuy-me.com/smartbuystore/en/login";
@BeforeTest
public void MyBeforeTest() {
	
}
@Test
public void MyTest() throws InterruptedException {
	driver.get(Myname);
	driver.manage().window().maximize();
	driver.get("https://smartbuy-me.com/smartbuystore/en/login");
	Thread.sleep(2000);
	WebElement Firstname = driver.findElement(By.id("register.firstname"));
	Firstname.sendKeys("duaa");
	WebElement Lastname = driver.findElement(By.id("register.Lastname"));
    Lastname.sendKeys("KHERFAN");
	WebElement mobileNumberinput = driver.findElement(By.id("mobileNumber"));
    mobileNumberinput.sendKeys("785724366");
    String First="duaa";
    String Last="kherfan";
    String Domin="@gmail.com"; 
    Random rand= new Random();
    int Randomid =rand.nextInt(2);
    driver.findElement(By.id("Register.email")).sendKeys((First).concat(Last)+Randomid+Domin);
    WebElement PhoneNumberinput = driver.findElement(By.id("phoneNumber"));
    PhoneNumberinput.sendKeys("785722937");
	WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("Helloworld21-8");
    WebElement checkPwd = driver.findElement(By.id("register.checkPwd"));
    checkPwd.sendKeys("Helloworld21-8");
    WebElement termsandconditions= driver.findElement(By.id("termsandconditions"));
    termsandconditions .click();
	WebElement Registerbutton = driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[2]/div[2]/div[2]/button"));
    Registerbutton.submit();
	
	
}
}
