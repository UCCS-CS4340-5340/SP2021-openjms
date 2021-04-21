/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.Context;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ContextEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Context context0 = new Context(227, 1725);
      int int0 = context0.getColumn();
      assertEquals(1725, int0);
      assertEquals(227, context0.getLine());
  }

  @Test
  public void test1()  throws Throwable  {
      Context context0 = new Context(227, 1725);
      String string0 = context0.toString();
      assertEquals("line 227, column 1725", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Context context0 = new Context(227, 1725);
      int int0 = context0.getLine();
      assertEquals(1725, context0.getColumn());
      assertEquals(227, int0);
  }
}