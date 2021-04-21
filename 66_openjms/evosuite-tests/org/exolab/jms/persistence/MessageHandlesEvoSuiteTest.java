/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import org.apache.commons.dbcp.PoolingConnection;
import org.exolab.jms.client.JmsDestination;
import org.exolab.jms.client.JmsTemporaryQueue;
import org.exolab.jms.client.JmsTemporaryTopic;
import org.exolab.jms.client.JmsTopic;
import org.exolab.jms.messagemgr.MessageHandle;
import org.exolab.jms.messagemgr.PersistentMessageHandle;
import org.exolab.jms.persistence.Consumers;
import org.exolab.jms.persistence.Destinations;
import org.exolab.jms.persistence.MessageHandles;
import org.exolab.jms.persistence.PersistenceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MessageHandlesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MessageHandles messageHandles0 = new MessageHandles((Destinations) null, (Consumers) null);
      PoolingConnection poolingConnection0 = new PoolingConnection((Connection) null);
      // Undeclared exception!
      try {
        messageHandles0.removeMessageHandles((Connection) poolingConnection0, (long) 303);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MessageHandles messageHandles0 = new MessageHandles((Destinations) null, (Consumers) null);
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("4k#|-IB", 813, (long) 813, (long) 813, (long) 813, (JmsDestination) jmsTemporaryQueue0, "4k#|-IB");
      // Undeclared exception!
      try {
        messageHandles0.addMessageHandle((Connection) null, (MessageHandle) persistentMessageHandle0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MessageHandles messageHandles0 = new MessageHandles((Destinations) null, (Consumers) null);
      JmsTemporaryTopic jmsTemporaryTopic0 = new JmsTemporaryTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("SysschemasIndex2Identifier", (-1429), (long) (-1429), (long) (-1429), (long) (-1429), (JmsDestination) jmsTemporaryTopic0);
      // Undeclared exception!
      try {
        messageHandles0.removeMessageHandle((Connection) null, (MessageHandle) persistentMessageHandle0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      MessageHandles messageHandles0 = new MessageHandles((Destinations) null, (Consumers) null);
      JmsTopic jmsTopic0 = new JmsTopic("[mR7DH8}tqC!wCI");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("[mR7DH8}tqC!wCI", 0, (long) 0, (long) 0, (long) 0, (JmsDestination) jmsTopic0, "[mR7DH8}tqC!wCI");
      // Undeclared exception!
      try {
        messageHandles0.updateMessageHandle((Connection) null, (MessageHandle) persistentMessageHandle0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}