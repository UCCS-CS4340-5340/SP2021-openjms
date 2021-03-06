/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.connector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.security.Principal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.exolab.jms.net.connector.URIRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class URIRequestInfoEvoSuiteTest {

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

/*
  @Test
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          URI uRI0 = new URI("ZW", "ZW", "ZW", "ZW", "ZW");
          URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
          // Undeclared exception!
          try {
            uRIRequestInfo0.getHostAddress();
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.net.SocketPermission ZW resolve)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkConnect(SecurityManager.java:1031)
             * java.net.InetAddress.getAllByName0(InetAddress.java:1145)
             * java.net.InetAddress.getAllByName(InetAddress.java:1083)
             * java.net.InetAddress.getAllByName(InetAddress.java:1019)
             * java.net.InetAddress.getByName(InetAddress.java:969)
             * org.exolab.jms.net.connector.URIRequestInfo.getHostAddress(URIRequestInfo.java:107)
             * sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
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
             *
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
*/

  @Test
  public void test1()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      URI uRI1 = uRIRequestInfo0.getURI();
      assertNull(uRI1.getQueryString());
  }

  @Test
  public void test2()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      Principal principal0 = uRIRequestInfo0.getPrincipal();
      assertNull(principal0);
  }

  @Test
  public void test3()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      Properties properties0 = new Properties("'K.*)");
      uRIRequestInfo0.export(properties0);
      assertNull(uRIRequestInfo0.getHost());
  }

  @Test
  public void test4()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      int int0 = uRIRequestInfo0.hashCode();
      assertEquals(0, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      int int0 = uRIRequestInfo0.getPort();
      assertEquals((-1), int0);
  }

  @Test
  public void test6()  throws Throwable  {
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      Inet4Address inet4Address0 = (Inet4Address)uRIRequestInfo0.getHostAddress();
      assertNull(inet4Address0);
  }

  @Test
  public void test7()  throws Throwable  {
      URI uRI0 = new URI("true", "true", "JgcU", 0, "true", "true", "true");
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      boolean boolean0 = uRIRequestInfo0.equals((Object) "true?true#true");
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      URI uRI0 = new URI("true", "true", "JgcU", 0, "true", "true", "true");
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      boolean boolean0 = uRIRequestInfo0.equals((Object) uRIRequestInfo0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      URI uRI0 = new URI("true", "true", "JgcU", 0, "true", "true", "true");
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      URIRequestInfo uRIRequestInfo1 = new URIRequestInfo(uRI0);
      boolean boolean0 = uRIRequestInfo0.equals((Object) uRIRequestInfo1);
      assertEquals(true, boolean0);
  }
}
