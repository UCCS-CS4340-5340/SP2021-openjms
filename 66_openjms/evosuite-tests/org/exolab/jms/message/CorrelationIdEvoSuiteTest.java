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
import java.io.PipedOutputStream;
import java.io.PrintStream;
import javax.jms.JMSException;
import org.exolab.jms.message.CorrelationId;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CorrelationIdEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CorrelationId correlationId0 = new CorrelationId();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      correlationId0.writeExternal((ObjectOutput) objectOutputStream0);
  }

  @Test
  public void test1()  throws Throwable  {
      CorrelationId correlationId0 = new CorrelationId("f-~!U3Q,qL");
      // Undeclared exception!
      try {
        correlationId0.getBytes();
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * Provider native correlation identifier not supported
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CorrelationId correlationId0 = null;
      try {
        correlationId0 = new CorrelationId(byteArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * Provider native correlation identifier not supported
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      CorrelationId correlationId0 = new CorrelationId("ID:0");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      correlationId0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals("ID:0", correlationId0.getString());
  }

  @Test
  public void test4()  throws Throwable  {
      CorrelationId correlationId0 = new CorrelationId("f-~!U3Q,qL");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) pipedOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      correlationId0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals("f-~!U3Q,qL", correlationId0.getString());
  }

  @Test
  public void test5()  throws Throwable  {
      CorrelationId correlationId0 = new CorrelationId("ID:0");
      String string0 = correlationId0.getString();
      assertEquals("ID:0", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      CorrelationId correlationId0 = new CorrelationId("f-~!U3Q,qL");
      String string0 = correlationId0.getString();
      assertEquals("f-~!U3Q,qL", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      CorrelationId correlationId0 = new CorrelationId();
      try {
        correlationId0.getString();
        fail("Expecting exception: JMSException");
      } catch(JMSException e) {
        /*
         * Unknown correlation
         */
      }
  }
}
