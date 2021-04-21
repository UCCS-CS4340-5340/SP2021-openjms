/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.common.uuid;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.common.uuid.Clock;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ClockEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      long long0 = Clock.clock();
      assertEquals(0L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = Clock.getUnsynchTicks();
      assertEquals(100, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      long long0 = Clock.getAdvance();
      assertEquals(0L, long0);
  }

  @Test
  public void test3()  throws Throwable  {
      Clock.advance((long) 555);
  }

  @Test
  public void test4()  throws Throwable  {
      Clock.setUnsynchTicks(563);
  }

  @Test
  public void test5()  throws Throwable  {
      Clock.setUnsynchTicks((-1124));
  }

  @Test
  public void test6()  throws Throwable  {
      Clock.setUnsynchTicks(52);
  }

  @Test
  public void test7()  throws Throwable  {
      Clock.setSynchEvery(555);
  }

  @Test
  public void test8()  throws Throwable  {
      Clock.setSynchEvery((-1124));
  }

  @Test
  public void test9()  throws Throwable  {
      long long0 = Clock.synchronize();
      assertEquals((-555L), long0);
  }
}