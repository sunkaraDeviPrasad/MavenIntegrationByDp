package Countries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country2 {
  @Test
  public void pk() {
	  
	  String name = "Pakistan";
	  Assert.assertEquals(name, "Pakistan");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void fr() {
	  
	  String name = "France";
	  Assert.assertEquals(name, "France");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void ch() {
	  
	  String name = "China";
	  Assert.assertEquals(name, "China");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void eg() {
	  
	  String name = "Egpht";
	  Assert.assertEquals(name, "Egpht");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void eng() {
	  
	  String name = "England";
	  Assert.assertEquals(name, "England");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void sa() {
	  
	  String name = "South Africa";
	  Assert.assertEquals(name, "South Africa");
	  System.out.println("The Country name as : " +name);
  }
  
  @Test
  public void srl() {
	  
	  String name = "Sri Lanka";
	  Assert.assertEquals(name, "Sri Lanka");
	  System.out.println("The Country name as : " +name);
  }
  
}
