/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.common.threads;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.common.threads.ThreadFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestThreadFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ThreadGroup threadGroup0 = new ThreadGroup("");
      ThreadFactory threadFactory0 = new ThreadFactory(threadGroup0, (String) null, false);
      // Undeclared exception!
      try {
        threadFactory0.newThread((Runnable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * name cannot be null
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ThreadFactory threadFactory0 = new ThreadFactory((ThreadGroup) null, "", true);
      Thread thread0 = threadFactory0.newThread((Runnable) null);
      assertEquals(185L, thread0.getId());
      assertNotNull(thread0);
  }
}
