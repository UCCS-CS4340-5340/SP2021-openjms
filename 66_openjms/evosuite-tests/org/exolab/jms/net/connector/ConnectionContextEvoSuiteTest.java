/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.connector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.security.Principal;
import org.exolab.jms.net.connector.Connection;
import org.exolab.jms.net.connector.ConnectionContext;
import org.exolab.jms.net.connector.ConnectionFactory;
import org.exolab.jms.net.uri.URI;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ConnectionContextEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      Connection connection0 = null;
      try {
        connection0 = ConnectionContext.getConnection((URI) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ConnectionFactory connectionFactory0 = ConnectionContext.getConnectionFactory();
      ConnectionContext.push((Principal) null, connectionFactory0);
  }

  @Test
  public void test2()  throws Throwable  {
      ConnectionContext.pop();
  }
}