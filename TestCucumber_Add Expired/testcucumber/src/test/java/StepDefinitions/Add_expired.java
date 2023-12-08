package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class Add_expired {
		String[][] data = {
				//Varian 1 
			    {"100", "13/04/2025"}, //0
			    {"125", "14/04/2025"}, //1
			    {"129", "13/04/2026"}, //2
			    {"30", "14/04/2026"}, //3
			    {"50", "13/04/2027"}, //4
			    {"51", "14/04/2027"}, //5
			    {"52", "13/04/2028"}, //6
			    {"53", "14/04/2028"}, //7
			    {"54", "13/04/2029"},//8
			    {"55", "14/04/2029"},//9
			    {"30", "13/04/2030"},//10
			    {"57", "14/04/2030"},//11
			    {"58", "13/04/2031"},//12
			    {"59", "14/04/2031"},//13
			    {"60", "13/04/2032"},//14
			    {"22", "14/04/2032"},//15
			    {"23", "13/04/2033"},//16
			    {"24", "14/04/2033"},//17
			    {"25", "13/04/2034"},//18
			    {"26", "14/04/2034"},//19
			    {"27", "13/04/2035"},//20
			    {"28", "14/04/2035"},//21
			    {"29", "13/04/2036"},//22
			    {"30", "14/04/2036"},//23
			    {"31", "13/04/2037"},//24
			    
			    //Varian 2
			    {"1001", "14/04/2037"},//25
			    {"2030", "13/04/2038"},//26
			    {"3100", "14/04/2038"},//27
			    {"810", "13/04/2039"},//28
			    {"820", "14/04/2039"},//29
			    {"830", "13/04/2040"},//30
			    {"840", "14/04/2040"},//31
			    {"850", "13/04/2041"},//32
			    {"860", "14/04/2041"},//33
			    {"870", "13/04/2042"},//34
			    {"880", "14/04/2042"},//35
			    {"890", "13/04/2043"},//36
			    {"900", "14/04/2043"},//37
			    {"910", "13/04/2044"},//38
			    {"920", "14/04/2044"},//39
			    {"930", "13/04/2045"},//40
			    {"940", "14/04/2045"},//41
			    {"950", "13/04/2046"},//42
			    {"960", "14/04/2046"},//43
			    {"970", "13/04/2047"},//44
			    {"980", "14/04/2047"},//45
			    {"990", "13/04/2048"},//46
			    {"1000", "14/04/2048"},//47
			    {"1010", "13/04/2049"},//48
			    {"1020", "14/04/2049"},//49

			    //Varian 3
			    {"100", "01 Januari 2030"}, //50
			    {"125", "02 Februari 2030"},//51
			    {"129", "03 Februari 2030"},//52
			    {"30", "04 Maret 2030"},//53
			    {"50", "05 April 2030"},//54
			    {"51", "06 Mei 2030"},//55
			    {"52", "07 Juni 2030"},//56
			    {"53", "08 Juli 2030"},//57
			    {"54", "09 Agustus 2030"},//58
			    {"55", "10 September 2030"},//59
			    {"30", "11 Oktober 2030"},//60
			    {"57", "12 November 2030"},//61
			    {"58", "13 Desember 2030"},//62
			    {"59", "14 Januari 2030"},//63
			    {"60", "15 Februari 2030"},//64
			    {"22", "16 Maret 2030"},//65
			    {"23", "17 Mei 2030"},//66
			    {"24", "18 Juni 2030"},//67
			    {"25", "19 Juli 2030"},//68
			    {"26", "20 Agustus 2030"},//69
			    {"27", "21 September 2030"},//70
			    {"28", "22 Oktober 2030"},//71
			    {"29", "23 November 2030"},//72
			    {"30", "24 Desember 2030"},//73
			    {"31", "25 Januari 2030"},//74
			    
			    //Varian 4
			    {"",""},//75
			    {"1900","1 Januari 2024"},//76
			    {"2000","2 Januari 2024"},//77
			    {"3000","3 Februari 2024"},//78
			    {"4000","4 Februari 2024"},//79
			    {"5000","5 Maret 2024"},//80
			    {"6000","6 Maret 2024"},//81
			    {"7000","7 Maret 2024"},//82
			    {"8000","8 April 2024"},//83
			    {"9000","9 April 2024"},//84
			    {"2030","10 Mei 2024"},//85
			    {"2031","11 Mei 2024"},//86
			    {"2032","12 Mei 2024"},//87
			    {"2033","13 Juni 2024"},//88
			    {"2034","14 Juni 2024"},//89
			    {"2035","15 Juli 2024"},//90
			    {"2036","18 Juli 2024"},//91
			    {"2037","19 Agustus 2024"},//92
			    {"2038","20 Agustus 2024"},//93
			    {"2039","21 September 2024"},//94
			    {"2040","22 September 2024"},//95
			    {"2041","23 Oktober 2024"},//96
			    {"2042","24 November 2024"},//97
			    {"2043","25 Desember 2024"},//98
			    {"2044","26 Desember 2024"}//99
			};

		
		// Input data format [0] - [99], diganti di kotak pertama
		public String kuantitas =data[75][0];
		public String tanggal =data[75][1];
		
		

		
		
		
		WebDriver driver = null;
//1
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
		    driver.navigate().to("http://localhost:8080/try/testing_pkpl/public/login");
		}

		@When("user enters email and password")
		public void user_enters_email_and_password() throws InterruptedException {
		    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		    driver.findElement(By.id("password")).sendKeys("password");
		    Thread.sleep(2000);
		    
		}

		@And("user click button login")
		public void user_click_button_login() throws InterruptedException {
		    driver.findElement(By.id("tombol_login")).click();
		    Thread.sleep(2000);
		}
		
		@Then("user confirm notification")
		public void user_confirm_notification() {
			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]")).click();
		}
		@When("user click menu product")
		public void user_click_menu_product() {
			driver.findElement(By.xpath("//*[@id=\"#kt_aside_menu\"]/div[3]/a/span[2]")).click();
		}

		@And("user click Action")
		public void user_click_Action() {
			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_products_table\"]/tbody/tr[1]/td[9]/a")).click();

		}

		@When("user click Expired")
		public void user_click_Expired() {
			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_products_table\"]/tbody/tr[1]/td[9]/div/div[3]/form/button")).click();

		}

		@And("user enter the data")
		public void user_enter_the_data() {
			driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys(kuantitas);
			driver.findElement(By.xpath("//*[@id=\"expired_date\"]")).sendKeys(tanggal);

		}
		@And("user click button Add product Expired")
		public void user_click_button_Add_product_Expired() {
			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_edit_category_form\"]/div[2]/div/div[2]/form/div[4]/button")).click();

		}
}