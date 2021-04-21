/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.orb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.RemoteException;
import org.exolab.jms.net.connector.Authenticator;
import org.exolab.jms.net.orb.ORB;
import org.exolab.jms.net.orb.ORBFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ORBFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ORB oRB0 = ORBFactory.createORB("");
      assertNotNull(oRB0);
  }

  @Test
  public void test1()  throws Throwable  {
      ORB oRB0 = ORBFactory.createORB();
      assertNotNull(oRB0);
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        ORBFactory.createORB((Authenticator) null, "fN6IYN5Uu]c");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'authenticator' is null
         */
      }
  }
}
