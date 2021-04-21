/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.RemoteException;
import org.exolab.jms.net.ExceptionServiceImpl;
import org.exolab.jms.net.proxy.RemoteInvocationException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestExceptionServiceImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      // Undeclared exception!
      try {
        exceptionServiceImpl0.throwUndeclaredRuntimeException();
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * ExceptionService
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      // Undeclared exception!
      try {
        exceptionServiceImpl0.throwUndeclaredError2();
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * ExceptionService
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      try {
        exceptionServiceImpl0.throwException();
        fail("Expecting exception: Exception");
      } catch(Exception e) {
        /*
         * ExceptionService
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      // Undeclared exception!
      try {
        exceptionServiceImpl0.throwUndeclaredRuntimeException2();
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * ExceptionService
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      try {
        exceptionServiceImpl0.throwRuntimeException();
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * ExceptionService
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      // Undeclared exception!
      try {
        exceptionServiceImpl0.throwUndeclaredRemoteInvocationException();
        fail("Expecting exception: RemoteInvocationException");
      } catch(RemoteInvocationException e) {
        /*
         * ExceptionService
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      try {
        exceptionServiceImpl0.throwRemoteException();
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * ExceptionService
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      // Undeclared exception!
      try {
        exceptionServiceImpl0.throwUndeclaredError();
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * ExceptionService
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      try {
        exceptionServiceImpl0.throwThrowable();
        fail("Expecting exception: Throwable");
      } catch(Throwable e) {
        /*
         * ExceptionService
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      ExceptionServiceImpl exceptionServiceImpl0 = new ExceptionServiceImpl();
      try {
        exceptionServiceImpl0.throwError();
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * ExceptionService
         */
      }
  }
}