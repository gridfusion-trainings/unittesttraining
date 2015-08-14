package unit;

import app.InputProcessor;
import org.testng.Assert;
import org.testng.annotations.Test;



public class StripperTest {
		
	@Test
	public void shouldRemoveWhitespacesInName() {
		
		InputProcessor stripper = new InputProcessor();
		Assert.assertEquals(stripper.stripWhitespaces("Michael Palotas"), "MichaelPalotas");
	}

	
	@Test
	public void shouldRemoveMultipleWhitespacesInName() {
		
		InputProcessor stripper = new InputProcessor();
		Assert.assertEquals(stripper.stripWhitespaces("Mi ch ael Pal o tas "), "MichaelPalotas");
	}
	
	
}
