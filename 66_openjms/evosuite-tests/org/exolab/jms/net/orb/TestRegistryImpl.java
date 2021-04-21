/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.orb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.server.ObjID;
import org.exolab.jms.net.EchoServiceImpl__Proxy;
import org.exolab.jms.net.connector.Connection;
import org.exolab.jms.net.invoke.LoggingCallback__Proxy;
import org.exolab.jms.net.orb.RegistryImpl;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.proxy.Proxy;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestRegistryImpl {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RegistryImpl registryImpl0 = new RegistryImpl();
      try {
        registryImpl0.unbind("gf{H");
        fail("Expecting exception: NotBoundException");
      } catch(NotBoundException e) {
        /*
         * gf{H
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RegistryImpl registryImpl0 = new RegistryImpl();
      boolean boolean0 = registryImpl0.getReadOnly();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      RegistryImpl registryImpl0 = new RegistryImpl();
      LoggingCallback__Proxy loggingCallback__Proxy0 = new LoggingCallback__Proxy((Delegate) null);
      registryImpl0.bind("gf{H", (Proxy) loggingCallback__Proxy0);
      registryImpl0.unbind("gf{H");
      try {
        registryImpl0.lookup("gf{H");
        fail("Expecting exception: NotBoundException");
      } catch(NotBoundException e) {
        /*
         * gf{H
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      RegistryImpl registryImpl0 = new RegistryImpl();
      assertEquals(false, registryImpl0.getReadOnly());
      
      registryImpl0.setReadOnly(true);
      try {
        registryImpl0.unbind((String) null);
        fail("Expecting exception: AccessException");
      } catch(AccessException e) {
        /*
         * Registry is read-only
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      RegistryImpl registryImpl0 = new RegistryImpl();
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      EchoServiceImpl__Proxy echoServiceImpl__Proxy0 = new EchoServiceImpl__Proxy((Delegate) unicastDelegate0);
      registryImpl0.bind("F8sc)t*tl`(kUs", (Proxy) echoServiceImpl__Proxy0);
      EchoServiceImpl__Proxy echoServiceImpl__Proxy1 = (EchoServiceImpl__Proxy)registryImpl0.lookup("F8sc)t*tl`(kUs");
      assertSame(echoServiceImpl__Proxy1, echoServiceImpl__Proxy0);
  }

  @Test
  public void test5()  throws Throwable  {
      RegistryImpl registryImpl0 = new RegistryImpl();
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (Connection) null);
      EchoServiceImpl__Proxy echoServiceImpl__Proxy0 = new EchoServiceImpl__Proxy((Delegate) unicastDelegate0);
      registryImpl0.bind("F8sc)t*tl`(kUs", (Proxy) echoServiceImpl__Proxy0);
      try {
        registryImpl0.doBind("F8sc)t*tl`(kUs", (Proxy) echoServiceImpl__Proxy0);
        fail("Expecting exception: AlreadyBoundException");
      } catch(AlreadyBoundException e) {
        /*
         * F8sc)t*tl`(kUs
         */
      }
  }
}