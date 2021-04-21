/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Enumeration;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageEOFException;
import javax.jms.MessageNotReadableException;
import javax.jms.MessageNotWriteableException;
import org.exolab.jms.message.BytesMessageImpl;
import org.exolab.jms.message.DestinationImpl;
import org.exolab.jms.message.MapMessageImpl;
import org.exolab.jms.message.MessageImpl;
import org.exolab.jms.message.MessageSessionIfc;
import org.exolab.jms.message.ObjectMessageImpl;
import org.exolab.jms.message.TextMessageImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestMessageImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      textMessageImpl0.propertyExists("");
      assertEquals(false, textMessageImpl0.getProcessed());
  }

  @Test
  public void test1()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.setJMSCorrelationID("`WS-,bTtp9)G]6A(k");
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test2()  throws Throwable  {
      ObjectMessageImpl objectMessageImpl0 = new ObjectMessageImpl();
      assertNotNull(objectMessageImpl0);
      
      objectMessageImpl0.getConsumerId();
      assertEquals(false, objectMessageImpl0.getProcessed());
  }

  @Test
  public void test3()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.setJMSRedelivered(true);
      assertEquals(true, mapMessageImpl0.getJMSRedelivered());
  }

  @Test
  public void test4()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      // Undeclared exception!
      try {
        textMessageImpl0.getFloatProperty("g");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      try {
        bytesMessageImpl0.getJMSTimestamp();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * No Timestamp set
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      try {
        mapMessageImpl0.setJMSDestination((Destination) null);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Unknown Destination Type
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ObjectMessageImpl objectMessageImpl0 = new ObjectMessageImpl();
      assertNotNull(objectMessageImpl0);
      
      try {
        objectMessageImpl0.setStringProperty((String) null, "JMSXGroupSeq must ha5e a v)lue > 0");
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * <null> is not a valid property name
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.setJMSExpiration((long) 8);
      assertEquals(8L, messageImpl0.getJMSExpiration());
  }

  @Test
  public void test9()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      long long0 = mapMessageImpl0.getAcceptedTime();
      assertEquals(0L, long0);
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test10()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      byte[] byteArray0 = new byte[13];
      // Undeclared exception!
      try {
        mapMessageImpl0.setJMSCorrelationIDAsBytes(byteArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * Provider native correlation identifier not supported
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.setLongProperty("T", 0L);
      assertEquals(false, messageImpl0.getProcessed());
  }

  @Test
  public void test12()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      // Undeclared exception!
      try {
        mapMessageImpl0.getByteProperty("`WS-,bTtp9)G]6A(k");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      bytesMessageImpl0.setJMSPriority(0);
      assertEquals(0, bytesMessageImpl0.getJMSPriority());
      assertEquals(false, bytesMessageImpl0.getProcessed());
  }

  @Test
  public void test14()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertEquals(false, mapMessageImpl0.getProcessed());
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.setProcessed(true);
      assertEquals(true, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test15()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.getJMSCorrelationIDAsBytes();
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test16()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.setJMSTimestamp(0L);
      assertEquals(0L, mapMessageImpl0.getJMSTimestamp());
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test17()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.setSequenceNumber((long) 0);
      assertEquals(false, mapMessageImpl0.getProcessed());
      assertEquals(0L, mapMessageImpl0.getSequenceNumber());
  }

  @Test
  public void test18()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      textMessageImpl0.setConsumerId((-53L));
      assertEquals((-53L), textMessageImpl0.getConsumerId());
  }

  @Test
  public void test19()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      long long0 = mapMessageImpl0.getConnectionId();
      assertEquals(0L, long0);
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test20()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.getJMSReplyTo();
      assertEquals(false, messageImpl0.getProcessed());
  }

  @Test
  public void test21()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.getJMSPriority();
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test22()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.getMessageId();
      assertEquals(false, messageImpl0.getProcessed());
  }

  @Test
  public void test23()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      // Undeclared exception!
      try {
        bytesMessageImpl0.getIntProperty((String) null);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test24()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      long long0 = textMessageImpl0.getSequenceNumber();
      assertEquals(0L, long0);
      assertEquals(false, textMessageImpl0.getProcessed());
  }

  @Test
  public void test25()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      boolean boolean0 = messageImpl0.getProcessed();
      assertEquals(false, boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      bytesMessageImpl0.getJMSCorrelationID();
      assertEquals(false, bytesMessageImpl0.getProcessed());
  }

  @Test
  public void test27()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      textMessageImpl0.clearProperties();
      assertEquals(false, textMessageImpl0.getProcessed());
  }

  @Test
  public void test28()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      // Undeclared exception!
      try {
        textMessageImpl0.getLongProperty("Y)fL2IEAb3uqG$`.Q");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      Enumeration<Object> enumeration0 = textMessageImpl0.getPropertyNames();
      assertEquals(false, textMessageImpl0.getProcessed());
      assertNotNull(enumeration0);
  }

  @Test
  public void test30()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      // Undeclared exception!
      try {
        messageImpl0.getDoubleProperty("T");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test31()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      // Undeclared exception!
      try {
        mapMessageImpl0.getShortProperty("[XuMWJG9;<ff.wQeU");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test32()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.setFloatProperty("int", (float) 0L);
      assertEquals(false, messageImpl0.getProcessed());
  }

  @Test
  public void test33()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.getWildcard();
      assertEquals(false, messageImpl0.getProcessed());
  }

  @Test
  public void test34()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      textMessageImpl0.getBooleanProperty("");
      assertEquals(false, textMessageImpl0.getProcessed());
  }

  @Test
  public void test35()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      textMessageImpl0.setShortProperty("TextMessage", (short)348);
      assertEquals(false, textMessageImpl0.getProcessed());
  }

  @Test
  public void test36()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      String string0 = mapMessageImpl0.getJMSType();
      assertNotNull(string0);
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test37()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      try {
        messageImpl0.getJMSDeliveryMode();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * No Delivery Mode set
         */
      }
  }

  @Test
  public void test38()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.setJMSMessageID((String) null);
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test39()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.setWildcard("`WS-,bTtp9)G]6A(k");
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test40()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.setJMSXRcvTimestamp(0L);
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test41()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      // Undeclared exception!
      try {
        textMessageImpl0.getId();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test42()  throws Throwable  {
      ObjectMessageImpl objectMessageImpl0 = new ObjectMessageImpl();
      assertNotNull(objectMessageImpl0);
      
      objectMessageImpl0.getJMSExpiration();
      assertEquals(false, objectMessageImpl0.getProcessed());
  }

  @Test
  public void test43()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      bytesMessageImpl0.setAcceptedTime(0L);
      assertEquals(0L, bytesMessageImpl0.getAcceptedTime());
      assertEquals(false, bytesMessageImpl0.getProcessed());
  }

  @Test
  public void test44()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      String string0 = "!T>(\\9V+l\"26Xko;lJ";
      boolean boolean0 = true;
      try {
        bytesMessageImpl0.setBooleanProperty(string0, boolean0);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * name=!T>(\\9V+l\"26Xko;lJ is not a valid property name
         */
      }
  }

  @Test
  public void test45()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.setIntProperty("int", 8);
      assertEquals(false, messageImpl0.getProcessed());
  }

  @Test
  public void test46()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      try {
        bytesMessageImpl0.acknowledge();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Cannot acknowledge message: no identifier
         */
      }
  }

  @Test
  public void test47()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      textMessageImpl0.getJMSRedelivered();
      assertEquals(false, textMessageImpl0.getProcessed());
  }

  @Test
  public void test48()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.setDoubleProperty("int", (-541.3679429065934));
      assertEquals(false, messageImpl0.getProcessed());
  }

  @Test
  public void test49()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.setJMSDeliveryMode(1);
      assertEquals(false, mapMessageImpl0.getProcessed());
      assertEquals(1, mapMessageImpl0.getJMSDeliveryMode());
  }

  @Test
  public void test50()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      textMessageImpl0.getObjectProperty("[XuMWJG9;<ff.wQeU");
      assertEquals(false, textMessageImpl0.getProcessed());
  }

  @Test
  public void test51()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      assertNotNull(textMessageImpl0);
      
      try {
        textMessageImpl0.setObjectProperty("'0|Rg`", (Object) null);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * name='0|Rg` is not a valid property name
         */
      }
  }

  @Test
  public void test52()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      MapMessageImpl mapMessageImpl1 = (MapMessageImpl)mapMessageImpl0.clone();
      assertEquals(false, mapMessageImpl1.getProcessed());
      assertNotNull(mapMessageImpl1);
      assertNotSame(mapMessageImpl1, mapMessageImpl0);
  }

  @Test
  public void test53()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.clearBody();
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test54()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      DestinationImpl destinationImpl0 = new DestinationImpl("%xiqr'6#DAq{wR~X");
      messageImpl0.setJMSReplyTo((Destination) destinationImpl0);
      assertEquals(false, messageImpl0.getProcessed());
  }

  @Test
  public void test55()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.getStringProperty("%xiqr'6#DAq{wR~X");
      assertEquals(false, messageImpl0.getProcessed());
  }

  @Test
  public void test56()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      bytesMessageImpl0.setConnectionId(1774L);
      assertEquals(1774L, bytesMessageImpl0.getConnectionId());
  }

  @Test
  public void test57()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      try {
        messageImpl0.setByteProperty("", (byte) (-47));
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * zero-length name is not a valid property name
         */
      }
  }

  @Test
  public void test58()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      bytesMessageImpl0.getJMSMessageID();
      assertEquals(false, bytesMessageImpl0.getProcessed());
  }

  @Test
  public void test59()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      bytesMessageImpl0.setReadOnly(true);
      try {
        bytesMessageImpl0.readDouble();
        fail("Expecting exception: MessageEOFException");
      } catch(MessageEOFException e) {
      }
  }

  @Test
  public void test60()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      bytesMessageImpl0.getJMSDestination();
      assertEquals(false, bytesMessageImpl0.getProcessed());
  }

  @Test
  public void test61()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      PipedInputStream pipedInputStream0 = new PipedInputStream(412);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) pipedOutputStream0);
      messageImpl0.writeExternal((ObjectOutput) objectOutputStream0);
  }

  @Test
  public void test62()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      assertNotNull(bytesMessageImpl0);
      
      bytesMessageImpl0.setSession((MessageSessionIfc) null);
      assertEquals(false, bytesMessageImpl0.getProcessed());
  }

  @Test
  public void test63()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      messageImpl0.setReadOnly(true);
      try {
        messageImpl0.setByteProperty("", (byte) (-47));
        fail("Expecting exception: MessageNotWriteableException");
      } catch(MessageNotWriteableException e) {
        /*
         * Message in read-only mode
         */
      }
  }

  @Test
  public void test64()  throws Throwable  {
      MapMessageImpl mapMessageImpl0 = new MapMessageImpl();
      assertNotNull(mapMessageImpl0);
      
      mapMessageImpl0.checkWrite();
      assertEquals(false, mapMessageImpl0.getProcessed());
  }

  @Test
  public void test65()  throws Throwable  {
      ObjectMessageImpl objectMessageImpl0 = new ObjectMessageImpl();
      assertNotNull(objectMessageImpl0);
      
      try {
        objectMessageImpl0.checkRead();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test66()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      boolean boolean0 = messageImpl0.getReadOnly();
      assertEquals(false, messageImpl0.getProcessed());
      assertEquals(false, boolean0);
  }
}