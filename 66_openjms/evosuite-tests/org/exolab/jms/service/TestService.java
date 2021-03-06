/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.service.ServiceException;
import org.exolab.jms.service.ServiceManager;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestService {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ServiceManager serviceManager0 = new ServiceManager();
      serviceManager0.getName();
      assertEquals(false, serviceManager0.isStarted());
      assertEquals("Service:[name=nullstarted=false]", serviceManager0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      ServiceManager serviceManager0 = new ServiceManager();
      String string0 = serviceManager0.toString();
      assertEquals("Service:[name=nullstarted=false]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ServiceManager serviceManager0 = new ServiceManager();
      boolean boolean0 = serviceManager0.isStarted();
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      ServiceManager serviceManager0 = new ServiceManager();
      assertEquals("Service:[name=nullstarted=false]", serviceManager0.toString());
      
      serviceManager0.restart();
      serviceManager0.restart();
      assertEquals(true, serviceManager0.isStarted());
      assertEquals("Service:[name=nullstarted=true]", serviceManager0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      ServiceManager serviceManager0 = new ServiceManager();
      assertEquals(false, serviceManager0.isStarted());
      
      serviceManager0.start();
      try {
        serviceManager0.start();
        fail("Expecting exception: ServiceException");
      } catch(ServiceException e) {
        /*
         * Service already started
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ServiceManager serviceManager0 = new ServiceManager();
      try {
        serviceManager0.stop();
        fail("Expecting exception: ServiceException");
      } catch(ServiceException e) {
        /*
         * Service not started
         */
      }
  }
}
