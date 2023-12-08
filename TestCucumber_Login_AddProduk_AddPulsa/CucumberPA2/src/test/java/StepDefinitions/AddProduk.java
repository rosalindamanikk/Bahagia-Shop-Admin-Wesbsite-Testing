//package StepDefinitions;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
////
//public class AddProduk {
//	WebDriver driver = null;
//	
////--------------Tambah Produk---------------
//	
////Varian 1: // SEMUA INPUTAN VALID
//	
//		//test 1
//	@Given("browser is open")
//	public void browser_is_open() {
//		 System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	 driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	
//	@When("user enters email and password")
//	public void user_enters_email_and_password() throws InterruptedException {
//	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("password");
//	    Thread.sleep(2000);
//	}
//	
//	@When("user click button login")
//	public void user_click_button_login() throws InterruptedException {
//	    driver.findElement(By.id("tombol_login")).click();
//	    Thread.sleep(2000);
//	}
//	
//	@Then("user confirm notification")
//	public void user_confirm_notification() {
//		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
//	}
//	
//	@When("user click menu produk")
//	public void user_click_menu_produk() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
//	}
//	
//	@When("user click button add produk")
//	public void user_click_button_add_produk() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
//	}
//	
//	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
//	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("009");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
//	}
//	
//	@When("user click button save changes")
//	public void user_click_button_save_changes() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
//	}
////	
//	}
//////	
////	//test 2
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("air");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("002");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("mineral");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("12000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("20");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 3
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("oreo");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("003");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("30000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("30");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//test 4
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("coklatos");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("004");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("wafer");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//Varian 2: nama produk , SKU, deskripsi ,lalu harga (INVALID)  dan kuantitas (INVALID)// 
////	
////	//test 5
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("005");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 6
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("Tango");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("006");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 7
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("permen");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("007");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys(" milkita");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//Varian 3: nama produk SKU deskripsi kuantitas (VALID) harga (INVALID)// 
////	
////	//test 8
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("008");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10000");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 9
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("009");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("enak");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10000");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//test 10
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("010");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10000");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	//Varian 4 nama produk , SKU , deskripsi (VALID) harga dan kuantitas(INVALID) // 
////	//test 11
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("roti B");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("011");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//test 12
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu B");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("012");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 13
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu C");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("013");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	//VARIAN 5 nama produk ,SKU (VALID), deskripsi (INVALID), kuantitas dan harga (VALID) 
////
////	//test 14
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("014");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 15
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("015");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 16
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("001");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	// VARIANSI 6 nama produk SKU(VALID)  deskripsi(INVALID) harga(VALID)  kuantitas(INVALID)
////	//test 17
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu C");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("017");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 18
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu D");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("018");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 19
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu A");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("019");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//VARIANSI 7 nama produk SKU (VALID) deskripsi  harga(INVALID)  kuantitas(VALID)
////
////	//test 20
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("020");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 21
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("021");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 22
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("022");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//VARIANSI 8 nama produk SKU (VALID),  deskripsi  harga  kuantitas (INVALID)
////
////	//test 23
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("023");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 24
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("024");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 25
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("025");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//VARIANSI 9 nama produk (VALID) SKU(INVALID), deskripsi  harga(VALID),  kuantitas(VALID)
////
////	//test 26
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu B");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//test 27
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 28
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//VARIANSI 10 nama produk(VALID), SKU (INVALID)  deskripsi  harga(VALID), kuantitas(INVALID)
////
////	//test 29
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu R");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 30
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu Q");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 31
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu W");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//VARIANSI 11 nama produk (VALID) SKU(INVALID)  deskripsi(VALID)  harga(INVALID) kuantitas (VALID)
////
////	//test 32
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("kue");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 33
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("kue");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys(" coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("30");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 34
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("kue");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
//// 
////	// VARIANSI 12 nama produk(VALID) ,SKU(INVALID, deskripsi(VALID), harga  kuantitas(INVALID)
////	//test 35
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("SEREAL");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 36
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("SEREAL");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 37
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("SEREAL");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	  	//VARIANSI 13 nama produk(VALID), SKU  deskripsi (INVALID), harga  kuantitas (VALID)
////
////	//test 38
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 39
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 40
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////			//VARIANSI 14 nama produk(VALID), SKU  deskripsi (INVALID) harga(VALID), kuantitas(INVALID)
////
////	//test 41
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("ROTI B");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 42
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("ROTI C");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 43
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("ROTI D");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//VARIANSI 15 nama produk(VALID), SKU  deskripsi  harga(INVALID),  kuantitas(VALID)
////
////	//test 44
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 45
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("20");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 46
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("30");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////		//VARIANSI 16 nama produk(VALID), SKU  deskripsi  harga  kuantitas(INVALID)
////	//test 47
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 48
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 49
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("susu");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////			
////			//VARIANSI 17 nama produk(INVALID), SKU  deskripsi  harga  kuantitas(VALID)
////	//test 50
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("001");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 51
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("001");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//test 52
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("001");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	
////	//VARIANSI 18 nama produk(INVALID), SKU  deskripsi  harga(VALID), kuantitas(INVALID)
////	
////	//test 53
/////*@Given("browser is open")
////public void browser_is_open() {
////	 System.out.println("Inside Step - browser is open");
////	   
////	   String projecPath = System.getProperty("user.dir");
////	   System.out.println("Project path is:"+projecPath);
////	   
////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////	   
////	   driver = new ChromeDriver();
////	   
////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////	}
////
////@Given("user is on login page")
////public void user_is_on_login_page() {
////	 driver.navigate().to("http://127.0.0.1:8000/login/");
////}
////
////@When("user enters email and password")
////public void user_enters_email_and_password() throws InterruptedException {
////    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////    driver.findElement(By.id("password")).sendKeys("password");
////    Thread.sleep(2000);
////}
////
////@When("user click button login")
////public void user_click_button_login() throws InterruptedException {
////    driver.findElement(By.id("tombol_login")).click();
////    Thread.sleep(2000);
////}
////
////@Then("user confirm notification")
////public void user_confirm_notification() {
////	driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////}
////
////@When("user click menu produk")
////public void user_click_menu_produk() {
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////}
////
////@When("user click button add produk")
////public void user_click_button_add_produk() {
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////}
////
////@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("053");
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////}
////
////@When("user click button save changes")
////public void user_click_button_save_changes() {
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////}
////
////}*/
////
//////test 54
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("054");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("mineral");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("12000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////
//////test 55
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("oreo");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("055");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("30000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	
////	//VARIANSI 19 nama produk(INVALID) SKU  deskripsi(HARGA),  harga(INVALID),  kuantitas(VALID)
////
//////test 56
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("056");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("wafer");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("   ");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	
////
////	//test 57
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("057");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("wafer");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("   ");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	//test 58
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("058");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("wafer");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("   ");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//VARIANSI 20 nama produk(INVALID), SKU  deskripsi(VALID), harga kuantitas(INVALID)
////	
////		//test 59
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("059");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	
////	//test 60
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("060");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("mineral");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//test 61
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("061");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//VARIANSI 21 nama produk(INVALID), SKU(VALID) , deskripsi(INVALID), harga kuantitas(VALID)
////	
////	//test 62
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("062");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	//test 63
////			/*@Given("browser is open")
////			public void browser_is_open() {
////				 System.out.println("Inside Step - browser is open");
////				   
////				   String projecPath = System.getProperty("user.dir");
////				   System.out.println("Project path is:"+projecPath);
////				   
////				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////				   
////				   driver = new ChromeDriver();
////				   
////				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////				}
////			
////			@Given("user is on login page")
////			public void user_is_on_login_page() {
////				 driver.navigate().to("http://127.0.0.1:8000/login/");
////			}
////			
////			@When("user enters email and password")
////			public void user_enters_email_and_password() throws InterruptedException {
////			    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////			    driver.findElement(By.id("password")).sendKeys("password");
////			    Thread.sleep(2000);
////			}
////			
////			@When("user click button login")
////			public void user_click_button_login() throws InterruptedException {
////			    driver.findElement(By.id("tombol_login")).click();
////			    Thread.sleep(2000);
////			}
////			
////			@Then("user confirm notification")
////			public void user_confirm_notification() {
////				driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////			}
////			
////			@When("user click menu produk")
////			public void user_click_menu_produk() {
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////			}
////			
////			@When("user click button add produk")
////			public void user_click_button_add_produk() {
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////			}
////			
////			@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////			public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("063");
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////			}
////			
////			@When("user click button save changes")
////			public void user_click_button_save_changes() {
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////			}
////			
////			}*/
////		
////	//test 64
////			/*@Given("browser is open")
////			public void browser_is_open() {
////				 System.out.println("Inside Step - browser is open");
////				   
////				   String projecPath = System.getProperty("user.dir");
////				   System.out.println("Project path is:"+projecPath);
////				   
////				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////				   
////				   driver = new ChromeDriver();
////				   
////				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////				}
////			
////			@Given("user is on login page")
////			public void user_is_on_login_page() {
////				 driver.navigate().to("http://127.0.0.1:8000/login/");
////			}
////			
////			@When("user enters email and password")
////			public void user_enters_email_and_password() throws InterruptedException {
////			    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////			    driver.findElement(By.id("password")).sendKeys("password");
////			    Thread.sleep(2000);
////			}
////			
////			@When("user click button login")
////			public void user_click_button_login() throws InterruptedException {
////			    driver.findElement(By.id("tombol_login")).click();
////			    Thread.sleep(2000);
////			}
////			
////			@Then("user confirm notification")
////			public void user_confirm_notification() {
////				driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////			}
////			
////			@When("user click menu produk")
////			public void user_click_menu_produk() {
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////			}
////			
////			@When("user click button add produk")
////			public void user_click_button_add_produk() {
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////			}
////			
////			@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////			public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("064");
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////			}
////			
////			@When("user click button save changes")
////			public void user_click_button_save_changes() {
////				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////			}
////			
////			}*/
////	
////	//VARIANSI 22 nama produk(INVALID), SKU(VALID), deskripsi(VALID), harga(VALID) ,kuantitas(INVALID)
////	//test 65
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("065");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	//test 66
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("066");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	//test 67
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("067");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	
////	// VARIANSI 23 nama produk(INVALID),SKU(VALID), deskripsi  harga(INVALID) , kuantitas(VALID)
////	//test 68
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("068");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	//test 69
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("069");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	//test 70
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("070");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	
////	//VARIANSI 24 nama produk(INVALID), SKU(VALID) ,deskripsi  harga kuantitas(INVALID)
////	//test 71
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("071");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////		
////	//test 72
/////*@Given("browser is open")
////public void browser_is_open() {
////	 System.out.println("Inside Step - browser is open");
////	   
////	   String projecPath = System.getProperty("user.dir");
////	   System.out.println("Project path is:"+projecPath);
////	   
////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////	   
////	   driver = new ChromeDriver();
////	   
////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////	}
////
////@Given("user is on login page")
////public void user_is_on_login_page() {
////	 driver.navigate().to("http://127.0.0.1:8000/login/");
////}
////
////@When("user enters email and password")
////public void user_enters_email_and_password() throws InterruptedException {
////    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////    driver.findElement(By.id("password")).sendKeys("password");
////    Thread.sleep(2000);
////}
////
////@When("user click button login")
////public void user_click_button_login() throws InterruptedException {
////    driver.findElement(By.id("tombol_login")).click();
////    Thread.sleep(2000);
////}
////
////@Then("user confirm notification")
////public void user_confirm_notification() {
////	driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////}
////
////@When("user click menu produk")
////public void user_click_menu_produk() {
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////}
////
////@When("user click button add produk")
////public void user_click_button_add_produk() {
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////}
////
////@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("072");
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////}
////
////@When("user click button save changes")
////public void user_click_button_save_changes() {
////	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////}
////
////}*/
////
//////test 73
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("073");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	
////	// VARIANSI 25 nama produk(INVALID), SKU(INVALID) ,deskripsi  harga kuantitas(VALID)
////
//////test 74
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("30000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("30");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////
//////test 75
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("wafer");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////	
////	//test 76
/////*@Given("browser is open")
////public void browser_is_open() {
////	 System.out.println("Inside Step - browser is open");
////	   
////	   String projecPath = System.getProperty("user.dir");
////	   System.out.println("Project path is:"+projecPath);
////	   
////	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////	   
////	   driver = new ChromeDriver();
////	   
////	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////	}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("susu coklat");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////		
////		//VARIANSI 26 nama produk(INVALID), SKU(INVALID) ,deskripsi  harga(VALID), kuantitas(INVALID)
////	
////	//test 77
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("mineral");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("12000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////
//////test 78
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("30000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
////
//////test 79
////	/*@Given("browser is open")
////	public void browser_is_open() {
////		 System.out.println("Inside Step - browser is open");
////		   
////		   String projecPath = System.getProperty("user.dir");
////		   System.out.println("Project path is:"+projecPath);
////		   
////		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////		   
////		   driver = new ChromeDriver();
////		   
////		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////		}
////	
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		 driver.navigate().to("http://127.0.0.1:8000/login/");
////	}
////	
////	@When("user enters email and password")
////	public void user_enters_email_and_password() throws InterruptedException {
////	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////	    driver.findElement(By.id("password")).sendKeys("password");
////	    Thread.sleep(2000);
////	}
////	
////	@When("user click button login")
////	public void user_click_button_login() throws InterruptedException {
////	    driver.findElement(By.id("tombol_login")).click();
////	    Thread.sleep(2000);
////	}
////	
////	@Then("user confirm notification")
////	public void user_confirm_notification() {
////		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////	}
////	
////	@When("user click menu produk")
////	public void user_click_menu_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////	}
////	
////	@When("user click button add produk")
////	public void user_click_button_add_produk() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////	}
////	
////	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("wafer");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////	}
////	
////	@When("user click button save changes")
////	public void user_click_button_save_changes() {
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////	}
////	
////	}*/
			////VARIANSI 27 nama produk(INVALID), SKU(INVALID) ,deskripsi(VALID)  harga(INVALID), kuantitas(VALID)
		//		//test 80
//	@Given("browser is open")
//	public void browser_is_open() {
//		 System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	 driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	
//	@When("user enters email and password")
//	public void user_enters_email_and_password() throws InterruptedException {
//	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("password");
//	    Thread.sleep(2000);
//	}
//	
//	@When("user click button login")
//	public void user_click_button_login() throws InterruptedException {
//	    driver.findElement(By.id("tombol_login")).click();
//	    Thread.sleep(2000);
//	}
//	
//	@Then("user confirm notification")
//	public void user_confirm_notification() {
//		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
//	}
//	
//	@When("user click menu produk")
//	public void user_click_menu_produk() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
//	}
//	
//	@When("user click button add produk")
//	public void user_click_button_add_produk() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
//	}
//	
//	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
//	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
//	}
//	
//	@When("user click button save changes")
//	public void user_click_button_save_changes() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
//	}
////	
//	}
//////	
////	//test 81
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("mineral");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("20");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 82
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("30");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////				////VARIANSI 28 nama produk(INVALID), SKU(INVALID) ,deskripsi(VALID),  harga(INVALID), kuantitas(INVALID)
////	//test 83
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("sereal");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/

			//		//test 84
	//	@Given("browser is open")
	//	public void browser_is_open() {
	//		 System.out.println("Inside Step - browser is open");
	//		   
	//		   String projecPath = System.getProperty("user.dir");
	//		   System.out.println("Project path is:"+projecPath);
	//		   
	//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
	//		   
	//		   driver = new ChromeDriver();
	//		   
	//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//		}
	//	
	//	@Given("user is on login page")
	//	public void user_is_on_login_page() {
	//	 driver.navigate().to("http://127.0.0.1:8000/login");
	//	}
	//	
	//	@When("user enters email and password")
	//	public void user_enters_email_and_password() throws InterruptedException {
	//	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	//	    driver.findElement(By.id("password")).sendKeys("password");
	//	    Thread.sleep(2000);
	//	}
	//	
	//	@When("user click button login")
	//	public void user_click_button_login() throws InterruptedException {
	//	    driver.findElement(By.id("tombol_login")).click();
	//	    Thread.sleep(2000);
	//	}
	//	
	//	@Then("user confirm notification")
	//	public void user_confirm_notification() {
	//		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
	//	}
	//	
	//	@When("user click menu produk")
	//	public void user_click_menu_produk() {
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
	//	}
	//	
	//	@When("user click button add produk")
	//	public void user_click_button_add_produk() {
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
	//	}
	//	
	//	@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
	//	public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("coklat");
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
	//	}
	//	
	//	@When("user click button save changes")
	//	public void user_click_button_save_changes() {
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
	//	}
	////	
	//	}
//////	
////	//test 85
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("mineral");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////			////VARIANSI 29 nama produk(INVALID), SKU(INVALID) ,deskripsi(INVALID),  harga(VALID), kuantitas(VALID)
////	//test 86
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("30000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("30");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//test 87
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("40");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/

//	//test 88
//		/*@Given("browser is open")
//		public void browser_is_open() {
//			 System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			}
//		
//		@Given("user is on login page")
//		public void user_is_on_login_page() {
//		 driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		
//		@When("user enters email and password")
//		public void user_enters_email_and_password() throws InterruptedException {
//		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("password");
//		    Thread.sleep(2000);
//		}
//		
//		@When("user click button login")
//		public void user_click_button_login() throws InterruptedException {
//		    driver.findElement(By.id("tombol_login")).click();
//		    Thread.sleep(2000);
//		}
//		
//		@Then("user confirm notification")
//		public void user_confirm_notification() {
//			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
//		}
//		
//		@When("user click menu produk")
//		public void user_click_menu_produk() {
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
//		}
//		
//		@When("user click button add produk")
//		public void user_click_button_add_produk() {
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
//		}
//		
//		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
//		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("10000");
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("10");
//		}
//		
//		@When("user click button save changes")
//		public void user_click_button_save_changes() {
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
//		}
//	//	
//		}*/
//////	
		//VARIANSI 30 nama produk(INVALID), SKU(INVALID) ,deskripsi(INVALID)  harga(VALID), kuantitas(INVALID)
////	//test 89
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("12000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////
////	//test 90
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("30000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
////	//test 91
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("40000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/

			////	//test 92
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("30000");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
////	
				////VARIANSI 31 nama produk(INVALID), SKU(INVALID) ,deskripsi  harga(VALID), kuantitas(INVALID)
////	//test 93
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("20");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/

			////	//test 94
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("20");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
		

		
			////	//test 95
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("20");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
		
			////	//test 96
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("20");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
					////VARIANSI 32 SEMUA INPUTAN INVALID
////	test 97
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/

			////	//test 98
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
		

		
			////	//test 99
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/
		
			////	//test 100
////		/*@Given("browser is open")
////		public void browser_is_open() {
////			 System.out.println("Inside Step - browser is open");
////			   
////			   String projecPath = System.getProperty("user.dir");
////			   System.out.println("Project path is:"+projecPath);
////			   
////			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
////			   
////			   driver = new ChromeDriver();
////			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			}
////		
////		@Given("user is on login page")
////		public void user_is_on_login_page() {
////			 driver.navigate().to("http://127.0.0.1:8000/login/");
////		}
////		
////		@When("user enters email and password")
////		public void user_enters_email_and_password() throws InterruptedException {
////		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
////		    driver.findElement(By.id("password")).sendKeys("password");
////		    Thread.sleep(2000);
////		}
////		
////		@When("user click button login")
////		public void user_click_button_login() throws InterruptedException {
////		    driver.findElement(By.id("tombol_login")).click();
////		    Thread.sleep(2000);
////		}
////		
////		@Then("user confirm notification")
////		public void user_confirm_notification() {
////			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
////		}
////		
////		@When("user click menu produk")
////		public void user_click_menu_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[3]/a")).click();
////		}
////		
////		@When("user click button add produk")
////		public void user_click_button_add_produk() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/a")) .click();
////		}
////		
////		@When("user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas")
////		public void user_nama_produk_kemudian_SKU_lalu_deskripsi_lalu_harga_dan_kuantitas() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/textarea")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[4]/input")).sendKeys("");
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("");
////		}
////		
////		@When("user click button save changes")
////		public void user_click_button_save_changes() {
////			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/div[2]/div[2]/button/span[1]")).click();
////		}
////		
////		}*/

		

		

		
