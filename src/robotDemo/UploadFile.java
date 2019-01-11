package robotDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection; 
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new FirefoxDriver();
		Robot robot=new Robot();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement element=driver.findElement(By.xpath(".//input[contains(@type,'file')]"));
		
		element.click();
		StringSelection stringSelection=new StringSelection("d:\\Daniel-Craig.jpg");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
