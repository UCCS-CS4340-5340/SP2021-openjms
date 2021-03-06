/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Component;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.tools.admin.OnlineConnection;
import org.exolab.jms.tools.admin.OnlineConnectionException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OnlineConnectionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      OnlineConnection onlineConnection0 = null;
      try {
        onlineConnection0 = new OnlineConnection((Component) null, configuration0);
        fail("Expecting exception: OnlineConnectionException");
      } catch(OnlineConnectionException e) {
        /*
         * Failed to connect: java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      OnlineConnection onlineConnection0 = null;
      try {
        onlineConnection0 = new OnlineConnection("|b{ ey^q\"-'X.U(Z#", "|b{ ey^q\"-'X.U(Z#", configuration0);
        fail("Expecting exception: OnlineConnectionException");
      } catch(OnlineConnectionException e) {
        /*
         * Failed to connect: java.lang.NullPointerException
         */
      }
  }
}
