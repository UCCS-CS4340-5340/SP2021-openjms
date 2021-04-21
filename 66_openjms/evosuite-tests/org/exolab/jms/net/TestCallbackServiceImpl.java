/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.List;
import org.exolab.jms.net.Callback;
import org.exolab.jms.net.CallbackService;
import org.exolab.jms.net.CallbackServiceImpl;
import org.exolab.jms.net.invoke.RecursiveCallback;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestCallbackServiceImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CallbackServiceImpl callbackServiceImpl0 = new CallbackServiceImpl();
      RecursiveCallback recursiveCallback0 = new RecursiveCallback((CallbackService) callbackServiceImpl0, 0);
      callbackServiceImpl0.removeCallback((Callback) recursiveCallback0);
  }

  @Test
  public void test1()  throws Throwable  {
      CallbackServiceImpl callbackServiceImpl0 = new CallbackServiceImpl();
      RecursiveCallback recursiveCallback0 = new RecursiveCallback((CallbackService) callbackServiceImpl0, 0);
      callbackServiceImpl0.addCallback((Callback) recursiveCallback0);
      callbackServiceImpl0.invoke((Object) "ja");
  }

  @Test
  public void test2()  throws Throwable  {
      CallbackServiceImpl callbackServiceImpl0 = new CallbackServiceImpl();
      List<Object> list0 = callbackServiceImpl0.getCallbacks();
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test3()  throws Throwable  {
      CallbackServiceImpl callbackServiceImpl0 = new CallbackServiceImpl();
      callbackServiceImpl0.invoke((Object) "");
  }
}