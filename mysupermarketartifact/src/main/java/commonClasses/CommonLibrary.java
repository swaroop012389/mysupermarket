package commonClasses;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLibrary 
{
public void takeScreenShot(String methodName)
{
	EventFiringWebDriver efw = new EventFiringWebDriver(SuperTestScript.driver); 
	File f1 = efw.getScreenshotAs(OutputType.FILE);
	File f2 = new File(".src//test//resources//FailedTS"+methodName+".png");
	try 
	{
		FileUtils.moveFile(f1,f2);
	}
	catch(Exception rv)
	{
		
	}
}

public void selectOptionFromDropdownByIndex(WebElement dropdown, int index)
{
Select s = new Select(dropdown);
s.selectByIndex(index);
}

public void selectOptionFromDropdownByValue(WebElement dropdown, String value)
{
Select s = new Select(dropdown);
s.selectByValue(value);
}

public void selectOptionFromDropdownByVisibleText(WebElement dropdown, String visibleText)
{
Select s = new Select(dropdown);
s.selectByVisibleText(visibleText);
}

public void pointerActionMoveToElement(WebElement elementToMoveTo)
{
	Actions a1 = new Actions(SuperTestScript.driver);
    a1.moveToElement(elementToMoveTo).perform();
}

public void pointerActionDragAndDrop(WebElement sourceElement,WebElement targetElement)
{
	Actions a1 = new Actions(SuperTestScript.driver);
    a1.dragAndDrop(sourceElement,targetElement).perform();
}

public void pointerActionContextClick(WebElement elementToClickOn)
{
	Actions a1 = new Actions(SuperTestScript.driver);
    a1.contextClick(elementToClickOn).perform();
}






}
