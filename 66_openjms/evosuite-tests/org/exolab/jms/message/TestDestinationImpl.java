/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectOutput;
import org.exolab.jms.message.DestinationImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDestinationImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DestinationImpl destinationImpl0 = new DestinationImpl();
      // Undeclared exception!
      try {
        destinationImpl0.writeExternal((ObjectOutput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DestinationImpl destinationImpl0 = new DestinationImpl("rzi_6^cZY$");
      boolean boolean0 = destinationImpl0.isEqual(destinationImpl0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DestinationImpl destinationImpl0 = new DestinationImpl("rzi_6^cZY$");
      DestinationImpl destinationImpl1 = (DestinationImpl)destinationImpl0.clone();
      assertEquals("rzi_6^cZY$", destinationImpl1.getDestination());
  }

  @Test
  public void test3()  throws Throwable  {
      DestinationImpl destinationImpl0 = new DestinationImpl("rzi_6^cZY$");
      String string0 = destinationImpl0.getDestination();
      assertEquals("rzi_6^cZY$", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      DestinationImpl destinationImpl0 = new DestinationImpl("rzi_6^cZY$");
      String string0 = destinationImpl0.toString();
      assertNotNull(string0);
      assertEquals("Topic name: rzi_6^cZY$", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      DestinationImpl destinationImpl0 = new DestinationImpl();
      String string0 = destinationImpl0.toString();
      assertEquals("Topic name: NONE", string0);
      assertNotNull(string0);
  }
}
