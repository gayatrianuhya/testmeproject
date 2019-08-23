package skeleton;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class Cucumcasestudy {
	 static WebDriver driver;
	@Given("TestMe app is launched")
	public void testme_app_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Then("click on Signup link")
	public void click_on_Signup_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("fill username{string}")
	public void fill_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).click();
		driver.findElement(By .name("userName")).sendKeys(string);
	}

	@Then("fill firstname{string}")
	public void fill_firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("firstName")).sendKeys(string);
	}

	@Then("lastname{string}")
	public void lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .name("lastName")).sendKeys(string);
	}

	@Then("password{string}")
	public void password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(string);
		
	}

	@Then("confirm password{string}")
	public void confirm_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .name("confirmPassword")).sendKeys(string);
	}

	@Then("fill gender")
	public void fill_gender() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .xpath("//*[@id=\"gender\"]")).click();
	}

	@Then("fill email {string}")
	public void fill_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("emailAddress")).sendKeys(string);
	}

	@Then("fill mobilenumber{string}")
	public void fill_mobilenumber(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .name("mobileNumber")).sendKeys(string);
	}

	@Then("fill DOB {string}")
	public void fill_DOB(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  driver.findElement(By .name("dob")).sendKeys(string);
	}

	@Then("fill address{string}")
	public void fill_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  driver.findElement(By .name("address")).sendKeys(string);
		
	}

	@Then("fill security question")
	public void fill_security_question() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
		 Select s=new Select(driver.findElement(By.name("security question")));
    s.selectByValue("411010");
}

	@Then("fill answer {string}")
	public void fill_answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("answer")).sendKeys(string);
		
	}

	@Then("click on registration button")
	public void click_on_registration_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		
	}

	@Then("verify the registration login")
	public void verify_the_registration_login() {
		System.out.println("Username already exists");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter valid credentials in username")
	
	public void enter_valid_credentials_in_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		 driver.findElement(By .name("userName")).sendKeys("lalitha");
	}

	@Given("enter valid credentials in password")
	public void enter_valid_credentials_in_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .name("password")).sendKeys("password123");
	}

	@Given("click on login page")
	public void click_on_login_page() {
		  driver.findElement(By .name("Login")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  
	}

	@Then("verify login process")
	public void verify_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 String expected=driver.findElement(By .linkText("SignOut")).getText();
		  System.out.println(expected);
		  String actual="SignOut";
		  Assert.assertEquals(actual,expected);
	}

	@Given("search for product")
	public void search_for_product() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By .xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("click on find details")
	public void click_on_find_details() {
		System.out.println("Goes to product page");
   // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
}

	@Then("click on add to cart")
	public void click_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//add to cart
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		//cart
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		 driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		 driver.findElement(By .xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		
}

	@Then("proceed with payment")
	public void proceed_with_payment() {
		   driver.findElement(By .xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		   //continue
		   driver.findElement(By .xpath("//*[@id=\"btn\"]")).click();
		   //username
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
	     //password
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		   //login
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("continue payment process")
	public void continue_payment_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		//paynow
	 driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	 driver.close();
		   }

	@Given("search the headphone")
	public void search_the_headphone() {
		driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 driver.findElement(By .name("userName")).sendKeys("lalitha");
		  driver.findElement(By .name("password")).sendKeys("password123");
		  driver.findElement(By .name("Login")).click();
		  driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

	@Then("it is not added to cart")
	public void it_is_not_added_to_cart() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("try to proceed payment without adding")
	public void try_to_proceed_payment_without_adding() {
		boolean ex=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
		Assert.assertFalse(ex);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("testme app doesnt proceed")
	public void testme_app_doesnt_proceed() {
		System.out.println("sorry no products are available in the cart");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}






