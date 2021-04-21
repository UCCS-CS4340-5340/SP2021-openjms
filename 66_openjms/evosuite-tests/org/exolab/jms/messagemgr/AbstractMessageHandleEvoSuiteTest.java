/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.messagemgr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.IllegalStateException;
import javax.jms.JMSException;
import org.exolab.jms.client.JmsDestination;
import org.exolab.jms.client.JmsQueue;
import org.exolab.jms.client.JmsTemporaryQueue;
import org.exolab.jms.client.JmsTemporaryTopic;
import org.exolab.jms.client.JmsTopic;
import org.exolab.jms.message.MessageImpl;
import org.exolab.jms.message.StreamMessageImpl;
import org.exolab.jms.messagemgr.DestinationCache;
import org.exolab.jms.messagemgr.MessageHandle;
import org.exolab.jms.messagemgr.MessageRef;
import org.exolab.jms.messagemgr.PersistentMessageHandle;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractMessageHandleEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("*]&Yw#Y<%");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("*]&Yw#Y<%", 3, (-755L), (-755L), (-755L), (JmsDestination) jmsQueue0, "*]&Yw#Y<%");
      assertNotNull(persistentMessageHandle0);
      
      String string0 = persistentMessageHandle0.toString();
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals("MessageHandle : 3:-755:-755:*]&Yw#Y<%", string0);
      assertNotNull(string0);
      assertEquals(true, persistentMessageHandle0.hasExpired());
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
  }

  @Test
  public void test1()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("s", 6, (long) 6, (long) 6, (long) 6, (JmsDestination) jmsTopic0, "s");
      assertNotNull(persistentMessageHandle0);
      
      persistentMessageHandle0.setDelivered(false);
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals(6L, persistentMessageHandle0.getExpiryTime());
      assertEquals("MessageHandle : 6:6:6:s", persistentMessageHandle0.toString());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals(false, persistentMessageHandle0.getDelivered());
  }

  @Test
  public void test2()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("*]&Yw#Y<%");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("*]&Yw#Y<%", 4, (long) 4, (long) 4, (long) 4, (JmsDestination) jmsQueue0, "*]&Yw#Y<%");
      assertNotNull(persistentMessageHandle0);
      
      int int0 = persistentMessageHandle0.hashCode();
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals((-2001614448), int0);
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals("MessageHandle : 4:4:4:*]&Yw#Y<%", persistentMessageHandle0.toString());
      assertEquals(4L, persistentMessageHandle0.getExpiryTime());
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
  }

  @Test
  public void test3()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("MTKAO");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("MTKAO", 572, (long) 572, (long) 572, (long) 572, (JmsDestination) jmsQueue0, "MTKAO");
      assertNotNull(persistentMessageHandle0);
      
      persistentMessageHandle0.setMessageRef((MessageRef) null);
      assertEquals("MessageHandle : 572:572:572:MTKAO", persistentMessageHandle0.toString());
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals(false, persistentMessageHandle0.hasExpired());
  }

  @Test
  public void test4()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("s", 6, (long) 6, (long) 6, (long) 6, (JmsDestination) jmsTopic0, "s");
      assertNotNull(persistentMessageHandle0);
      
      long long0 = persistentMessageHandle0.getExpiryTime();
      assertEquals(6L, long0);
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals("MessageHandle : 6:6:6:s", persistentMessageHandle0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("s", 6, (long) 6, (long) 6, (long) 6, (JmsDestination) jmsTopic0, "s");
      assertNotNull(persistentMessageHandle0);
      
      boolean boolean0 = persistentMessageHandle0.getDelivered();
      assertEquals(false, boolean0);
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals("MessageHandle : 6:6:6:s", persistentMessageHandle0.toString());
      assertEquals(false, persistentMessageHandle0.hasExpired());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
  }

  @Test
  public void test6()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("", 0, (long) 0, (long) 0, (long) 0, (JmsDestination) jmsTopic0, "");
      assertNotNull(persistentMessageHandle0);
      
      String string0 = persistentMessageHandle0.getMessageId();
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertNotNull(string0);
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals(0, persistentMessageHandle0.getPriority());
  }

  @Test
  public void test7()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("", 0, (long) 0, (long) 0, (long) 0, (JmsDestination) jmsTopic0, "");
      assertNotNull(persistentMessageHandle0);
      
      long long0 = persistentMessageHandle0.getConnectionId();
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals(0, persistentMessageHandle0.getPriority());
      assertEquals((-1L), long0);
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
  }

  @Test
  public void test8()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("s", 6, (long) 6, (long) 6, (long) 6, (JmsDestination) jmsTopic0, "s");
      assertNotNull(persistentMessageHandle0);
      
      int int0 = persistentMessageHandle0.getPriority();
      assertEquals(6, int0);
      assertEquals("MessageHandle : 6:6:6:s", persistentMessageHandle0.toString());
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals(false, persistentMessageHandle0.hasExpired());
  }

  @Test
  public void test9()  throws Throwable  {
      JmsTemporaryQueue jmsTemporaryQueue0 = new JmsTemporaryQueue();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("{", (-1649), (long) (-1649), (long) (-1649), (long) (-1649), (JmsDestination) jmsTemporaryQueue0, "{");
      assertNotNull(persistentMessageHandle0);
      
      persistentMessageHandle0.setDestinationCache((DestinationCache) null);
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals("MessageHandle : -1649:-1649:-1649:{", persistentMessageHandle0.toString());
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals((-1649L), persistentMessageHandle0.getExpiryTime());
  }

  @Test
  public void test10()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("", 0, (long) 0, (long) 0, (long) 0, (JmsDestination) jmsTopic0, "");
      assertNotNull(persistentMessageHandle0);
      
      persistentMessageHandle0.getMessageRef();
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals("MessageHandle : 0:0:0:", persistentMessageHandle0.toString());
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
  }

  @Test
  public void test11()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic("lBx");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("lBx", 14, (long) 14, (long) 14, 663L, (JmsDestination) jmsTopic0, "lBx");
      assertNotNull(persistentMessageHandle0);
      
      long long0 = persistentMessageHandle0.getConsumerId();
      assertEquals((-1L), long0);
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals(663L, persistentMessageHandle0.getExpiryTime());
      assertEquals("MessageHandle : 14:14:14:lBx", persistentMessageHandle0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic("lBx");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("lBx", 14, (long) 14, (long) 14, 663L, (JmsDestination) jmsTopic0, "lBx");
      assertNotNull(persistentMessageHandle0);
      
      JmsTopic jmsTopic1 = (JmsTopic)persistentMessageHandle0.getDestination();
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals("MessageHandle : 14:14:14:lBx", persistentMessageHandle0.toString());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertNotNull(jmsTopic1);
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals(663L, persistentMessageHandle0.getExpiryTime());
  }

  @Test
  public void test13()  throws Throwable  {
      StreamMessageImpl streamMessageImpl0 = new StreamMessageImpl();
      PersistentMessageHandle persistentMessageHandle0 = null;
      try {
        persistentMessageHandle0 = new PersistentMessageHandle((MessageImpl) streamMessageImpl0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'messageId' is null
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      PersistentMessageHandle persistentMessageHandle0 = null;
      try {
        persistentMessageHandle0 = new PersistentMessageHandle("MTKAO", 572, (long) 572, (long) 572, (long) 572, (JmsDestination) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'destination' is null
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("\tDclandleQr");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("\tDclandleQr", 789, (long) 789, (long) 789, (long) 789, (JmsDestination) jmsQueue0);
      assertNotNull(persistentMessageHandle0);
      
      try {
        persistentMessageHandle0.getMessage();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Cannot get message with identifier=\tDclandleQr: MessageRef null
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("", 0, (long) 0, (long) 0, (long) 0, (JmsDestination) jmsTopic0, "");
      assertNotNull(persistentMessageHandle0);
      
      boolean boolean0 = persistentMessageHandle0.hasExpired();
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals(false, boolean0);
      assertEquals(0, persistentMessageHandle0.getPriority());
  }

  @Test
  public void test17()  throws Throwable  {
      JmsTemporaryTopic jmsTemporaryTopic0 = new JmsTemporaryTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("'u4&#QnlN*M}w0@t", 64286, (long) 64286, (long) 64286, (-331L), (JmsDestination) jmsTemporaryTopic0);
      assertNotNull(persistentMessageHandle0);
      
      boolean boolean0 = persistentMessageHandle0.hasExpired();
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals(true, boolean0);
      assertEquals("MessageHandle : 64286:64286:64286:'u4&#QnlN*M}w0@t", persistentMessageHandle0.toString());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
  }

  @Test
  public void test18()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("s", 6, (long) 6, (long) 6, (long) 6, (JmsDestination) jmsTopic0, "s");
      assertNotNull(persistentMessageHandle0);
      
      boolean boolean0 = persistentMessageHandle0.hasExpired();
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals("MessageHandle : 6:6:6:s", persistentMessageHandle0.toString());
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals(false, boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic("M");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("M", (-3), 136L, 136L, 136L, (JmsDestination) jmsTopic0);
      assertNotNull(persistentMessageHandle0);
      
      boolean boolean0 = persistentMessageHandle0.equals((Object) "");
      assertEquals(false, persistentMessageHandle0.getDelivered());
      assertEquals(false, boolean0);
      assertEquals((-1L), persistentMessageHandle0.getConnectionId());
      assertEquals(136L, persistentMessageHandle0.getExpiryTime());
      assertEquals((-1L), persistentMessageHandle0.getConsumerId());
      assertEquals("MessageHandle : -3:136:136:M", persistentMessageHandle0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      JmsTemporaryTopic jmsTemporaryTopic0 = new JmsTemporaryTopic();
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("(java.lang.String", (-13), 17L, 17L, 17L, (JmsDestination) jmsTemporaryTopic0);
      assertNotNull(persistentMessageHandle0);
      
      try {
        persistentMessageHandle0.release();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Can't release message: not associated with any cache
         */
      }
  }

  @Test
  public void test21()  throws Throwable  {
      JmsQueue jmsQueue0 = new JmsQueue("*]&Yw#Y<%");
      PersistentMessageHandle persistentMessageHandle0 = new PersistentMessageHandle("*]&Yw#Y<%", 3, (-755L), (-755L), (-755L), (JmsDestination) jmsQueue0, "*]&Yw#Y<%");
      assertNotNull(persistentMessageHandle0);
      
      try {
        persistentMessageHandle0.release((MessageHandle) persistentMessageHandle0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Can't release message: not associated with any cache
         */
      }
  }
}