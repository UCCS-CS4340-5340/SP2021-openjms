/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.rmi;

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
import org.exolab.jms.authentication.AuthenticationMgr;
import org.exolab.jms.authentication.UserManager;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.net.connector.Authenticator;
import org.exolab.jms.net.connector.ManagedConnectionAcceptorListener;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.rmi.RMIManagedConnectionAcceptor;
import org.exolab.jms.net.rmi.RMIRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.exolab.jms.persistence.DatabaseService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RMIManagedConnectionAcceptorEvoSuiteTest {

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
      URI uRI0 = new URI();
      Properties properties0 = new Properties(".D");
      RMIRequestInfo rMIRequestInfo0 = new RMIRequestInfo(uRI0, properties0);
      RMIManagedConnectionAcceptor rMIManagedConnectionAcceptor0 = new RMIManagedConnectionAcceptor((Authenticator) null, rMIRequestInfo0);
      URI uRI1 = rMIManagedConnectionAcceptor0.getURI();
      assertEquals("", uRI1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          URI uRI0 = new URI();
          Properties properties0 = new Properties("");
          RMIRequestInfo rMIRequestInfo0 = new RMIRequestInfo(uRI0, properties0);
          rMIRequestInfo0.setEmbedRegistry(false);
          RMIManagedConnectionAcceptor rMIManagedConnectionAcceptor0 = new RMIManagedConnectionAcceptor((Authenticator) null, rMIRequestInfo0);
          // Undeclared exception!
          try {
            rMIManagedConnectionAcceptor0.accept((ManagedConnectionAcceptorListener) null);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.net.SocketPermission localhost:1024- listen,resolve)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkListen(SecurityManager.java:1118)
             * java.net.ServerSocket.bind(ServerSocket.java:327)
             * java.net.ServerSocket.<init>(ServerSocket.java:194)
             * java.net.ServerSocket.<init>(ServerSocket.java:106)
             * sun.rmi.transport.proxy.RMIDirectSocketFactory.createServerSocket(RMIDirectSocketFactory.java:27)
             * sun.rmi.transport.proxy.RMIMasterSocketFactory.createServerSocket(RMIMasterSocketFactory.java:333)
             * sun.rmi.transport.tcp.TCPEndpoint.newServerSocket(TCPEndpoint.java:649)
             * sun.rmi.transport.tcp.TCPTransport.listen(TCPTransport.java:299)
             * sun.rmi.transport.tcp.TCPTransport.exportObject(TCPTransport.java:218)
             * sun.rmi.transport.tcp.TCPEndpoint.exportObject(TCPEndpoint.java:393)
             * sun.rmi.transport.LiveRef.exportObject(LiveRef.java:129)
             * sun.rmi.server.UnicastServerRef.exportObject(UnicastServerRef.java:188)
             * java.rmi.server.UnicastRemoteObject.exportObject(UnicastRemoteObject.java:293)
             * java.rmi.server.UnicastRemoteObject.exportObject(UnicastRemoteObject.java:235)
             * org.exolab.jms.net.rmi.RMIManagedConnectionAcceptor.accept(RMIManagedConnectionAcceptor.java:159)
             * sun.reflect.GeneratedMethodAccessor120.invoke(Unknown Source)
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
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      UserManager userManager0 = new UserManager(configuration0, databaseService0);
      AuthenticationMgr authenticationMgr0 = new AuthenticationMgr(userManager0);
      URI uRI0 = new URI();
      RMIRequestInfo rMIRequestInfo0 = new RMIRequestInfo(uRI0);
      RMIManagedConnectionAcceptor rMIManagedConnectionAcceptor0 = new RMIManagedConnectionAcceptor((Authenticator) authenticationMgr0, rMIRequestInfo0);
      // Undeclared exception!
      try {
        rMIManagedConnectionAcceptor0.accept((ManagedConnectionAcceptorListener) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Port value out of range: -1
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties("");
      RMIRequestInfo rMIRequestInfo0 = new RMIRequestInfo(uRI0, properties0);
      RMIManagedConnectionAcceptor rMIManagedConnectionAcceptor0 = new RMIManagedConnectionAcceptor((Authenticator) null, rMIRequestInfo0);
      rMIManagedConnectionAcceptor0.close();
  }
}
