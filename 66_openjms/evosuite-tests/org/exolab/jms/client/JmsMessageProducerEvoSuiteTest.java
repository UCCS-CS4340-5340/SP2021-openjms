/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.Destination;
import org.exolab.jms.client.JmsMessageProducer;
import org.exolab.jms.client.JmsSession;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JmsMessageProducerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsMessageProducer jmsMessageProducer0 = null;
      try {
        jmsMessageProducer0 = new JmsMessageProducer((JmsSession) null, (Destination) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'session' is null
         */
      }
  }
}