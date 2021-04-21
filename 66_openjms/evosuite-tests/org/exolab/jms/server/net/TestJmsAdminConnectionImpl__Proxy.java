/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.server.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.RemoteException;
import java.rmi.server.ObjID;
import org.exolab.jms.net.orb.UnicastDelegate;
import org.exolab.jms.net.proxy.Delegate;
import org.exolab.jms.net.uri.InvalidURIException;
import org.exolab.jms.server.net.JmsAdminConnectionImpl__Proxy;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJmsAdminConnectionImpl__Proxy {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "}");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.stopServer();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "removeDurableConsumer");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.purgeMessages();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, (String) null);
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.getDurableConsumers("2+@o`B+M#");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, ")9>5IN1zm");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.getAllDestinations();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "$B");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.removeDestination("$B");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, "8QwAZH+/h9L/$xd'");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.getAllUsers();
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (String) null);
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.unregisterConsumer((String) null);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, "?ou-FG[BkU3XRSE:");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.changePassword("?ou-FG[BkU3XRSE:", "?ou-FG[BkU3XRSE:");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      UnicastDelegate unicastDelegate0 = new UnicastDelegate((ObjID) null, (String) null);
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.addDurableConsumer((String) null, (String) null);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) null);
      try {
        jmsAdminConnectionImpl__Proxy0.addUser("Q", "x&Ng7Un(Rh]:9\"UF");
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * null; nested exception is: 
         * \tjava.lang.NullPointerException
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      ObjID objID0 = new ObjID((-1419));
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "org.exolab.jms.net.orb.UnicastDelegate");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.durableConsumerExists("org.exolab.jms.net.orb.UnicastDelegate");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, (String) null);
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.removeUser((String) null);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      ObjID objID0 = new ObjID(0);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "{I");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      Boolean boolean0 = Boolean.TRUE;
      try {
        jmsAdminConnectionImpl__Proxy0.addDestination("", boolean0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ObjID objID0 = new ObjID();
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "getDurableConsumers");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.destinationExists("getDurableConsumers");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) null);
      try {
        jmsAdminConnectionImpl__Proxy0.isConnected("o%9B3fq");
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * null; nested exception is: 
         * \tjava.lang.NullPointerException
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      ObjID objID0 = new ObjID(1);
      UnicastDelegate unicastDelegate0 = new UnicastDelegate(objID0, "Failed to get all destinations");
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) unicastDelegate0);
      try {
        jmsAdminConnectionImpl__Proxy0.removeDurableConsumer("Failed to get all destinations");
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) null);
      try {
        jmsAdminConnectionImpl__Proxy0.getDurableConsumerMessageCount("", "");
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * null; nested exception is: 
         * \tjava.lang.NullPointerException
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      JmsAdminConnectionImpl__Proxy jmsAdminConnectionImpl__Proxy0 = new JmsAdminConnectionImpl__Proxy((Delegate) null);
      try {
        jmsAdminConnectionImpl__Proxy0.getQueueMessageCount("\"d]jkY<X");
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * null; nested exception is: 
         * \tjava.lang.NullPointerException
         */
      }
  }
}
