/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tranlog;

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
import org.exolab.jms.tranlog.ExternalXid;
import org.exolab.jms.tranlog.TransactionLog;
import org.exolab.jms.tranlog.TransactionLogException;
import org.exolab.jms.tranlog.TransactionState;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TransactionLogEvoSuiteTest {

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
      TransactionLog transactionLog0 = new TransactionLog(".", false);
      try {
        transactionLog0.recover();
        fail("Expecting exception: TransactionLogException");
      } catch(TransactionLogException e) {
        /*
         * Error in recover java.io.FileNotFoundException: . (Is a directory)
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          TransactionLog transactionLog0 = new TransactionLog(".", false);
          ExternalXid externalXid0 = new ExternalXid();
          TransactionState transactionState0 = new TransactionState();
          try {
            transactionLog0.logTransactionState(externalXid0, (-7L), ".", transactionState0);
            fail("Expecting exception: TransactionLogException");
          } catch(TransactionLogException e) {
            /*
             * Error in logTransactionState java.lang.SecurityException: Security manager blocks (java.io.FilePermission . write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:183)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:116)
             * org.exolab.jms.tranlog.TransactionLog.getOutputStream(TransactionLog.java:329)
             * org.exolab.jms.tranlog.TransactionLog.logTransactionState(TransactionLog.java:177)
             * sun.reflect.GeneratedMethodAccessor71.invoke(Unknown Source)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
             * java.lang.reflect.Method.invoke(Method.java:597)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test2()  throws Throwable  {
      TransactionLog transactionLog0 = new TransactionLog(".", false);
      String string0 = transactionLog0.getName();
      assertEquals(".", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      TransactionLog transactionLog0 = new TransactionLog(".", false);
      assertNotNull(transactionLog0);
      
      long long0 = transactionLog0.size();
      assertEquals(4096L, long0);
  }

  @Test
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          TransactionLog transactionLog0 = new TransactionLog(".", false);
          ExternalXid externalXid0 = new ExternalXid();
          try {
            transactionLog0.logTransactionData(externalXid0, 1915L, ".", (Object) "file:/mnt/fastdata/ac1gf/SF110/dist/66_openjms/././");
            fail("Expecting exception: TransactionLogException");
          } catch(TransactionLogException e) {
            /*
             * Error in logTransactionData java.lang.SecurityException: Security manager blocks (java.io.FilePermission . write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:183)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:116)
             * org.exolab.jms.tranlog.TransactionLog.getOutputStream(TransactionLog.java:329)
             * org.exolab.jms.tranlog.TransactionLog.logTransactionData(TransactionLog.java:209)
             * sun.reflect.GeneratedMethodAccessor72.invoke(Unknown Source)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
             * java.lang.reflect.Method.invoke(Method.java:597)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test5()  throws Throwable  {
      TransactionLog transactionLog0 = null;
      try {
        transactionLog0 = new TransactionLog((String) null, true);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Can't specify a null or empty name
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TransactionLog transactionLog0 = null;
      try {
        transactionLog0 = new TransactionLog("", true);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Can't specify a null or empty name
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      TransactionLog transactionLog0 = null;
      try {
        transactionLog0 = new TransactionLog(".", true);
        fail("Expecting exception: TransactionLogException");
      } catch(TransactionLogException e) {
        /*
         * . already exists
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          TransactionLog transactionLog0 = null;
          try {
            transactionLog0 = new TransactionLog("Mnv<^v$ppao", true);
            fail("Expecting exception: TransactionLogException");
          } catch(TransactionLogException e) {
            /*
             * Failed to create the log file Mnv<^v$ppao b/cjava.lang.SecurityException: Security manager blocks (java.io.FilePermission Mnv<^v$ppao write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:183)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:145)
             * org.exolab.jms.tranlog.TransactionLog.<init>(TransactionLog.java:129)
             * sun.reflect.GeneratedConstructorAccessor39.newInstance(Unknown Source)
             * sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)
             * java.lang.reflect.Constructor.newInstance(Constructor.java:513)
             * org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test9()  throws Throwable  {
      TransactionLog transactionLog0 = null;
      try {
        transactionLog0 = new TransactionLog("r}]@c8}qWtcb-9V$.", false);
        fail("Expecting exception: TransactionLogException");
      } catch(TransactionLogException e) {
        /*
         * r}]@c8}qWtcb-9V$. does not exists
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TransactionLog transactionLog0 = new TransactionLog(".", false);
      transactionLog0.close();
      assertEquals(4096L, transactionLog0.size());
  }

  @Test
  public void test11()  throws Throwable  {
      TransactionLog transactionLog0 = new TransactionLog(".", false);
      assertNotNull(transactionLog0);
      
      boolean boolean0 = transactionLog0.equals((Object) false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      TransactionLog transactionLog0 = new TransactionLog(".", false);
      assertNotNull(transactionLog0);
      
      boolean boolean0 = transactionLog0.equals((Object) transactionLog0);
      assertEquals(true, boolean0);
  }
}
