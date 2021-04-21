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
import javax.jms.MessageEOFException;
import javax.jms.MessageFormatException;
import javax.jms.MessageNotReadableException;
import org.exolab.jms.message.BytesMessageImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestBytesMessageImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.readShort();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      byte[] byteArray0 = new byte[8];
      bytesMessageImpl0.writeBytes(byteArray0);
      bytesMessageImpl0.reset();
      bytesMessageImpl0.readUnsignedShort();
      bytesMessageImpl0.clone();
  }

  @Test
  public void test2()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      byte[] byteArray0 = new byte[2];
      bytesMessageImpl0.writeBytes(byteArray0, (int) (byte)0, (int) (byte)1);
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test3()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.readByte();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.writeInt((-1989));
      BytesMessageImpl bytesMessageImpl1 = (BytesMessageImpl)bytesMessageImpl0.clone();
      assertNotNull(bytesMessageImpl1);
      assertEquals("BytesMessage", bytesMessageImpl1.getJMSType());
  }

  @Test
  public void test5()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.writeShort((short)142);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((int) (short)142);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      bytesMessageImpl0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(371, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u001A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000sr\u0000$org.exolab.jms.message.MessageHeader\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001pppw\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000psr\u0000\u001Borg.exolab.jms.message.Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw$\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\f\u0000B\u0000y\u0000t\u0000e\u0000s\u0000M\u0000e\u0000s\u0000s\u0000a\u0000g\u0000expppppw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xsr\u0000(org.exolab.jms.message.MessageProperties\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001sr\u0000\u0011java.util.HashMap\u0005\u0007\uFFFD\uFFFD\uFFFD\u0016`\uFFFD\u0003\u0000\u0002F\u0000\nloadFactorI\u0000\tthresholdxp?@\u0000\u0000\u0000\u0000\u0000\u0018w\b\u0000\u0000\u0000 \u0000\u0000\u0000\u0000xxw\u000E\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.readChar();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.readDouble();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.writeChar('b');
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test9()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.writeByte((byte)70);
      bytesMessageImpl0.writeBoolean(false);
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test10()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.writeFloat((float) 2L);
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test11()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.readInt();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.readFloat();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.writeObject((Object) "37777776471");
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test14()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.writeDouble((double) (short)142);
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test15()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.readBoolean();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.readUnsignedByte();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.getBodyLength();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.writeObject((Object) (-1110L));
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test19()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      Boolean boolean0 = Boolean.valueOf(false);
      bytesMessageImpl0.writeObject((Object) boolean0);
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test20()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      try {
        bytesMessageImpl0.readLong();
        fail("Expecting exception: MessageNotReadableException");
      } catch(MessageNotReadableException e) {
        /*
         * Message in write-only mode
         */
      }
  }

  @Test
  public void test21()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.reset();
      BytesMessageImpl bytesMessageImpl1 = (BytesMessageImpl)bytesMessageImpl0.clone();
      assertNotNull(bytesMessageImpl1);
      assertEquals("BytesMessage", bytesMessageImpl1.getJMSType());
  }

  @Test
  public void test22()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.reset();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      bytesMessageImpl0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(369, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u001A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000sr\u0000$org.exolab.jms.message.MessageHeader\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001pppw\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000psr\u0000\u001Borg.exolab.jms.message.Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw$\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\f\u0000B\u0000y\u0000t\u0000e\u0000s\u0000M\u0000e\u0000s\u0000s\u0000a\u0000g\u0000expppppw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xsr\u0000(org.exolab.jms.message.MessageProperties\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001sr\u0000\u0011java.util.HashMap\u0005\u0007\uFFFD\uFFFD\uFFFD\u0016`\uFFFD\u0003\u0000\u0002F\u0000\nloadFactorI\u0000\tthresholdxp?@\u0000\u0000\u0000\u0000\u0000\u0018w\b\u0000\u0000\u0000 \u0000\u0000\u0000\u0000xxw\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test
  public void test23()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((int) (short)142);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      bytesMessageImpl0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u001A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000sr\u0000$org.exolab.jms.message.MessageHeader\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001pppw\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000psr\u0000\u001Borg.exolab.jms.message.Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw$\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\f\u0000B\u0000y\u0000t\u0000e\u0000s\u0000M\u0000e\u0000s\u0000s\u0000a\u0000g\u0000expppppw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xsr\u0000(org.exolab.jms.message.MessageProperties\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001sr\u0000\u0011java.util.HashMap\u0005\u0007\uFFFD\uFFFD\uFFFD\u0016`\uFFFD\u0003\u0000\u0002F\u0000\nloadFactorI\u0000\tthresholdxp?@\u0000\u0000\u0000\u0000\u0000\u0018w\b\u0000\u0000\u0000 \u0000\u0000\u0000\u0000xxw\f\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(369, byteArrayOutputStream0.size());
  }

  @Test
  public void test24()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.reset();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try {
        bytesMessageImpl0.readBytes(byteArray0, (-1249));
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Length must be > 0 and less than array size
         */
      }
  }

  @Test
  public void test25()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      byte[] byteArray0 = new byte[8];
      bytesMessageImpl0.writeBytes(byteArray0);
      bytesMessageImpl0.reset();
      int int0 = bytesMessageImpl0.readBytes(byteArray0, (int) (byte)0);
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
      assertEquals((-1), int0);
      assertEquals(8L, bytesMessageImpl0.getBodyLength());
  }

  @Test
  public void test26()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      byte[] byteArray0 = new byte[8];
      bytesMessageImpl0.writeBytes(byteArray0);
      bytesMessageImpl0.reset();
      bytesMessageImpl0.readUnsignedShort();
      bytesMessageImpl0.readBytes(byteArray0);
  }

  @Test
  public void test27()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      BytesMessageImpl bytesMessageImpl1 = (BytesMessageImpl)bytesMessageImpl0.clone();
      assertNotNull(bytesMessageImpl1);
      
      try {
        bytesMessageImpl0.writeObject((Object) bytesMessageImpl1);
        fail("Expecting exception: MessageFormatException");
      } catch(MessageFormatException e) {
        /*
         * Cannot write objects of type=org.exolab.jms.message.BytesMessageImpl
         */
      }
  }

  @Test
  public void test28()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      // Undeclared exception!
      try {
        bytesMessageImpl0.writeObject((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * BytesMessage does not support null
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.reset();
      bytesMessageImpl0.reset();
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test30()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.reset();
      byte[] byteArray0 = new byte[7];
      int int0 = bytesMessageImpl0.readBytes(byteArray0);
      assertEquals((-1), int0);
      
      bytesMessageImpl0.reset();
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test31()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.clearBody();
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test32()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.reset();
      bytesMessageImpl0.clearBody();
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test33()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      byte[] byteArray0 = new byte[8];
      bytesMessageImpl0.writeBytes(byteArray0);
      bytesMessageImpl0.reset();
      bytesMessageImpl0.readUnsignedShort();
      bytesMessageImpl0.clearBody();
  }

  @Test
  public void test34()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.writeShort((short)142);
      bytesMessageImpl0.clearBody();
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test35()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.setReadOnly(false);
      assertEquals(false, bytesMessageImpl0.getReadOnly());
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test36()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.setReadOnly(true);
      assertEquals(true, bytesMessageImpl0.getReadOnly());
      assertEquals("BytesMessage", bytesMessageImpl0.getJMSType());
  }

  @Test
  public void test37()  throws Throwable  {
      BytesMessageImpl bytesMessageImpl0 = new BytesMessageImpl();
      bytesMessageImpl0.reset();
      try {
        bytesMessageImpl0.readUTF();
        fail("Expecting exception: MessageEOFException");
      } catch(MessageEOFException e) {
      }
  }
}