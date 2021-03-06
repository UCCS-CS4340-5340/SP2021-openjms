/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.scheduler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.scheduler.Scheduler;
import org.exolab.jms.scheduler.SerialTask;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SerialTaskEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SerialTask serialTask0 = new SerialTask((Runnable) null, (Scheduler) null);
      assertEquals("[stop=false, active=false, reschedule=false, scheduled=false]", serialTask0.toString());
      
      String string0 = serialTask0.toString();
      assertEquals("[stop=false, active=false, reschedule=false, scheduled=true]", serialTask0.toString());
      assertNotNull(string0);
      assertEquals("[stop=false, active=false, reschedule=false, scheduled=true]", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      SerialTask serialTask0 = new SerialTask((Runnable) null, (Scheduler) null);
      assertEquals("[stop=false, active=false, reschedule=false, scheduled=false]", serialTask0.toString());
      
      // Undeclared exception!
      boolean boolean0 = false;
      try {
        boolean0 = serialTask0.schedule();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
      assertEquals("[stop=false, active=false, reschedule=false, scheduled=true]", serialTask0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      SerialTask serialTask0 = new SerialTask((Runnable) null, (Scheduler) null);
      // Undeclared exception!
      try {
        serialTask0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SerialTask serialTask0 = new SerialTask((Runnable) null, (Scheduler) null);
      serialTask0.stop();
      assertEquals("[stop=false, active=false, reschedule=false, scheduled=false]", serialTask0.toString());
  }
}
