package Countries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country3 {
  @Test
  public void sig() {
	  
	  String name = "Signapore";
	  Assert.assertEquals(name, "Signapore");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void ko() {
	  
	  String name = "Korea";
	  Assert.assertEquals(name, "Korea");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void jp() {
	  
	  String name = "Japan";
	  Assert.assertEquals(name, "Japan");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void mal() {
	  
	  String name = "Malyasia";
	  Assert.assertEquals(name, "Malyasia");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void zim() {
	  
	  String name = "Zimbambe";
	  Assert.assertEquals(name, "Zimbambe");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void som() {
	  
	  String name = "Somalia";
	  Assert.assertEquals(name, "Somalia");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void bang() {
	  
	  String name = "Bangladesh";
	  Assert.assertEquals(name, "Bangladesh");
	  System.out.println("The Country name as : " +name);
  }
  
}
