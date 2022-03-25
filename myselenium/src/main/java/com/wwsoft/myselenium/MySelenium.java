package com.wwsoft.myselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MySelenium {
	
	public static void basicTest() {
		// declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.1.2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        System.out.println("actualTitle: " +  actualTitle);

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        //close browser
	    driver.close();
	}
	
	public static void clickTest() {		
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.1.2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3docs.com/learn-html.html");
		driver.findElement(By.linkText("HTML Elements")).click() ;
		
	    //close browser
	    // driver.close();
	}


	public static void selectTest() {		
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.1.2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3docs.com/learn-html/html-lists.html");
		Select sel = new Select(driver.findElement(By.tagName("select")));
		sel.selectByValue("books");
	        
	    //close browser
	    // driver.close();
	}
	
    public static void main(String[] args) {
            
    	//basicTest();
    	// clickTest();
    	selectTest();
    }

}
