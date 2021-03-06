/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.client.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.Properties;
import org.exolab.jms.client.net.JmsServerStubImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JmsServerStubImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Properties properties0 = new Properties();
      JmsServerStubImpl jmsServerStubImpl0 = null;
      try {
        jmsServerStubImpl0 = new JmsServerStubImpl((Map) properties0, (Map) properties0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'properties' does not contain property org.exolab.jms.net.orb.provider.uri
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JmsServerStubImpl jmsServerStubImpl0 = null;
      try {
        jmsServerStubImpl0 = new JmsServerStubImpl((Map) null, (Map) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'properties' is null
         */
      }
  }
}
