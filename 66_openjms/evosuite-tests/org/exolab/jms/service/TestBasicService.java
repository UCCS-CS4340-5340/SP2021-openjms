/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.common.threads.DefaultThreadPoolFactory;
import org.exolab.jms.common.threads.ThreadListener;
import org.exolab.jms.common.threads.ThreadPoolFactory;
import org.exolab.jms.events.BasicEventManager;
import org.exolab.jms.lease.LeaseManager;
import org.exolab.jms.service.ServiceException;
import org.exolab.jms.service.ServiceThreadListener;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestBasicService {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LeaseManager leaseManager0 = new LeaseManager();
      String string0 = leaseManager0.toString();
      assertEquals("BasicService:[name=LeaseManagerthread=nullstarted=false]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      LeaseManager leaseManager0 = new LeaseManager();
      leaseManager0.doStart();
      assertEquals("BasicService:[name=LeaseManagerthread=Thread[LeaseManager,5,Test Execution]started=false]", leaseManager0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      ServiceThreadListener serviceThreadListener0 = new ServiceThreadListener();
      DefaultThreadPoolFactory defaultThreadPoolFactory0 = new DefaultThreadPoolFactory((ThreadListener) serviceThreadListener0);
      BasicEventManager basicEventManager0 = new BasicEventManager((ThreadPoolFactory) defaultThreadPoolFactory0);
      // Undeclared exception!
      try {
        basicEventManager0.doStop();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
