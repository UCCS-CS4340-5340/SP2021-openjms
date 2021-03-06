/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.SBool;
import org.exolab.jms.selector.Type;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSBool {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SBool sBool0 = SBool.TRUE;
      Type type0 = sBool0.type();
      assertEquals("boolean", type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      SBool sBool0 = new SBool(boolean0);
      Boolean boolean1 = (Boolean)sBool0.getObject();
      assertSame(boolean0, boolean1);
  }

  @Test
  public void test2()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      SBool sBool0 = new SBool(boolean0);
      SBool sBool1 = sBool0.and(sBool0);
      assertEquals(true, sBool1.value());
      assertNotSame(sBool1, sBool0);
      assertNotNull(sBool1);
  }

  @Test
  public void test3()  throws Throwable  {
      SBool sBool0 = SBool.TRUE;
      SBool sBool1 = sBool0.and((SBool) null);
      assertNull(sBool1);
      assertEquals(true, sBool0.value());
  }

  @Test
  public void test4()  throws Throwable  {
      SBool sBool0 = SBool.FALSE;
      SBool sBool1 = sBool0.and(sBool0);
      assertSame(sBool0, sBool1);
  }

  @Test
  public void test5()  throws Throwable  {
      SBool sBool0 = SBool.FALSE;
      SBool sBool1 = sBool0.not();
      assertNotNull(sBool1);
      
      SBool sBool2 = sBool1.and(sBool0);
      assertEquals(true, sBool1.value());
      assertNotNull(sBool2);
      assertNotSame(sBool1, sBool2);
  }

  @Test
  public void test6()  throws Throwable  {
      SBool sBool0 = SBool.FALSE;
      SBool sBool1 = sBool0.and((SBool) null);
      assertEquals(false, sBool1.value());
  }

  @Test
  public void test7()  throws Throwable  {
      SBool sBool0 = SBool.FALSE;
      SBool sBool1 = sBool0.or(sBool0);
      assertEquals(false, sBool1.value());
      assertNotNull(sBool1);
  }

  @Test
  public void test8()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      SBool sBool0 = new SBool(boolean0);
      SBool sBool1 = sBool0.or(sBool0);
      assertNotNull(sBool1);
      assertNotSame(sBool0, sBool1);
  }

  @Test
  public void test9()  throws Throwable  {
      SBool sBool0 = SBool.TRUE;
      SBool sBool1 = sBool0.not();
      assertNotSame(sBool0, sBool1);
      assertNotNull(sBool1);
  }
}
