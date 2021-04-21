/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectOutput;
import javax.jms.JMSException;
import javax.naming.Reference;
import org.exolab.jms.client.JmsQueue;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJmsQueue {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("R,L=h)\"}");
      // Undeclared exception!
      try {
        jmsQueue0.writeExternal((ObjectOutput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue();
      // Undeclared exception!
      try {
        jmsQueue0.hashCode();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("/\"_ah)P%1n')6G");
      String string0 = jmsQueue0.getQueueName();
      assertEquals("/\"_ah)P%1n')6G", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue();
      boolean boolean0 = jmsQueue0.equals((Object) "");
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("/\"_ah)P%1n')6G");
      boolean boolean0 = jmsQueue0.equals((Object) jmsQueue0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue();
      JmsQueue jmsQueue1 = new JmsQueue("temptopic:");
      boolean boolean0 = jmsQueue0.equals((Object) jmsQueue1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("R,L=h)\"}");
      Reference reference0 = jmsQueue0.getReference();
      assertEquals("Reference Class Name: org.exolab.jms.client.JmsQueue\nType: name\nContent: R,L=h)\"}\nType: persistent\nContent: false\n", reference0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("R,L=h)\"}");
      jmsQueue0.setPersistent(true);
      Reference reference0 = jmsQueue0.getReference();
      assertNotNull(reference0);
      assertEquals("Reference Class Name: org.exolab.jms.client.JmsQueue\nType: name\nContent: R,L=h)\"}\nType: persistent\nContent: true\n", reference0.toString());
  }
}