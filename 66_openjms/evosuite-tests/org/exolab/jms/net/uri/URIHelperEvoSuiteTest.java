/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.uri;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.exolab.jms.common.security.BasicPrincipal;
import org.exolab.jms.net.uri.InvalidURIException;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.uri.URIHelper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class URIHelperEvoSuiteTest {

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
      try {
        URIHelper.parse("m?JIhn@H_Q;xX:x@5L/5", "m?JIhn@H_Q;xX:x@5L/5");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Invalid scheme: m
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Map<Object, Object> map0 = URIHelper.parseQuery("t=tv");
      assertNotNull(map0);
      
      try {
        URIHelper.create("t=tv", "t=tv", 1577, "t=tv", (Map) map0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * The scheme is not conformant.
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          URI uRI0 = URIHelper.create("ZXeNjS", "ZXeNjS", 1781, "ZXeNjS");
          assertNotNull(uRI0);
          
          // Undeclared exception!
          try {
            URIHelper.convertHostToAddress(uRI0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.net.SocketPermission ZXeNjS resolve)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkConnect(SecurityManager.java:1031)
             * java.net.InetAddress.getAllByName0(InetAddress.java:1145)
             * java.net.InetAddress.getAllByName(InetAddress.java:1083)
             * java.net.InetAddress.getAllByName(InetAddress.java:1019)
             * java.net.InetAddress.getByName(InetAddress.java:969)
             * org.exolab.jms.net.uri.URIHelper.convertHostToAddress(URIHelper.java:236)
             * sun.reflect.GeneratedMethodAccessor55.invoke(Unknown Source)
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
  public void test3()  throws Throwable  {
      try {
        URIHelper.create("", "", (-1507));
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument scheme is null or an empty string
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      try {
        URIHelper.parseHostPort("z:", "z");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No host specified in URI: z:
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = URIHelper.convertHostToAddress(uRI0);
      assertNull(uRI1.getHost());
  }

  @Test
  public void test6()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.setHost("");
      URI uRI1 = URIHelper.convertHostToAddress(uRI0);
      assertEquals("", uRI1.getHost());
  }

  @Test
  public void test7()  throws Throwable  {
      URI uRI0 = URIHelper.create("ZXeNjS", "ZXeNjS", 1781, "ZXeNjS");
      assertNotNull(uRI0);
      
      URIHelper.getPrincipal(uRI0);
      assertEquals("zxenjs://ZXeNjS:1781ZXeNjS", uRI0.toString());
      assertEquals("//ZXeNjS:1781ZXeNjS", uRI0.getSchemeSpecificPart());
  }

  @Test
  public void test8()  throws Throwable  {
      URI uRI0 = new URI("f", "f", "f", 24, "f", "f", "f");
      BasicPrincipal basicPrincipal0 = URIHelper.getPrincipal(uRI0);
      assertEquals("", basicPrincipal0.getPassword());
      assertEquals("f", basicPrincipal0.getName());
      assertNotNull(basicPrincipal0);
  }

  @Test
  public void test9()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.setHost("");
      uRI0.setUserinfo("");
      BasicPrincipal basicPrincipal0 = URIHelper.getPrincipal(uRI0);
      assertNull(basicPrincipal0);
  }

  @Test
  public void test10()  throws Throwable  {
      URI uRI0 = new URI("f", "f", "f", 24, "f", "f", "f");
      URI uRI1 = URIHelper.getURISansQuery(uRI0);
      assertNotSame(uRI0, uRI1);
      assertNotNull(uRI1);
      assertEquals(24, uRI1.getPort());
  }

  @Test
  public void test11()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = URIHelper.getURISansQuery(uRI0);
      assertEquals(-1, uRI1.getPort());
  }

  @Test
  public void test12()  throws Throwable  {
      try {
        URIHelper.parseQuery("f");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Invalid query=f
         */
      }
  }
}
