/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.migration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.tools.migration.Exporter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestExporter {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          Configuration configuration0 = new Configuration();
          Exporter exporter0 = null;
          try {
            exporter0 = new Exporter(configuration0, "P\"qcRa<", true);
            fail("Expecting exception: PersistenceException");
          } catch(PersistenceException e) {
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test1()  throws Throwable  {
      Exporter exporter0 = null;
      try {
        exporter0 = new Exporter((Configuration) null, "kiBC", true);
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
      Exporter exporter0 = null;
      try {
        exporter0 = new Exporter(configuration0, (String) null, true);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'database' is null
         */
      }
  }
}
