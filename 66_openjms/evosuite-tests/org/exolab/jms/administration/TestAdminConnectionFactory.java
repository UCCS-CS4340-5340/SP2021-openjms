/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.administration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.net.MalformedURLException;
import javax.jms.JMSException;
import org.exolab.jms.administration.AdminConnectionFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestAdminConnectionFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      try {
        AdminConnectionFactory.create((String) null);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Failed to get registry service for URL: null
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AdminConnectionFactory adminConnectionFactory0 = new AdminConnectionFactory();
      assertNotNull(adminConnectionFactory0);
  }
}
