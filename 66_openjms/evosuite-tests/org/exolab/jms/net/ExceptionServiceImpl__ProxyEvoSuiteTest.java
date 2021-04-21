/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.RemoteException;
import java.rmi.server.ObjID;
import org.exolab.jms.net.ExceptionServiceImpl__Proxy;
import org.exolab.jms.net.connector.Connection;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.proxy.RemoteInvocationException;
import org.exolab.jms.net.uri.InvalidURIException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ExceptionServiceImpl__ProxyEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) null);
      try {
        exceptionServiceImpl__Proxy0.throwThrowable();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ObjID objID0 = new ObjID(1448);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "throwUndeclaredRemoteInvocationException");
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        exceptionServiceImpl__Proxy0.throwError();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) null);
      try {
        exceptionServiceImpl__Proxy0.throwRuntimeException();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) unicastDelegate0);
      try {
        exceptionServiceImpl__Proxy0.throwUndeclaredRuntimeException2();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ObjID objID0 = new ObjID((-973));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) unicastDelegate0);
      try {
        exceptionServiceImpl__Proxy0.throwException();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) null);
      // Undeclared exception!
      try {
        exceptionServiceImpl__Proxy0.throwUndeclaredError();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ObjID objID0 = new ObjID(1);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "SR/PQT{_-w");
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) unicastDelegate0);
      try {
        exceptionServiceImpl__Proxy0.throwUndeclaredError2();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "");
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) unicastDelegate0);
      try {
        exceptionServiceImpl__Proxy0.throwRemoteException();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ObjID objID0 = new ObjID((-1503));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        exceptionServiceImpl__Proxy0.throwUndeclaredRuntimeException();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "Y)3s>0v:V[o}3_F");
      ExceptionServiceImpl__Proxy exceptionServiceImpl__Proxy0 = new ExceptionServiceImpl__Proxy((Delegate) unicastDelegate0);
      // Undeclared exception!
      try {
        exceptionServiceImpl__Proxy0.throwUndeclaredRemoteInvocationException();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
      }
  }
}
