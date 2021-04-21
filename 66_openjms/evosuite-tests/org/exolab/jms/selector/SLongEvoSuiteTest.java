/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.selector.SLong;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SLongEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SLong sLong0 = new SLong((-15L));
      long long0 = sLong0.getLong();
      assertEquals((-15L), long0);
  }

  @Test
  public void test1()  throws Throwable  {
      SLong sLong0 = new SLong((-15L));
      Long long0 = (Long)sLong0.getObject();
      assertEquals((-15L), (long)long0);
  }

  @Test
  public void test2()  throws Throwable  {
      SLong sLong0 = new SLong((-15L));
      double double0 = sLong0.getDouble();
      assertEquals((-15.0), double0, 0.01D);
  }
}
