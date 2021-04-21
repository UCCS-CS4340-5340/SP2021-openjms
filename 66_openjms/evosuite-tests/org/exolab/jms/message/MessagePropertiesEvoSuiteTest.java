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
import java.util.Enumeration;
import javax.jms.JMSException;
import javax.jms.MessageFormatException;
import org.exolab.jms.message.MessageProperties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MessagePropertiesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      try {
        messageProperties0.setByteProperty("JMSXJMSXJMSXRcvTimestamp", (byte) (-14));
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Property=JMSXJMSXJMSXRcvTimestamp cannot be set by clients
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      // Undeclared exception!
      try {
        messageProperties0.getIntProperty("");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      try {
        messageProperties0.setFloatProperty("q`8kV]X", (-1193.6422F));
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * name=q`8kV]X is not a valid property name
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      messageProperties0.setJMSXRcvTimestamp(1L);
  }

  @Test
  public void test4()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      messageProperties0.setShortProperty("nTe3no6", (short)1866);
  }

  @Test
  public void test5()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      // Undeclared exception!
      try {
        messageProperties0.getShortProperty("1");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      try {
        messageProperties0.setDoubleProperty("%kDt,(D(,h46.rW", 1111.5994009696976);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * name=%kDt,(D(,h46.rW is not a valid property name
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      assertNotNull(messageProperties0);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      messageProperties0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(92, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001sr\u0000\u0011java.util.HashMap\u0005\u0007\uFFFD\uFFFD\uFFFD\u0016`\uFFFD\u0003\u0000\u0002F\u0000\nloadFactorI\u0000\tthresholdxp?@\u0000\u0000\u0000\u0000\u0000\u0018w\b\u0000\u0000\u0000 \u0000\u0000\u0000\u0000x", byteArrayOutputStream0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      // Undeclared exception!
      try {
        messageProperties0.getFloatProperty("m");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      try {
        messageProperties0.setLongProperty((String) null, (long) 0);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * <null> is not a valid property name
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      // Undeclared exception!
      try {
        messageProperties0.getByteProperty("W~v;U-G\"%*3uUOk@(]f");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      try {
        messageProperties0.setIntProperty("JMSXGroupSeq", (-1364));
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * JMSXGroupSeq must have a value > 0
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      Enumeration<Object> enumeration0 = messageProperties0.getPropertyNames();
      assertEquals(false, enumeration0.hasMoreElements());
  }

  @Test
  public void test13()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      // Undeclared exception!
      try {
        messageProperties0.getLongProperty("nTe3no6");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      messageProperties0.setStringProperty("JMSXGroupID", "JMSXGroupID");
  }

  @Test
  public void test15()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      Object object0 = messageProperties0.getObjectProperty("JMSXGroupSeq");
      assertNull(object0);
  }

  @Test
  public void test16()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      // Undeclared exception!
      try {
        messageProperties0.getDoubleProperty("JMSXGroupSeq");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      try {
        messageProperties0.setBooleanProperty(".k=2?{wq", false);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * name=.k=2?{wq is not a valid property name
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      boolean boolean0 = messageProperties0.propertyExists("q`8kV]X");
      assertEquals(false, boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      messageProperties0.clearProperties();
  }

  @Test
  public void test20()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      boolean boolean0 = messageProperties0.getBooleanProperty("oVY9bCrp");
      assertEquals(false, boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      assertNotNull(messageProperties0);
      
      MessageProperties messageProperties1 = (MessageProperties)messageProperties0.clone();
      assertNotNull(messageProperties1);
      assertNotSame(messageProperties0, messageProperties1);
  }

  @Test
  public void test22()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      String string0 = messageProperties0.getStringProperty("JMSXGroupSeq");
      assertNull(string0);
  }

  @Test
  public void test23()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      Boolean boolean0 = Boolean.FALSE;
      try {
        messageProperties0.setObjectProperty("", (Object) boolean0);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * zero-length name is not a valid property name
         */
      }
  }

  @Test
  public void test24()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      messageProperties0.setObjectProperty("z", "1");
  }

  @Test
  public void test25()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      Short short0 = new Short((short) (-216));
      try {
        messageProperties0.setObjectProperty((String) null, (Object) short0);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * <null> is not a valid property name
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      Integer integer0 = new Integer((-1166));
      try {
        messageProperties0.setObjectProperty("1D-z9)4o~*hIb&pP", (Object) integer0);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * name=1D-z9)4o~*hIb&pP is not a valid property name
         */
      }
  }

  @Test
  public void test27()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      Double double0 = new Double(589.7485852972208);
      messageProperties0.setObjectProperty("vvFzy", (Object) double0);
      assertEquals(589.7486F, double0.floatValue(), 0.01F);
  }

  @Test
  public void test28()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      Class<Integer> class0 = Integer.TYPE;
      try {
        messageProperties0.setObjectProperty("JMSXJMSXJSXGroupSe", (Object) class0);
        fail("Expecting exception: MessageFormatException");
      } catch(MessageFormatException e) {
        /*
         * Message.setObjectProperty() does not support objects of type=java.lang.Class
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      try {
        messageProperties0.setObjectProperty("and", (Object) null);
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * name=and is a reserved word; it cannot be used as a property name
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      try {
        messageProperties0.setObjectProperty("JMSXGroupID", (Object) null);
        fail("Expecting exception: MessageFormatException");
      } catch(MessageFormatException e) {
        /*
         * Property=JMSXGroupID may not be null
         */
      }
  }

  @Test
  public void test31()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      try {
        messageProperties0.setByteProperty("JMSXGroupID", (byte)0);
        fail("Expecting exception: MessageFormatException");
      } catch(MessageFormatException e) {
        /*
         * Expected type=java.lang.String for property=JMSXGroupID, but got type=java.lang.Byte
         */
      }
  }

  @Test
  public void test32()  throws Throwable  {
      MessageProperties messageProperties0 = new MessageProperties();
      messageProperties0.setIntProperty("JMSXGroupSeq", 1887);
  }
}