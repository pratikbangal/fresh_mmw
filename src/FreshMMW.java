import org.openqa.selenium.By;
import org.testng.annotations.Test;

import webonise.automation.core.WeboAutomation;


public class FreshMMW extends WeboAutomation{
	
	FreshMMW()
	{
		super();
		initalizeReport(this.getClass().getName());
	}

	@Test(dataProvider = "xml", enabled = true, priority = 1)
	public void FreshMMW(Integer iteration, Boolean expectedresult) throws Exception
	{
		updateTCData(iteration);
		actions.launchBrowser(getValue("home_url"));
		Thread.sleep(3000);
		actions.click(getObjID("signup"));
		Thread.sleep(3000);
		actions.sendKeys(getObjID("name"), getValue("name"));
		actions.sendKeys(getObjID("mobile"), getValue("mobile"));
		actions.selectByValue(getObjID("date"), "8");
		actions.selectByValue(getObjID("month"), "8");
		actions.selectByValue(getObjID("year"), "1989");
		
		int ran;
	    ran = (int)(Math.random() * ((10000 - 100) + 1));
		
	    driver.findElement(By.id("user_email")).sendKeys("pratiik" + ran + "@gmail.com");
		//actions.sendKeys(getObjID("email"), getValue("email"));
		actions.sendKeys(getObjID("password"), getValue("password"));
		actions.sendKeys(getObjID("repassword"), getValue("repassword"));
		actions.click(getObjID("clickemail"));
		Thread.sleep(3000);
		
		//tell us about yourself page
		
		actions.sendKeys(getObjID("pin"), getValue("pin"));
		actions.click(getObjID("pinclick"));
		actions.sendKeys(getObjID("city"), getValue("city"));
		actions.click(getObjID("cityclick"));
		actions.sendKeys(getObjID("state"), getValue("state"));
		actions.click(getObjID("stateclick"));
		actions.sendKeys(getObjID("addp"), getValue("addp"));
		actions.click(getObjID("addpclick"));
		actions.sendKeys(getObjID("streetadd"), getValue("streetadd"));
		actions.click(getObjID("streetaddclick"));
		actions.click(getObjID("singles"));
		actions.click(getObjID("singlesclick"));
		actions.sendKeys(getObjID("fass"), getValue("fass"));
		actions.click(getObjID("fassclick"));
		actions.sendKeys(getObjID("country"), getValue("country"));
		actions.click(getObjID("countryclick"));
		actions.sendKeys(getObjID("occupation"), getValue("occupation"));
		actions.click(getObjID("occupationclick"));
		actions.sendKeys(getObjID("income"), getValue("income"));
		actions.click(getObjID("incomeclick"));
		actions.sendKeys(getObjID("sow"), getValue("sow"));
		actions.click(getObjID("sowclick"));
		actions.click(getObjID("politics"));
		actions.click(getObjID("politicsclick"));
		actions.click(getObjID("taxres"));
		actions.click(getObjID("taxresclick"));
		actions.sendKeys(getObjID("pans"), getValue("pans"));
		actions.click(getObjID("pansclick"));
		actions.sendKeys(getObjID("namepan"), getValue("namepan"));
		actions.click(getObjID("namepanclick"));
		actions.sendKeys(getObjID("bnkname"), getValue("bnkname"));
		actions.click(getObjID("bnknameclick"));
		actions.sendKeys(getObjID("bran"), getValue("bran"));
		actions.click(getObjID("branclick"));
	}
}
