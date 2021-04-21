/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.server.ObjID;
import java.util.LinkedList;
import org.exolab.jms.net.Callback;
import org.exolab.jms.net.CallbackServiceImpl__Proxy;
import org.exolab.jms.net.invoke.LoggingCallback;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.proxy.RemoteInvocationException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CallbackServiceImpl__ProxyEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjID objID0 = new ObjID((-234));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "){^|8VW89]/@<1%");
      CallbackServiceImpl__Proxy callbackServiceImpl__Proxy0 = new CallbackServiceImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        callbackServiceImpl__Proxy0.addCallback((Callback) null);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      CallbackServiceImpl__Proxy callbackServiceImpl__Proxy0 = new CallbackServiceImpl__Proxy((Delegate) unicastDelegate0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try {
        callbackServiceImpl__Proxy0.invoke((Object) linkedList0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      CallbackServiceImpl__Proxy callbackServiceImpl__Proxy0 = new CallbackServiceImpl__Proxy((Delegate) unicastDelegate0);
      LoggingCallback loggingCallback0 = new LoggingCallback();
      // Undeclared exception!
      try {
        callbackServiceImpl__Proxy0.removeCallback((Callback) loggingCallback0);
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      CallbackServiceImpl__Proxy callbackServiceImpl__Proxy0 = new CallbackServiceImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        callbackServiceImpl__Proxy0.getCallbacks();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }
}
