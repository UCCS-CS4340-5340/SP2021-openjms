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
import org.exolab.jms.client.JmsTopic;
import org.exolab.jms.tools.migration.proxy.Subscription;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSubscription {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic("");
      Subscription subscription0 = new Subscription((JmsDestination) jmsTopic0);
      JmsTopic jmsTopic1 = (JmsTopic)subscription0.getDestination();
      assertEquals(false, jmsTopic1.isWildCard());
  }

  @Test
  public void test1()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      Subscription subscription0 = new Subscription((JmsDestination) jmsTopic0);
      List<Object> list0 = subscription0.getMessages();
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      Subscription subscription0 = new Subscription((JmsDestination) jmsTopic0);
      subscription0.addMessage("", true);
  }
}
