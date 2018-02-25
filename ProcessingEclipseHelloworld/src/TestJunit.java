import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	   String message = "Hello World";  
	   JUnitTestObject messageUtil = new JUnitTestObject(message);

	   @Test
	   public void testPrintMessage() {   
	      assertEquals(message,messageUtil.printMessage());
	   }
}
