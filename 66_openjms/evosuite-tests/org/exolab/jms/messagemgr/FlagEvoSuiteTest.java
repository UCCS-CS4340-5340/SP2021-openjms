/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.messagemgr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.messagemgr.Flag;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FlagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Flag flag0 = new Flag(false);
      boolean boolean0 = flag0.get();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      Flag flag0 = new Flag(false);
      flag0.set(false);
      assertEquals(false, flag0.get());
  }
}
