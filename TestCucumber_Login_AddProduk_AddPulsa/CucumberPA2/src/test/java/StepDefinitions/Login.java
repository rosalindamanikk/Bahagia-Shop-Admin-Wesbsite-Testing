package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver = null;

	// Test Login 1
	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("Inside Step - browser is open");
	   
	   String projecPath = System.getProperty("user.dir");
	   System.out.println("Project path is:"+projecPath);
	   
	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	   
	   driver = new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	    driver.navigate().to("http://127.0.0.1:8000/login/");
	}
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
	}
	
	
	//testlogin 2
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin1@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password1");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 1
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin2@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password2");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 3
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin3@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password3");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 4
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin4@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password4");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 5
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin5@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password5");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 6
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin6@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password6");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 7
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin7@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password7");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
	
//}*/
//	//testlogin 8
	//@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin8@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password8");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 9
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin9@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password9");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 10
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin10@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password10");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 11
//@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin11@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password11");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 12
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin12@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password12");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 13
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin13@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password13");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 14
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin14@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password14");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 15
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	} 
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin15@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password15");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 16
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin16@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password16");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 17
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin17@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password17");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 18
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin18@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password18");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 19
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin1@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password19");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 20
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin20@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password20");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 21
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin21@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password21");
//	}2
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 22
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin22@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password22");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 23
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin23@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password23");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//	
//		//testlogin 24
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin24@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password24");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//		
//		//testlogin 25
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin25@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password25");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/   
//
//		//26-51 username invalid dan password valid//
//		//
//		//testlogin 26
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("adminn@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password26");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 27
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn1@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password27");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 28
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn2@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password28");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 29
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn3@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password29");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 30
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn4@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password30");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 31
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn5@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password31");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 32
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn6@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password32");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 33
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn7@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password33");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 34
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn8@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password34");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 35
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn9@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password35");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 36
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn10@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password36");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 37
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn11@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password37");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 38
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn12@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password38");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 39
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn13@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwor39");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 39
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn14@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password39");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 40
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn15@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password40");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 41
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn16@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password41");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 42
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn17@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password32");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 43
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn18@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password43");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 44
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn19@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password44");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 45
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn20@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password45");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 46
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password46");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//	
//	//testlogin 47
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn@gmail.com");
//				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password47");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//			}
//			
//		}*/
//	
//	//testlogin 48
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn48@gmail.com");
//				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password48");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//			}
//			
//		}*/
//	
//	//testlogin 49
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn49@gmail.com");
//				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password49");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//			}
//			
//		}*/
//	
//	//testlogin 50
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn50@gmail.com");
//				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password50");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//			}
//			
//		}*/
//	
//	//testlogin 51
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn51@gmail.com");
//				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password51");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//			}
//			
//		}*/
//	
//			//52-76 username valid dan password invalid//
//	
//	//testlogin 52
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin1@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd1");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
	
//	//testlogin 52
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin2@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd2");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 53
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin3@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd3");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 54
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin4@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd4");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 55
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin5@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd5");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 56
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin56@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd6");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 57
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin7@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd7");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//	//testlogin 58
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin8@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd8");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 59
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 60
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin10@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd10");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 61
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin11@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd11");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 62
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin12@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd12");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 63
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin13@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd13");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 64
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin14@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd14");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 65
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin15@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd15");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 66
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin16@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password66");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 67
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin17@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd17");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 68
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin18@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd18");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 69
//	/*WebDriver driver;
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin1@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd19");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 70
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin20@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password20");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 71
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin21@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd21");
//	}2
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 72
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin22@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password72");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 73
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin23@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password73");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//	
//		//testlogin 74
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin24@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd24");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//		
//		//testlogin 75
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin25@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd25");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/   
//
//		//77-100 username  dan password invalid//
//		//
//		//testlogin 77
//	/*@Driver driver;
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin1n3@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password1000");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 78
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn1@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password127");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 79
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn11@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password128");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 80
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn3@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password29");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 81
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn81@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd10");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 82
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn5@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password31");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 83
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn6@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password32");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//
//		//testlogin 84
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn7@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password33");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//		}
//		
//	}*/
//	//testlogin 85
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin1@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password1");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 86
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn2@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password2");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 87
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn3@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("passwordd3");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 88
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adminn88@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password4s");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin89
//	/*WebDriver driver;
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	 	
//	 	driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin89@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password5");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 90
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin90@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password6");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 91
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin91@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password7");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//	//testlogin 92
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin92@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password8");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 93
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin93@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password9");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 94
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin94@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password10");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 95
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin95@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password11");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 96
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin96@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password12");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 97
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin93@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password13");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 98
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin14@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password14");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 99
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin15@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password15");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//
//	//testlogin 100
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Admin16@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password16");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"tombol_login\"]")).click();
//	}
//	
//}*/
//}
//

	
}
