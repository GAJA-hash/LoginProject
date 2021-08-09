package login;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","H:\\JAVA\\JAVA Projects\\LoginProject\\lib\\Chromedriver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("http://www.cheyyarkurinjikuganmatrimony.com/index.aspx");

			try {

				WebElement signup = driver.findElement(By.xpath("//*[@id=”navbarCollapse”]/ul/li[2]/a"));

						signup.click();

				WebElement login= driver.findElement(By.xpath("//*[@id=”modalSignUp”]/div/div/div/div/div[4]/p/a"));

						login.click();

				String windowHandle = driver.getWindowHandle();

				WebElement TextBox = driver.findElement(By.xpath("//*[@id=”login-modal-form”]/div[1]/div/input"));

						TextBox.sendKeys("SM339");

				WebElement Password = driver.findElement(By.xpath("//*[@id=”login-modal-form”]/div[2]/div/input"));

						Password.sendKeys("RAMAN");

				WebElement proceed = driver.findElement(By.xpath("//*[@id=”login-modal-form”]/div[4]/button"));

						proceed.click();

			}

		catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

}