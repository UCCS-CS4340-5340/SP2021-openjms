/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.Expression;
import org.exolab.jms.selector.Or;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestOr {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Or or0 = new Or((Expression) null, (Expression) null);
      assertNotNull(or0);
  }
}
