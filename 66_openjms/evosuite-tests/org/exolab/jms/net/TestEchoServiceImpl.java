/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.net.EchoServiceImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestEchoServiceImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EchoServiceImpl echoServiceImpl0 = new EchoServiceImpl();
      short short0 = echoServiceImpl0.echoShort((short)423);
      assertEquals((short)423, short0);
  }

  @Test
  public void test1()  throws Throwable  {
      EchoServiceImpl echoServiceImpl0 = new EchoServiceImpl();
      int int0 = echoServiceImpl0.echoInt(690);
      assertEquals(690, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      EchoServiceImpl echoServiceImpl0 = new EchoServiceImpl();
      float float0 = echoServiceImpl0.echoFloat((float) 690);
      assertEquals(690.0F, float0, 0.01F);
  }

  @Test
  public void test3()  throws Throwable  {
      EchoServiceImpl echoServiceImpl0 = new EchoServiceImpl();
      byte byte0 = echoServiceImpl0.echoByte((byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test
  public void test4()  throws Throwable  {
      EchoServiceImpl echoServiceImpl0 = new EchoServiceImpl();
      String string0 = (String)echoServiceImpl0.echoObject((Object) "");
      assertEquals("", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      EchoServiceImpl echoServiceImpl0 = new EchoServiceImpl();
      double double0 = echoServiceImpl0.echoDouble(0.0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      EchoServiceImpl echoServiceImpl0 = new EchoServiceImpl();
      long long0 = echoServiceImpl0.echoLong((long) '3');
      assertEquals(51L, long0);
  }

  @Test
  public void test7()  throws Throwable  {
      EchoServiceImpl echoServiceImpl0 = new EchoServiceImpl();
      char char0 = echoServiceImpl0.echoChar('n');
      assertEquals('n', char0);
  }

  @Test
  public void test8()  throws Throwable  {
      EchoServiceImpl echoServiceImpl0 = new EchoServiceImpl();
      boolean boolean0 = echoServiceImpl0.echoBoolean(true);
      assertEquals(true, boolean0);
  }
}
