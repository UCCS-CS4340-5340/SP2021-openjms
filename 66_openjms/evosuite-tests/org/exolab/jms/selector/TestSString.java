/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.SString;
import org.exolab.jms.selector.Type;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSString {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SString sString0 = new SString("A8:LLVo+>gJ>n+,!ds");
      String string0 = (String)sString0.getObject();
      assertEquals("A8:LLVo+>gJ>n+,!ds", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      SString sString0 = new SString("M>E|4#^zP-c[*");
      Type type0 = sString0.type();
      assertEquals("string", type0.toString());
  }
}
