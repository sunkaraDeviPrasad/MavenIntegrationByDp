package Countries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country1 {
  @Test
  public void ind() {
	  
	  String name = "India";
	  Assert.assertEquals(name, "India");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void sn() {
	  
	  String name = "Sweden";
	  Assert.assertEquals(name, "Sweden");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void nl() {
	  
	  String name = "New Zealand";
	  Assert.assertEquals(name, "New Zealand");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void dk() {
	  
	  String name = "Denmark";
	  Assert.assertEquals(name, "Denmark");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void it() {
	  
	  String name = "Italy";
	  Assert.assertEquals(name, "Italy");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void aus() {
	  
	  String name = "Australia";
	  Assert.assertEquals(name, "Australia");
	  System.out.println("The Country name as : " +name);
  }
  
}
