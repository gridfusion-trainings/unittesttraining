package integration;

import app.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	@Test
	public void shouldRemoveSingleWhitespaceInName() {
		
		Calculator calc = new Calculator();
		Assert.assertEquals(calc.calculateNumberOfChars("Michael Palotas"), 14);			
	}
	
	@Test
	public void shouldRemoveMultipleWhitespaceInName() {

		Calculator calc = new Calculator();		
		Assert.assertEquals(calc.calculateNumberOfChars("Mi ch ael    Palo tas"), 14);				
	}
	
}



