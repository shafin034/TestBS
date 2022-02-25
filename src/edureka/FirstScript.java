package edureka;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;  



public class FirstScript {
	
	
	
	public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://automationpractice.com/index.php";
        //String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();


        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();//click to signin button
        JavascriptExecutor js=(JavascriptExecutor)driver;//(Common for all type scroll)//
        js.executeScript("window.scrollBy(500,300)");
        //account create
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Random rand = new Random();
        int randUser = rand.nextInt(1000);

        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("abcz"+randUser+"@gmail.com");
        driver.findElement(By.cssSelector("button#SubmitCreate")).click();
        
        js.executeScript("window.scrollBy(0,50)");
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.findElement(By.cssSelector("input[id='id_gender1']")).click();
        driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("pasa");
        driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Khan");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("12345");
        //driver.findElement(By.xpath("")).sendKeys("Khan");


      //Thread.sleep(4000);
        Select day=new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
        day.selectByVisibleText("13  ");
        //Thread.sleep(4000);
        Select month=new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
        month.selectByVisibleText("February ");
        //Thread.sleep(4000);
        Select year =new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
        year.selectByVisibleText("1998  ");
        
        js.executeScript("scroll(0,400)");

        driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Ashkona");
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Dhaka");

        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Ashkona, Dhaka");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Dhaka");
        
        js.executeScript("scroll(0,100)");

        Select state =new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
        state.selectByVisibleText("Ohio");

        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("12135");

        Select country =new Select(driver.findElement(By.xpath("//*[@id=\"id_country\"]")));
        country.selectByVisibleText("United States");

        driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("01915473972");
        driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Dhakkhin khan");

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span")).click();
        
        
        ///////////order///////////////
        
        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")).click();
        
      
        
        js.executeScript("scroll(0,300)");
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(3000);
        js=(JavascriptExecutor)driver;
        js.executeScript("scroll(0,400)");
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")).click();
        Thread.sleep(3000);
        js.executeScript("scroll(0,-400)");
        //T-shirt section
        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")).click();
        Thread.sleep(3000);
        js.executeScript("scroll(0,400)");
        driver.findElement(By.xpath("//a[@id='color_2']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click();
        


        
        






        
        
        
       
        //close Fire fox
        //driver.close();
       
    }

}
