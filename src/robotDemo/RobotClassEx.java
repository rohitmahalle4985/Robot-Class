package robotDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RobotClassEx {
public static void main(String[] args) throws Exception
{
	WebDriver driver =new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.javabykiran.com");
	
	Robot robot=new Robot();
	
	robot.mouseMove(630,420);
	
	robot.delay(1500);
	
	//For press left key
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	
	//For press
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	
	robot.delay(1500);
	
	//press keyboard arrow key to select save RADIO BUTTON
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	
	//press enter key
	robot.keyPress(KeyEvent.VK_ENTER);
	
	
	
	
	
	
			
}
}
