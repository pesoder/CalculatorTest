package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;

public class StepDefinitions {

	private WebDriver driver;

	@Given("I have entered page www.marshu.com\\/articles\\/calculate-addition-calculator-add-two-numbers.php")
	public void i_have_entered_page_www_marshu_com_articles_calculate_addition_calculator_add_two_numbers_php() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
		driver.manage().window().maximize();
	}
	@Given("I have entered {int}")
	public void i_have_entered(Integer int1) throws InterruptedException {
		//	    Thread.sleep(1000); 
		WebElement num1Box = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[1]/input"));
		num1Box.sendKeys(String.valueOf(int1));
	}
	@Given("I have also entered {int}")
	public void i_have_also_entered(Integer num2) {
		WebElement num2Box = driver.findElement(By.name("n02"));
		num2Box.sendKeys(String.valueOf(num2));
	}
	@When("I press add")
	public void i_press_add() throws InterruptedException {
		//		Thread.sleep(1000);
		WebElement addBox = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[4]/input"));
		addBox.click();
	}
	



	

	@When("I clear value")
	public void i_clear_value() {
		WebElement num1Box = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[1]/input"));
		num1Box.clear();
	}





	@Then("the result should be {int}")
	public void the_result_should_be(Integer int1) throws InterruptedException {
		String result;
		WebElement resultBox = driver.findElement(By.name("answer"));
		result=resultBox.getAttribute("value");
		assertEquals(String.valueOf(int1),result);
		//		Thread.sleep(2000);
		driver.quit();
	}



}
