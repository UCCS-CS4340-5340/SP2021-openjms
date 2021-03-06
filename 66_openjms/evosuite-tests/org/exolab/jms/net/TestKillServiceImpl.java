/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.evosuite.runtime.System;
import org.exolab.jms.net.KillServiceImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestKillServiceImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      KillServiceImpl killServiceImpl0 = new KillServiceImpl();
      killServiceImpl0.kill(1142L);
  }

  @Test
  public void test1()  throws Throwable  {
      KillServiceImpl killServiceImpl0 = new KillServiceImpl();
      // Undeclared exception!
      try {
        killServiceImpl0.kill(0L);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }
}
