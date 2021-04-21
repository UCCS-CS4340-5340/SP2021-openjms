/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.naming.NamingException;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.server.JmsServer;
import org.exolab.jms.server.ServerException;
import org.exolab.jms.service.ServiceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JmsServerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      JmsServer jmsServer0 = new JmsServer(configuration0);
      // Undeclared exception!
      try {
        jmsServer0.init();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JmsServer.usage();
  }

  @Test
  public void test2()  throws Throwable  {
      JmsServer jmsServer0 = null;
      try {
        jmsServer0 = new JmsServer("");
        fail("Expecting exception: ServerException");
      } catch(ServerException e) {
        /*
         * Failed to read configuration: 
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      JmsServer jmsServer0 = new JmsServer(configuration0);
      jmsServer0.registerServices();
  }
}
