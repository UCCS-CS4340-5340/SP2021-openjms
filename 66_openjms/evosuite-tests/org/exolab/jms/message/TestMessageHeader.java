/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import javax.jms.Destination;
import javax.jms.JMSException;
import org.exolab.jms.client.JmsQueue;
import org.exolab.jms.message.MessageHeader;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestMessageHeader {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSRedelivered(false);
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test1()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSExpiration(12L);
      assertEquals(12L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test2()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      long long0 = messageHeader0.getJMSExpiration();
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, long0);
  }

  @Test
  public void test3()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(203);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      messageHeader0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(35, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001pppw\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ppppppp", byteArrayOutputStream0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      long long0 = messageHeader0.getConsumerId();
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(0L, long0);
  }

  @Test
  public void test5()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try {
        messageHeader0.setJMSCorrelationIDAsBytes(byteArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * Provider native correlation identifier not supported
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.getAckMessageID();
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test7()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setAckMessageID((String) null);
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test8()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.getWildcard();
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test9()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.getJMSReplyTo();
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test10()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setWildcard("DQ#dka0jGV");
      MessageHeader messageHeader1 = (MessageHeader)messageHeader0.clone();
      assertEquals(0L, messageHeader1.getConsumerId());
      assertNotSame(messageHeader0, messageHeader1);
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test11()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSTimestamp((-2007L));
      long long0 = messageHeader0.getJMSTimestamp();
      assertEquals((-2007L), long0);
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test12()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSDeliveryMode(1);
      int int0 = messageHeader0.getJMSDeliveryMode();
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(1, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.getJMSDestination();
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test14()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      boolean boolean0 = messageHeader0.getJMSRedelivered();
      assertEquals(false, boolean0);
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test15()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setConsumerId(129L);
      assertEquals(129L, messageHeader0.getConsumerId());
  }

  @Test
  public void test16()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSPriority(1);
      int int0 = messageHeader0.getJMSPriority();
      assertEquals(1, messageHeader0.getJMSPriority());
      assertEquals(1, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.getMessageId();
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test18()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      MessageHeader messageHeader1 = (MessageHeader)messageHeader0.clone();
      assertEquals(false, messageHeader1.getJMSRedelivered());
      assertEquals(0L, messageHeader1.getConsumerId());
      assertNotSame(messageHeader1, messageHeader0);
      assertEquals(0L, messageHeader1.getJMSExpiration());
  }

  @Test
  public void test19()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      try {
        messageHeader0.setJMSReplyTo((Destination) null);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Unknown Destination Type
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      JmsQueue jmsQueue0 = new JmsQueue();
      messageHeader0.setJMSReplyTo((Destination) jmsQueue0);
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test21()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      try {
        messageHeader0.setJMSDestination((Destination) null);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Unknown Destination Type
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      JmsQueue jmsQueue0 = new JmsQueue();
      messageHeader0.setJMSDestination((Destination) jmsQueue0);
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test23()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSMessageID((String) null);
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test24()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSMessageID("ID:");
      String string0 = messageHeader0.getJMSMessageID();
      assertNotNull(string0);
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test25()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      try {
        messageHeader0.setJMSMessageID("B^3=v'zQ|{s<oUD}");
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Invalid JMSMessageID: B^3=v'zQ|{s<oUD}
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.getJMSMessageID();
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test27()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      try {
        messageHeader0.getJMSTimestamp();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * No Timestamp set
         */
      }
  }

  @Test
  public void test28()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.getJMSCorrelationIDAsBytes();
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test29()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSCorrelationID("v2A~qiQ");
      // Undeclared exception!
      try {
        messageHeader0.getJMSCorrelationIDAsBytes();
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * Provider native correlation identifier not supported
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSCorrelationID((String) null);
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test31()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.getJMSCorrelationID();
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test32()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSCorrelationID("d");
      String string0 = messageHeader0.getJMSCorrelationID();
      assertNotNull(string0);
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test33()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      try {
        messageHeader0.getJMSDeliveryMode();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * No Delivery Mode set
         */
      }
  }

  @Test
  public void test34()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSType((String) null);
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test35()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.setJMSType("p2?SlKAod:I");
      String string0 = messageHeader0.getJMSType();
      assertNotNull(string0);
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(false, messageHeader0.getJMSRedelivered());
  }

  @Test
  public void test36()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      messageHeader0.getJMSType();
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
  }

  @Test
  public void test37()  throws Throwable  {
      MessageHeader messageHeader0 = new MessageHeader();
      int int0 = messageHeader0.getJMSPriority();
      assertEquals(false, messageHeader0.getJMSRedelivered());
      assertEquals(0L, messageHeader0.getJMSExpiration());
      assertEquals(0, int0);
  }
}