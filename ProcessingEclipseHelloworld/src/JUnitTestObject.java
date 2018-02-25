
public class JUnitTestObject {
	   private String message;

	   //Constructor
	   //@param message to be printed
	   public JUnitTestObject(String message){
	      this.message = message;
	   }

	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   
}
