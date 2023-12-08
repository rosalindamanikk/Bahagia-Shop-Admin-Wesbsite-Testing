//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//

	//public class AddPulsa {
			//VARIANSI 1 = SEMUA INPUTAN DATA VALID
	//	//test 1
	//	WebDriver driver = null;
	//   @Given("browser is open")
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
	//	    driver.navigate().to("http://127.0.0.1:8000/");
	//	}
	//
	//	@When("user enters email and password")
	//	public void user_enters_email_and_password() throws InterruptedException {
	//	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//	    driver.findElement(By.id("password")).sendKeys("password");
	//	    Thread.sleep(2000);
	//	    
	//	}
	//
	//	@And("user click button login")
	//	public void user_click_button_login() throws InterruptedException {
	//	    driver.findElement(By.id("tombol_login")).click();
	//	    Thread.sleep(2000);
	//	}
	//	
	//	@Then("user confirm notification")
	//	public void user_confirm_notification() {
	//		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//	}
	//	@When("user click menu pulsa")
	//	public void user_click_menu_pulsa() {
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//	}
	//
	//	@And("user click button add pulsa")
	//	public void user_click_button_add_pulsa() {
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//	}
	//
	//	@When("user provider")
	//	public void user_select_provider() {
	//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_credit_form\"]/div/div[1]/div[2]/div[1]/input")).sendKeys("indoesat");
	//
	//	}
	//
	//	@And("user nominal dan harga")
	//	public void user_nominal_dan_harga() {
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("12000");
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//	}
	//
	//	@And("user click button save changes")
	//	public void user_click_button_save_changes() {
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//	}
	//	
	//
	//	}
	//////
	//////	
	//////	//TEST2
	//////	@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("10000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}
	//////
	//////
	//////	//TEST3
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("11000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////	
	//////	//TEST4
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("12000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST5
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("13000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("14000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST6
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("15000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("16000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST7
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("10000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST8
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("17000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("18000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST9
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("19000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("20000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST10
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("8000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("10000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST11
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("9000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("10000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST12
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("10000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("11000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST13
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("11000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////			///VARIAN 2 PROVIDER DAN NOMINAL VALID, HARGA INVALID////
	//////	
	//////	//TEST14
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("12000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////	//TEST15
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("14000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST16
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("16000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST17
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("210000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST18
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("10000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST19
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("30000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST20
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("20000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST21
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("21000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST22
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("22000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST23
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("23000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST24
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("24000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST25
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("25000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST26
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("26000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////			////VARIANSI 3 PROVIDER VALID, NOMINAL INVALID, HARGA VALID////
	//////	
	//////	//TEST27
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("27000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST28
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("28000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	
	//////	//TEST29
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys(");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("29000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST30
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("30000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST31
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("31000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST32
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("32000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////	//TEST33
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("33000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST34
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("34000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST35
	//////
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("35000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST36
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("36000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST37
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("37000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST38
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Telkomsel");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("38000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////			////VARIANSI 4 PROVIDER VALID, HARGA DAN NOMINAL INVALID////
	//////	
	//////	//TEST39
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST40
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////	//TEST41
	//////
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	////////TEST42
	//////
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////
	//////	//TEST43
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////	
	//////	//TEST44
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST45
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST46
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST47
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST48
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST49
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST50
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("XL");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////				//VARIANSI 5 PROVIDER INVALID, NOMINAL DAN HARGA VALID
	//////	
	//////	//TEST51
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("9000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("10000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST52
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("10000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("11000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST53
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("11000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////	
	//////	//TEST54
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("12000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("13000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////	//TEST55
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("12000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("13000");
	//////	}
	//////
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/ 
	//////
	//////	//TEST56
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("10000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////
	//////	}*/
	//////
	//////	//TEST57
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("10000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST58
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("12000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("14000");
	//////	}
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST59
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("13000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("15000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST60
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("15000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("17000");
	//////	}
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST61
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("17000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("19000");
	//////	}
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/ 
	//////	
	//////	//TEST62
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("12000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("15000");
	//////	}
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////
	//////		//VARIANSI 6 PROVIDER INVALID, NOMINAL VALID, HARGA INVALID
	//////	
	//////	//TEST63
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("9000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST64
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("10000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST65
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("11000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST66
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("12000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST67
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("12000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/ 
	//////	
	//////	//TEST68
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("10000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST69
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("17000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST70
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("70000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST71
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("71000-");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST72
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("72000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST73
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("73000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/ 
	//////	
	//////	//TEST74
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("7400");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////
	//////	//VARIANSI 7 PROVIDER INVALID, NOMINAL INVALID ,HARGA TRUE
	//////	
	//////	//TEST75
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("9000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST76
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("10000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST77
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("11000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST78
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST79
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("12000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/ 
	//////	
	//////	//TEST80
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("10000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST81
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("17000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST82
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("70000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST83
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("70000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST84
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("70000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST85
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("73000");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("73000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/ 
	//////	
	//////	//TEST86
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("7400");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST87
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("44000");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////		////VARIANSI 8 PROVIDER INVALID, NOMINAL INVALID, HARGA INVALID
	//////	
	//////	//TEST88
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST89
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST90
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST91
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	
	//////	//TEST92
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	
	//////	//TEST93
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST94
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////
	//////
	//////	//TEST95
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST96
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST97
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST98
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	
	//////	//TEST92
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	
	//////	//TEST99
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	//TEST100
	//////	
	//////	/*@Given("browser is open")
	//////	public void browser_is_open() {
	//////	   System.out.println("Inside Step - browser is open");
	//////	   
	//////	   String projecPath = System.getProperty("user.dir");
	//////	   System.out.println("Project path is:"+projecPath);
	//////	   
	//////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//////	   
	//////	   driver = new ChromeDriver();
	//////	   
	//////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//////	}
	//////	
	//////	@And("user is on login page")
	//////	public void user_is_on_login_page() {
	//////	    driver.navigate().to("http://127.0.0.1:8000/login/");
	//////	}
	//////	
	//////	@When("user enters email and password")
	//////	public void user_enters_email_and_password() throws InterruptedException {
	//////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//////	    driver.findElement(By.id("password")).sendKeys("password");
	//////	    Thread.sleep(2000);
	//////	    
	//////	}
	//////	
	//////	@And("user click button login")
	//////	public void user_click_button_login() throws InterruptedException {
	//////	    driver.findElement(By.id("tombol_login")).click();
	//////	    Thread.sleep(2000);
	//////	}
	//////	
	//////	@Then("user confirm notification")
	//////	public void user_confirm_notification() {
	//////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//////	}
	//////	@When("user click menu pulsa")
	//////	public void user_click_menu_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[2]/a/span[2]")).click();
	//////	}
	//////	
	//////	@And("user click button add pulsa")
	//////	public void user_click_button_add_pulsa() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
	//////	}
	//////	
	//////	@When("user select provider")
	//////	public void user_select_provider() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[1]/span/span[1]/span")).click();
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	//////	}
	//////	
	//////	@And("user nominal dan harga")
	//////	public void user_nominal_dan_harga() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[2]/input")).sendKeys("");
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/input")).sendKeys("");
	//////	}
	//////	
	//////	@And("user click button save changes")
	//////	public void user_click_button_save_changes() {
	//////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div/div[2]/button/span[1]")).click();
	//////	}
	//////	
	//////	}*/
	//////	
	//////	
	//////	
	//////	
	//////	
	//////			
	//////			
	//////			
	//////		
	//////			
	//////			
	//////		
	//////			
	//////		
	//////			
	//////				
	//////			
	//////		
	//////	
	//////	
	//////	
	//////		
	//////		
	//////		
	//////				
	//////				
	//////				
	//////			
	//////				
	//////				
	//////			
	//////				
	//////			
	//////				
	//////					
	//////				
	//////			
//////		