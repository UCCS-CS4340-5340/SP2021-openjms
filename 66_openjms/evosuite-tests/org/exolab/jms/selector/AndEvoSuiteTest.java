/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.And;
import org.exolab.jms.selector.Expression;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AndEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      And and0 = new And((Expression) null, (Expression) null);
      assertNotNull(and0);
  }
}
