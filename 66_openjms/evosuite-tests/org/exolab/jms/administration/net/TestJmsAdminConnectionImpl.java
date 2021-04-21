/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.administration.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.JMSException;
import org.exolab.jms.administration.net.JmsAdminConnectionImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJmsAdminConnectionImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsAdminConnectionImpl jmsAdminConnectionImpl0 = null;
      try {
        jmsAdminConnectionImpl0 = new JmsAdminConnectionImpl((String) null, (String) null, (String) null);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Failed to get registry service for URL: null
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JmsAdminConnectionImpl jmsAdminConnectionImpl0 = null;
      try {
        jmsAdminConnectionImpl0 = new JmsAdminConnectionImpl("oJ3fMAK~Rsk9+Wq-FUe", "oJ3fMAK~Rsk9+Wq-FUe", "oJ3fMAK~Rsk9+Wq-FUe");
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Failed to get registry service for URL: oJ3fMAK~Rsk9+Wq-FUe
         */
      }
  }
}
