package tek.sdet.framework.steps;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();

	    @When ("User click on All section")
	    public void userClickOnAllSection() {
	    	click(factory.homePage().allIcon);
	    	logger.info("user clicked on All sections");
	    	
	    }
	    @Then ("below options are present in Shop by Department sidebar")
	    public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
	    	List<List<String>> expectedSideBar = dataTable.asLists(String.class);
	    	
	    	List<WebElement> actualSideBar = factory.homePage().sideBarElements;
	    	
	    	for(int i=0; i<expectedSideBar.get(0).size();i++) {
	    		Assert.assertEquals(actualSideBar.get(i).getText(),expectedSideBar.get(0).get(i));
	    		logger.info(actualSideBar.get(i).getText() + " is equal to " + expectedSideBar.get(0).get(i));
	    	}
	    	
	    }
	    	@When ("User on {String}")
		    public void userOnElectronics(String deparment) {
		    	List <WebElement> sideBarOptions = factory.homePage().sideBarElements;
		    	for(WebElement option:sideBarOptions) {
		    		if(option.getText().equals(deparment)) {
		    			click(option);
		    			try {
		    				logger.info(option.getText() + " is present ");
		    			}catch (StaleElementReferenceException e) {
		    			}
		    			break;
		    		}
		    	}
		    	
		    }
		    @Then ("below options are present in department")
		    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		    	
		    	List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		    	List<WebElement> actualDepartmentOptions = factory.homePage().sideBarElements;
		    	
		    	for(int i=0; i<expectedDepartmentOptions.get(0).size();i++) {
		    	for(WebElement dept: actualDepartmentOptions) {
		    		if(dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
		    			Assert.assertTrue(isElementDisplayed(dept));
		    			logger.info(dept.getText() + " is present ");
		    			break;
		    			
		    		}
		    	}
		    		
		    }

 }
}
		    