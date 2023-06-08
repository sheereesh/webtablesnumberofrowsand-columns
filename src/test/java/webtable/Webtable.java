package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div/ul/li/a[contains(text(),'Sortable Data Tables')]")).click();
		int rows=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody/tr")).size();
		System.out.println("number of rows "+rows);
		int colums=driver.findElements(By.xpath("//table[@id=\"table1\"]/thead/tr/th")).size();
		System.out.println("number of columns "+ colums);
		driver.close();
	}

}
