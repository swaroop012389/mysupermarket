package commonClasses;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener
{

public void onTestFailure(ITestResult result) 
{
	 String methodName = result.getName();
	 CommonLibrary cl = new CommonLibrary();
	 try 
	 {
		cl.takeScreenShot(methodName);
	 } 
	 catch (IOException e) 
	 {
		
		e.printStackTrace();
   	 }
	
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

}
