/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.Expression;
import org.exolab.jms.selector.GreaterEqual;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestGreaterEqual {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GreaterEqual greaterEqual0 = new GreaterEqual((Expression) null, (Expression) null);
      assertNotNull(greaterEqual0);
  }
}
