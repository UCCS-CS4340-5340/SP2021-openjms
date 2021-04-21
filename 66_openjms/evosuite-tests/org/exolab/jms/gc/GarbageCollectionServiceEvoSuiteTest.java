/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.gc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.common.threads.DefaultThreadPoolFactory;
import org.exolab.jms.common.threads.ThreadListener;
import org.exolab.jms.common.threads.ThreadPoolFactory;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.config.GarbageCollectionConfiguration;
import org.exolab.jms.events.BasicEventManager;
import org.exolab.jms.events.EventManager;
import org.exolab.jms.gc.GarbageCollectionService;
import org.exolab.jms.service.ServiceException;
import org.exolab.jms.service.ServiceThreadListener;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GarbageCollectionServiceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      ServiceThreadListener serviceThreadListener0 = new ServiceThreadListener();
      DefaultThreadPoolFactory defaultThreadPoolFactory0 = new DefaultThreadPoolFactory((ThreadListener) serviceThreadListener0);
      GarbageCollectionConfiguration garbageCollectionConfiguration0 = new GarbageCollectionConfiguration();
      configuration0.setGarbageCollectionConfiguration(garbageCollectionConfiguration0);
      BasicEventManager basicEventManager0 = new BasicEventManager((ThreadPoolFactory) defaultThreadPoolFactory0);
      GarbageCollectionService garbageCollectionService0 = new GarbageCollectionService(configuration0, (EventManager) basicEventManager0);
      assertNotNull(garbageCollectionService0);
      
      garbageCollectionService0.start();
      assertEquals("Service:[name=GarbageCollectionServicestarted=true]", garbageCollectionService0.toString());
      assertEquals(true, garbageCollectionService0.isStarted());
  }

  @Test
  public void test1()  throws Throwable  {
      GarbageCollectionService garbageCollectionService0 = null;
      try {
        garbageCollectionService0 = new GarbageCollectionService((Configuration) null, (EventManager) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'config' is null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      GarbageCollectionService garbageCollectionService0 = null;
      try {
        garbageCollectionService0 = new GarbageCollectionService(configuration0, (EventManager) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'eventMgr' is null
         */
      }
  }
}