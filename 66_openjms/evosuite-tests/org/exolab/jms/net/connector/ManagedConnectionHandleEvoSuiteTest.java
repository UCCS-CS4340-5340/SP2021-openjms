/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.connector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.net.connector.ConnectionFactory;
import org.exolab.jms.net.connector.ConnectionManager;
import org.exolab.jms.net.connector.DefaultConnectionPool;
import org.exolab.jms.net.connector.InvocationHandler;
import org.exolab.jms.net.connector.ManagedConnection;
import org.exolab.jms.net.connector.ManagedConnectionFactory;
import org.exolab.jms.net.connector.ManagedConnectionHandle;
import org.exolab.jms.net.connector.ManagedConnectionListener;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.http.AbstractHTTPConnectionFactory;
import org.exolab.jms.net.http.HTTPManagedConnectionFactory;
import org.exolab.jms.net.rmi.RMIManagedConnectionFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ManagedConnectionHandleEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      boolean boolean0 = managedConnectionHandle0.usedSinceLastPing();
      assertEquals(false, managedConnectionHandle0.pinging());
      assertEquals(true, managedConnectionHandle0.canDestroy());
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      // Undeclared exception!
      try {
        managedConnectionHandle0.setConnectionEventListener((ManagedConnectionListener) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      RMIManagedConnectionFactory rMIManagedConnectionFactory0 = new RMIManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = rMIManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, connectionFactory0);
      boolean boolean0 = managedConnectionHandle0.used();
      assertEquals(true, managedConnectionHandle0.canDestroy());
      assertEquals(false, managedConnectionHandle0.pinging());
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      managedConnectionHandle0.pinged();
      assertEquals(1, managedConnectionHandle0.incPingWaits());
      assertEquals(false, managedConnectionHandle0.pinging());
      assertEquals(true, managedConnectionHandle0.canDestroy());
  }

  @Test
  public void test4()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      assertEquals(false, managedConnectionHandle0.used());
      
      managedConnectionHandle0.setUsed();
      boolean boolean0 = managedConnectionHandle0.canDestroy();
      assertEquals(true, managedConnectionHandle0.used());
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      HTTPManagedConnectionFactory hTTPManagedConnectionFactory0 = new HTTPManagedConnectionFactory();
      AbstractHTTPConnectionFactory abstractHTTPConnectionFactory0 = new AbstractHTTPConnectionFactory("#I<OQ].h:f$u+ ", "#I<OQ].h:f$u+ ", (ManagedConnectionFactory) hTTPManagedConnectionFactory0, (ConnectionManager) null);
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) abstractHTTPConnectionFactory0);
      // Undeclared exception!
      try {
        managedConnectionHandle0.getRemoteURI();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      // Undeclared exception!
      try {
        managedConnectionHandle0.setInvocationHandler((InvocationHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      int int0 = managedConnectionHandle0.incPingWaits();
      assertEquals(3, managedConnectionHandle0.incPingWaits());
      assertEquals(2, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      // Undeclared exception!
      try {
        managedConnectionHandle0.getLocalURI();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      // Undeclared exception!
      try {
        managedConnectionHandle0.getConnection();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      managedConnectionHandle0.clearUsed();
      assertEquals(false, managedConnectionHandle0.pinging());
      assertEquals(true, managedConnectionHandle0.canDestroy());
  }

  @Test
  public void test11()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      assertEquals(false, managedConnectionHandle0.pinging());
      
      // Undeclared exception!
      try {
        managedConnectionHandle0.ping();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      HTTPManagedConnectionFactory hTTPManagedConnectionFactory0 = new HTTPManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = hTTPManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, connectionFactory0);
      // Undeclared exception!
      try {
        managedConnectionHandle0.getPrincipal();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) null);
      boolean boolean0 = managedConnectionHandle0.pinging();
      assertEquals(false, boolean0);
      assertEquals(true, managedConnectionHandle0.canDestroy());
  }

  @Test
  public void test14()  throws Throwable  {
      RMIManagedConnectionFactory rMIManagedConnectionFactory0 = new RMIManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = rMIManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, connectionFactory0);
      // Undeclared exception!
      try {
        managedConnectionHandle0.destroy();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      HTTPManagedConnectionFactory hTTPManagedConnectionFactory0 = new HTTPManagedConnectionFactory();
      AbstractHTTPConnectionFactory abstractHTTPConnectionFactory0 = new AbstractHTTPConnectionFactory("#I<OQ].h:f$u+ ", "#I<OQ].h:f$u+ ", (ManagedConnectionFactory) hTTPManagedConnectionFactory0, (ConnectionManager) null);
      ManagedConnectionHandle managedConnectionHandle0 = new ManagedConnectionHandle((DefaultConnectionPool) null, (ManagedConnection) null, (ConnectionFactory) abstractHTTPConnectionFactory0);
      boolean boolean0 = managedConnectionHandle0.canDestroy();
      assertEquals(true, boolean0);
      assertEquals(false, managedConnectionHandle0.pinging());
  }
}
