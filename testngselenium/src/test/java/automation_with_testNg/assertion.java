package automation_with_testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {

  @Test
  public void testAssertions() {

    String str1 = new String("TestNg");
    String str2 = new String("TestNg");
    String str3 = null;
    String str4 = "hello";
    String str5 = "hello";
    String str6 = "hi";

    // Equal values
    Assert.assertEquals(str4, str5);
    System.out.println("Equals passed");

    // Not equal
    Assert.assertNotEquals(str1, str6);
    System.out.println("NotEquals passed");

    // Same reference (string pool)
    Assert.assertSame(str4, str5);
    System.out.println("Same passed");

    // Not same
    Assert.assertNotSame(str1, str2);
    System.out.println("NotSame passed");

    // False condition
    Assert.assertFalse(str6.equals(str4));
    System.out.println("False passed");
  }
}