package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class Amazon_SearchResultPage_OR extends desiredCapabilities{

	
	@FindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
	public static WebElement HomeSearch;
	
	@FindBy(id ="com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_text")
	public static WebElement SearchDropDown;
	
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'65-inch tv')]")
	//in.amazon.mShop.android.shopping:id/rs_search_src_text
	public static WebElement ResultsCount;
}
