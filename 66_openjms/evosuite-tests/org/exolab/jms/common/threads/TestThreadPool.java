/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.common.threads;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import EDU.oswego.cs.dl.util.concurrent.Channel;
import EDU.oswego.cs.dl.util.concurrent.Slot;
import org.exolab.jms.common.threads.ThreadListener;
import org.exolab.jms.common.threads.ThreadPool;
import org.exolab.jms.service.ServiceThreadListener;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestThreadPool {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ThreadPool threadPool0 = new ThreadPool("r\"p461E]r\"t9,e", (-402), true);
      assertNotNull(threadPool0);
      
      ServiceThreadListener serviceThreadListener0 = new ServiceThreadListener();
      threadPool0.setThreadListener((ThreadListener) serviceThreadListener0);
      threadPool0.execute((Runnable) null);
      assertEquals(1, threadPool0.getPoolSize());
  }

  @Test
  public void test1()  throws Throwable  {
      ThreadGroup threadGroup0 = new ThreadGroup("r\"p461E]r\"t9,e");
      ThreadPool threadPool0 = new ThreadPool(threadGroup0, "r\"p461E]r\"t9,e", (-402));
      assertEquals(0, threadPool0.getPoolSize());
  }

  @Test
  public void test2()  throws Throwable  {
      ThreadPool threadPool0 = new ThreadPool("r\"p461E]r\"t9,e", 50000);
      assertEquals(60000L, threadPool0.getKeepAliveTime());
  }

  @Test
  public void test3()  throws Throwable  {
      Slot slot0 = new Slot();
      ThreadPool threadPool0 = new ThreadPool("", (Channel) slot0, (-1));
      assertEquals(60000L, threadPool0.getKeepAliveTime());
  }

  @Test
  public void test4()  throws Throwable  {
      ThreadPool threadPool0 = new ThreadPool("r\"p461]r\"t9,e", 110, false);
      assertNotNull(threadPool0);
      
      threadPool0.execute((Runnable) null);
      assertEquals(1, threadPool0.getPoolSize());
  }
}
