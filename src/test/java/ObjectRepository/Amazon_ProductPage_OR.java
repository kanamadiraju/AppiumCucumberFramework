package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class Amazon_ProductPage_OR extends desiredCapabilities{

	
	@FindBy(xpath ="//android.view.ViewGroup[@index='0']")
	public static WebElement RandomResult;
	
	@FindBy(xpath ="//*[@resource-id='title_feature_div']")
	public static WebElement Name;
	
	@FindBy(id =  "com.amazon.mShop.android.shopping:id/loc_ux_gps_auto_detect")
	public static WebElement UseMyCurrentLocarion;
	
	@FindBy(id ="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	public static WebElement AllowPermission;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Allow access']")
	public static WebElement AllowAccess;
	
	//@FindBy(xpath ="//*[@resource-id='atfRedesign_priceblock_priceToPay']")
	@FindBy(xpath ="//android.widget.EditText[contains(@text,'rupees')]")
	public static WebElement Price;

	@FindBy(id ="com.amazon.mShop.android.shopping:id/glow_subnav_label")
	public static WebElement Inches;
	
	//@FindBy(xpath ="//*[@resource-id='title_feature_div']")
	@FindBy(xpath ="//android.view.View[contains(@text,'Samsung')]")
	//[contains(@text,'65-inch tv')]")
	//@FindBy(className ="android.view.View")
	public static WebElement ProdcutName;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text,'Samsung')]")
	public static WebElement ProdcutNameInCart;
	
	@FindBy(xpath ="//android.view.View[@text='FREE Delivery']")
	public static WebElement ProdcutDetails;
	
	@FindBy(xpath ="//android.view.View[@text='From the manufacturer']")
	public static WebElement FromTheManufacturer;
	
	@FindBy(xpath ="//*[@resource-id='add-to-cart-button']")
	public static WebElement AddToCart;
	
	//@FindBy(id ="in.amazon.mShop.android.shopping:id/atc-success")
	@FindBy(xpath ="//android.view.View[contains(@text,'Added to cart')]")
	public static WebElement AddedToCart;
	
	@FindBy(id ="com.amazon.mShop.android.shopping:id/atc-success")
	public static WebElement CartSuccess;
	
	
}
