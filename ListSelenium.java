package com.week3.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListSelenium {

	public static void main(String[] args) throws InterruptedException {
		// launch the web driver
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");

		// maximize the browser window
		driver.manage().window().maximize();

		// implicit wait statement to find the elements of a page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");

		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();

		Thread.sleep(5000);
		// To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(5000);
		// Under "Category" click "Fashion Bags"
		// elder to younger sibling
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();

		Thread.sleep(5000);
		// Print the count of the items found.
		WebElement findElement = driver.findElement(By.xpath("//div[@class='length']/strong"));
		String totalItemsFound = findElement.getText();
		System.out.println("Men 'Fashion Bags' items found = " + totalItemsFound);

		// Get the list of brand of the products displayed in the page and print the
		// list.

		List<WebElement> findMenBrandsElements = driver.findElements(By.xpath("//div[@class='brand']"));
		// Get the list of brand of the products displayed in the page
		System.out.println("Men bags brand list count = " + findMenBrandsElements.size());
		// print the list
		for (WebElement webElement : findMenBrandsElements) {
			System.out.println(webElement.getText());
		}

		System.out
				.println("******************************************************************************************");

		// Get the list of names of the bags and print it
		List<WebElement> findMenBrandsBagsElements = driver.findElements(By.xpath("//div[@class='nameCls']"));
		// Get the list of brand of the products displayed in the page
		System.out.println("Men bags name list count = " + findMenBrandsBagsElements.size());
		// print the list
		for (WebElement webElement : findMenBrandsBagsElements) {
			System.out.println(webElement.getText());
		}
	}
}