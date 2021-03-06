/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.Identifier;
import org.exolab.jms.selector.LikeExpression;
import org.exolab.jms.selector.SelectorException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LikeExpressionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LikeExpression likeExpression0 = new LikeExpression((Identifier) null, "h})", (String) null);
      assertNotNull(likeExpression0);
  }

  @Test
  public void test1()  throws Throwable  {
      LikeExpression likeExpression0 = new LikeExpression((Identifier) null, "s{G=tG", "F");
      assertNotNull(likeExpression0);
  }

  @Test
  public void test2()  throws Throwable  {
      LikeExpression likeExpression0 = null;
      try {
        likeExpression0 = new LikeExpression((Identifier) null, "F", "s{G=tG");
        fail("Expecting exception: SelectorException");
      } catch(SelectorException e) {
        /*
         * Invalid escape: s{G=tG
         */
      }
  }
}
