/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.migration.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.List;
import org.exolab.jms.client.JmsDestination;
import org.exolab.jms.client.JmsTemporaryQueue;
import org.exolab.jms.tools.migration.proxy.Subscription;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SubscriptionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      Subscription subscription0 = new Subscription((JmsDestination) jmsTemporaryQueue0);
      JmsTemporaryQueue jmsTemporaryQueue1 = (JmsTemporaryQueue)subscription0.getDestination();
      assertEquals(0L, jmsTemporaryQueue1.getConnectionId());
  }

  @Test
  public void test1()  throws Throwable  {
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      Subscription subscription0 = new Subscription((JmsDestination) jmsTemporaryQueue0);
      List<Object> list0 = subscription0.getMessages();
      assertEquals(0, list0.size());
  }

  @Test
  public void test2()  throws Throwable  {
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      Subscription subscription0 = new Subscription((JmsDestination) jmsTemporaryQueue0);
      subscription0.addMessage("g-9HM!p#Q[pZzk8QAS", true);
  }
}
