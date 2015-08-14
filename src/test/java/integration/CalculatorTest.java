package integration;

import org.testng.Assert;
import org.testng.annotations.Test;

import application.Calculator;


public class CalculatorTest {
	
	@Test(groups="integration")
	public void shouldRemoveSingleWhitespaceInName() {
		
		Calculator calc = new Calculator();		
		Assert.assertEquals(calc.calculateNumberOfChars("Michael Palotas"), 14);			
	}
	
	@Test(groups="integration")
	public void shouldRemoveMultipleWhitespaceInName() {

		Calculator calc = new Calculator();		
		Assert.assertEquals(calc.calculateNumberOfChars("Mi ch ael    Palo tas"), 14);				
	}
	
}



