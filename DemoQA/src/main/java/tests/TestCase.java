package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import common.TestBasic;

public class TestCase {
	TestBasic testBase = new TestBasic();
	@Parameters("browser")
	@BeforeMethod 
	public void openWeb(String Browser) {
		testBase.openWebsite(Browser);
	}
}
