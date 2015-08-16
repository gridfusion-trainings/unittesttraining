package unit;

import org.testng.Assert;
import org.testng.annotations.Test;



public class InputProcessorTest {
		
	@Test
	public void shouldRemoveWhitespacesInName() {
		
		app.InputProcessor inputProcessor = new app.InputProcessor();
		Assert.assertEquals(inputProcessor.stripWhitespaces("Michael Palotas"), "MichaelPalotas");
	}

	
	@Test
	public void shouldRemoveMultipleWhitespacesInName() {
		
		app.InputProcessor inputProcessor = new app.InputProcessor();
		Assert.assertEquals(inputProcessor.stripWhitespaces("Mi ch ael Pal o tas "), "MichaelPalotas");
	}
	
	
}
