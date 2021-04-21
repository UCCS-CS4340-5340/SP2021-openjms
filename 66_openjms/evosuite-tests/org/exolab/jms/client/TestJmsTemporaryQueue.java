/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import javax.jms.JMSException;
import javax.naming.Reference;
import org.exolab.jms.client.JmsConnection;
import org.exolab.jms.client.JmsTemporaryQueue;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJmsTemporaryQueue {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      long long0 = jmsTemporaryQueue0.getConnectionId();
      assertEquals(0L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) pipedOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) bufferedOutputStream0);
      // Undeclared exception!
      try {
        jmsTemporaryQueue0.writeExternal((ObjectOutput) objectOutputStream0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      // Undeclared exception!
      try {
        jmsTemporaryQueue0.delete();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      Reference reference0 = jmsTemporaryQueue0.getReference();
      assertNull(reference0);
  }

  @Test
  public void test4()  throws Throwable  {
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      boolean boolean0 = jmsTemporaryQueue0.validForConnection((JmsConnection) null);
      assertEquals(false, boolean0);
  }
}