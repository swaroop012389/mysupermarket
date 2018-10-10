package scripts;


import org.testng.annotations.Test;

import Pages.PoundstretchersMyTopOffersPage;

import commonClasses.SuperTestScript;


public class BasketCreateScript extends SuperTestScript
{
 
	@Test
	public void testBasketCreateScript()
	{		
		PoundstretchersMyTopOffersPage pmtop = new PoundstretchersMyTopOffersPage();
		WelcomePage wp = new WelcomePage();
		TescoMyTopOffersPage tmtop = new TescoMyTopOffersPage();
		TescoApplesPage tap = new TescoApplesPage();
		
		wp.clickOnPoundstretcherLink();
		pmtop.clickOnSelectStoreDropDown();
		pmtop.selectStoreFromDropdown(1);
		tmtop.clickOnCategoryFilter();		
		tmtop.clickOnApplesFilter();
		tap.clickOnAddToBasket();			
	}	
}