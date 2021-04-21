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
import javax.jms.JMSException;
import javax.jms.MessageNotWriteableException;
import org.exolab.jms.message.TextMessageImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestTextMessageImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      textMessageImpl0.toString();
      assertEquals("TextMessage", textMessageImpl0.getJMSType());
  }

  @Test
  public void test1()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      textMessageImpl0.clearBody();
      assertEquals("TextMessage", textMessageImpl0.getJMSType());
  }

  @Test
  public void test2()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      textMessageImpl0.setText("r *b}1w&t3OED-4oM");
      assertEquals("TextMessage", textMessageImpl0.getJMSType());
  }

  @Test
  public void test3()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      TextMessageImpl textMessageImpl1 = (TextMessageImpl)textMessageImpl0.clone();
      assertEquals("TextMessage", textMessageImpl1.getJMSType());
  }

  @Test
  public void test4()  throws Throwable  {
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1088);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      textMessageImpl0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u001A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000sr\u0000$org.exolab.jms.message.MessageHeader\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001pppw\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000psr\u0000\u001Borg.exolab.jms.message.Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u000B\u0000T\u0000e\u0000x\u0000t\u0000M\u0000e\u0000s\u0000s\u0000a\u0000g\u0000expppppw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xsr\u0000(org.exolab.jms.message.MessageProperties\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001sr\u0000\u0011java.util.HashMap\u0005\u0007\uFFFD\uFFFD\uFFFD\u0016`\uFFFD\u0003\u0000\u0002F\u0000\nloadFactorI\u0000\tthresholdxp?@\u0000\u0000\u0000\u0000\u0000\u0018w\b\u0000\u0000\u0000 \u0000\u0000\u0000\u0000xxw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001p", byteArrayOutputStream0.toString());
      assertEquals(364, byteArrayOutputStream0.size());
  }
}
