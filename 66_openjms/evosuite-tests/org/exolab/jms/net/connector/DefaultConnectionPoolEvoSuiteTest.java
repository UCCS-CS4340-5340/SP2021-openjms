/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.connector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import org.exolab.jms.net.connector.Authenticator;
import org.exolab.jms.net.connector.CallerListener;
import org.exolab.jms.net.connector.ConnectionFactory;
import org.exolab.jms.net.connector.ConnectionManager;
import org.exolab.jms.net.connector.ConnectionRequestInfo;
import org.exolab.jms.net.connector.ContextInvocationHandler;
import org.exolab.jms.net.connector.DefaultConnectionPool;
import org.exolab.jms.net.connector.InvocationHandler;
import org.exolab.jms.net.connector.ManagedConnection;
import org.exolab.jms.net.connector.ManagedConnectionAcceptor;
import org.exolab.jms.net.connector.ManagedConnectionFactory;
import org.exolab.jms.net.connector.MulticastCallerListener;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.connector.URIRequestInfo;
import org.exolab.jms.net.http.HTTPManagedConnectionFactory;
import org.exolab.jms.net.rmi.RMIManagedConnectionFactory;
import org.exolab.jms.net.tcp.TCPManagedConnectionFactory;
import org.exolab.jms.net.tcp.TCPSManagedConnectionFactory;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.exolab.jms.net.vm.VMManagedConnectionFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultConnectionPoolEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TCPSManagedConnectionFactory tCPSManagedConnectionFactory0 = new TCPSManagedConnectionFactory();
      VMManagedConnectionFactory vMManagedConnectionFactory0 = new VMManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = vMManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("org.exolab.jms.config.Subscriber");
      Map<Object, Object> map0 = properties0.getProperties();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) tCPSManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      // Undeclared exception!
      try {
        defaultConnectionPool0.accepted((ManagedConnectionAcceptor) null, (ManagedConnection) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TCPSManagedConnectionFactory tCPSManagedConnectionFactory0 = new TCPSManagedConnectionFactory();
      VMManagedConnectionFactory vMManagedConnectionFactory0 = new VMManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = vMManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("org.exolab.jms.config.Subscriber");
      Map<Object, Object> map0 = properties0.getProperties();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) tCPSManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      ManagedConnectionAcceptor managedConnectionAcceptor0 = defaultConnectionPool0.matchManagedConnectionAcceptors((ConnectionRequestInfo) null);
      assertNull(managedConnectionAcceptor0);
  }

  @Test
  public void test2()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = tCPManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("WwwOeKU8_PVx@%;S");
      Map<Object, Object> map0 = properties0.getProperties();
      RMIManagedConnectionFactory rMIManagedConnectionFactory0 = new RMIManagedConnectionFactory();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) rMIManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      try {
        defaultConnectionPool0.createManagedConnectionAcceptor((Authenticator) null, (ConnectionRequestInfo) uRIRequestInfo0);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Argument 'info' must be of type org.exolab.jms.net.rmi.RMIRequestInfo
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TCPSManagedConnectionFactory tCPSManagedConnectionFactory0 = new TCPSManagedConnectionFactory();
      VMManagedConnectionFactory vMManagedConnectionFactory0 = new VMManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = vMManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("org.exolab.jms.config.Subscriber");
      Map<Object, Object> map0 = properties0.getProperties();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) tCPSManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      MulticastCallerListener multicastCallerListener0 = new MulticastCallerListener();
      defaultConnectionPool0.setCallerListener((CallerListener) multicastCallerListener0);
  }

  @Test
  public void test4()  throws Throwable  {
      TCPSManagedConnectionFactory tCPSManagedConnectionFactory0 = new TCPSManagedConnectionFactory();
      VMManagedConnectionFactory vMManagedConnectionFactory0 = new VMManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = vMManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("org.exolab.jms.config.Subscriber");
      Map<Object, Object> map0 = properties0.getProperties();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) tCPSManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      DefaultConnectionPool defaultConnectionPool1 = (DefaultConnectionPool)defaultConnectionPool0.getManagedConnectionAcceptorListener();
      assertSame(defaultConnectionPool1, defaultConnectionPool0);
  }

  @Test
  public void test5()  throws Throwable  {
      TCPSManagedConnectionFactory tCPSManagedConnectionFactory0 = new TCPSManagedConnectionFactory();
      VMManagedConnectionFactory vMManagedConnectionFactory0 = new VMManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = vMManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("org.exolab.jms.config.Subscriber");
      Map<Object, Object> map0 = properties0.getProperties();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) tCPSManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      URI uRI0 = new URI("org.exolab.jms.config.Subscriber", "org.exolab.jms.config.Subscriber");
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      try {
        defaultConnectionPool0.createManagedConnection((Principal) null, (ConnectionRequestInfo) uRIRequestInfo0);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Argument 'info' must be of type org.exolab.jms.net.tcp.TCPSRequestInfo
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      DefaultConnectionPool defaultConnectionPool0 = null;
      try {
        defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) null, (InvocationHandler) null, (ConnectionFactory) null, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'factory' is null
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      HTTPManagedConnectionFactory hTTPManagedConnectionFactory0 = new HTTPManagedConnectionFactory();
      HashMap<Map.Entry<String, Integer>, ManagedConnection> hashMap0 = new HashMap<Map.Entry<String, Integer>, ManagedConnection>();
      DefaultConnectionPool defaultConnectionPool0 = null;
      try {
        defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) hTTPManagedConnectionFactory0, (InvocationHandler) null, (ConnectionFactory) null, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'handler' is null
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      HTTPManagedConnectionFactory hTTPManagedConnectionFactory0 = new HTTPManagedConnectionFactory();
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, (ConnectionFactory) null, (ManagedConnection) null);
      DefaultConnectionPool defaultConnectionPool0 = null;
      try {
        defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) hTTPManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, (ConnectionFactory) null, (Map) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'resolver' is null
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      TCPSManagedConnectionFactory tCPSManagedConnectionFactory0 = new TCPSManagedConnectionFactory();
      VMManagedConnectionFactory vMManagedConnectionFactory0 = new VMManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = vMManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("org.exolab.jms.config.Subscriber");
      Map<Object, Object> map0 = properties0.getProperties();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) tCPSManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      URI uRI0 = new URI("org.exolab.jms.config.Subscriber", "org.exolab.jms.config.Subscriber");
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      ManagedConnection managedConnection0 = defaultConnectionPool0.matchManagedConnections((Principal) null, (ConnectionRequestInfo) uRIRequestInfo0);
      assertNull(managedConnection0);
  }

  @Test
  public void test10()  throws Throwable  {
      RMIManagedConnectionFactory rMIManagedConnectionFactory0 = new RMIManagedConnectionFactory();
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = tCPManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) rMIManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) null);
      defaultConnectionPool0.closed((ManagedConnection) null);
  }

  @Test
  public void test11()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = tCPManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("WwwOeKU8_PVx@%;S");
      Map<Object, Object> map0 = properties0.getProperties();
      RMIManagedConnectionFactory rMIManagedConnectionFactory0 = new RMIManagedConnectionFactory();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) rMIManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      defaultConnectionPool0.error((ManagedConnection) null, (Throwable) null);
  }

  @Test
  public void test12()  throws Throwable  {
      RMIManagedConnectionFactory rMIManagedConnectionFactory0 = new RMIManagedConnectionFactory();
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = tCPManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) rMIManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) null);
      defaultConnectionPool0.pinged((ManagedConnection) null);
  }

  @Test
  public void test13()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = tCPManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("WwwOeKU8_PVx@%;S");
      Map<Object, Object> map0 = properties0.getProperties();
      RMIManagedConnectionFactory rMIManagedConnectionFactory0 = new RMIManagedConnectionFactory();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) rMIManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      defaultConnectionPool0.close();
  }

  @Test
  public void test14()  throws Throwable  {
      TCPSManagedConnectionFactory tCPSManagedConnectionFactory0 = new TCPSManagedConnectionFactory();
      VMManagedConnectionFactory vMManagedConnectionFactory0 = new VMManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = vMManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      ContextInvocationHandler contextInvocationHandler0 = new ContextInvocationHandler((InvocationHandler) null, connectionFactory0, (ManagedConnection) null);
      Properties properties0 = new Properties("org.exolab.jms.config.Subscriber");
      Map<Object, Object> map0 = properties0.getProperties();
      DefaultConnectionPool defaultConnectionPool0 = new DefaultConnectionPool((ManagedConnectionFactory) tCPSManagedConnectionFactory0, (InvocationHandler) contextInvocationHandler0, connectionFactory0, (Map) map0);
      // Undeclared exception!
      try {
        defaultConnectionPool0.add((ManagedConnection) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
