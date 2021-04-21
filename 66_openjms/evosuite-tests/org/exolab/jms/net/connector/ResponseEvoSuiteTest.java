/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.connector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import org.exolab.jms.net.connector.Response;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ResponseEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Response response0 = new Response((Object) "", (Method) null);
      boolean boolean0 = response0.isException();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      Response response0 = new Response((Throwable) null);
      Object object0 = response0.getObject();
      assertNull(object0);
  }

  @Test
  public void test2()  throws Throwable  {
      Response response0 = new Response((Throwable) null);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 1959);
      PrintStream printStream0 = new PrintStream((OutputStream) bufferedOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      // Undeclared exception!
      try {
        response0.write((ObjectOutput) objectOutputStream0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}