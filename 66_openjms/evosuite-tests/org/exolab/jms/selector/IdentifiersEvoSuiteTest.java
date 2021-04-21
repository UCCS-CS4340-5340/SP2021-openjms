/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.Identifiers;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IdentifiersEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      boolean boolean0 = Identifiers.isJMSIdentifier("G");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = Identifiers.isJMSIdentifier("JMSX");
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = Identifiers.isJMSIdentifier("JMSCorrelationID");
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      boolean boolean0 = Identifiers.isJMSIdentifier("JMS_JMSCorrelationID");
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      boolean boolean0 = Identifiers.isQueryableJMSIdentifier("JMSDeliveryMode");
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      boolean boolean0 = Identifiers.isQueryableJMSIdentifier("JMSPriority");
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      boolean boolean0 = Identifiers.isQueryableJMSIdentifier("JMSCorrelationID");
      assertEquals(true, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      boolean boolean0 = Identifiers.isQueryableJMSIdentifier("JMSTimestamp");
      assertEquals(true, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      boolean boolean0 = Identifiers.isQueryableJMSIdentifier("JMSMessageID");
      assertEquals(true, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      boolean boolean0 = Identifiers.isQueryableJMSIdentifier("");
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = Identifiers.isQueryableJMSIdentifier("JMSType");
      assertEquals(true, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      boolean boolean0 = Identifiers.isString("JMSMessageID");
      assertEquals(true, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      boolean boolean0 = Identifiers.isString("JMSDeliveryMode");
      assertEquals(true, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      boolean boolean0 = Identifiers.isString("JMSCorrelationID");
      assertEquals(true, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      boolean boolean0 = Identifiers.isString("JMSType");
      assertEquals(true, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      boolean boolean0 = Identifiers.isString("");
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      boolean boolean0 = Identifiers.isNumeric("JMSPriority");
      assertEquals(true, boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      boolean boolean0 = Identifiers.isNumeric("G");
      assertEquals(false, boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      boolean boolean0 = Identifiers.isNumeric("JMSTimestamp");
      assertEquals(true, boolean0);
  }
}
