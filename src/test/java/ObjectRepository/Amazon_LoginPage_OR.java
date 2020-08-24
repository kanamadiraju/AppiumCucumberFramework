package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class Amazon_LoginPage_OR extends desiredCapabilities{

	
	@FindBy(id = "gw-sign-in-button")
	public static WebElement SignIn;
	
	//*/android.view.View[1]/android.view.View[8]/android.view.View[2]/android.widget.EditText")
	
	@FindBy(xpath = "//android.widget.EditText[@text='Amazon password']")
	public static WebElement Password;
	
	@FindBy(xpath = "//android.widget.Button[@text='Login']")
	public static WebElement Login;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Settings']")
	public static WebElement Settings;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Not Ningappa? Sign out']")
	public static WebElement SignOut;
	
	
	@FindBy(id = "android:id/button2")
	public static WebElement SignOutpopup;
}
