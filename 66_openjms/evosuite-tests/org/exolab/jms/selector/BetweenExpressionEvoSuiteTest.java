/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.BetweenExpression;
import org.exolab.jms.selector.Expression;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BetweenExpressionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BetweenExpression betweenExpression0 = new BetweenExpression((Expression) null, (Expression) null, (Expression) null);
      // Undeclared exception!
      try {
        betweenExpression0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
