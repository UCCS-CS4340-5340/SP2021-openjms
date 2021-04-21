/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.JMSException;
import org.exolab.jms.client.JmsDestination;
import org.exolab.jms.client.JmsTemporaryTopic;
import org.exolab.jms.client.JmsTopic;
import org.exolab.jms.messagemgr.MessageHandle;
import org.exolab.jms.messagemgr.PersistentMessageHandle;
import org.exolab.jms.server.SentMessageCache;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSentMessageCache {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SentMessageCache sentMessageCache0 = new SentMessageCache((-27));
      JmsTemporaryTopic jmsTemporaryTopic0 = new JmsTemporaryTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle(",Of", (-27), (long) (-27), (long) (-27), (long) (-27), (JmsDestination) jmsTemporaryTopic0, ",Of");
      try {
        sentMessageCache0.preSend((MessageHandle) persistentMessageHandle0);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Failed to update persistent handle: No DatabaseService registered
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SentMessageCache sentMessageCache0 = new SentMessageCache(1);
      JmsTopic jmsTopic0 = new JmsTopic("~0t'W{`8O");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("~0t'W{`8O", 2, (long) 2, (long) 1, (long) 1, (JmsDestination) jmsTopic0);
      try {
        sentMessageCache0.postSend((MessageHandle) persistentMessageHandle0);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Failed to destroy persistent handle: No DatabaseService registered
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SentMessageCache sentMessageCache0 = new SentMessageCache(2);
      JmsTopic jmsTopic0 = new JmsTopic("~0t'W{`8O");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("~0t'W{`8O", 2, (long) 2, (long) 1, (long) 1, (JmsDestination) jmsTopic0);
      sentMessageCache0.postSend((MessageHandle) persistentMessageHandle0);
      assertEquals(1L, persistentMessageHandle0.getExpiryTime());
  }

  @Test
  public void test3()  throws Throwable  {
      SentMessageCache sentMessageCache0 = new SentMessageCache((-27));
      sentMessageCache0.acknowledge(",Of", (long) (-27));
  }

  @Test
  public void test4()  throws Throwable  {
      SentMessageCache sentMessageCache0 = new SentMessageCache(1);
      sentMessageCache0.acknowledgeAll();
  }

  @Test
  public void test5()  throws Throwable  {
      SentMessageCache sentMessageCache0 = new SentMessageCache(1102);
      sentMessageCache0.clear();
  }
}
