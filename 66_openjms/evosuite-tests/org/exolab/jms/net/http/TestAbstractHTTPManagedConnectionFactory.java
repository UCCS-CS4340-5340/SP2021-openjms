/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.security.Principal;
import java.util.LinkedList;
import java.util.List;
import javax.management.remote.JMXPrincipal;
import org.exolab.jms.net.connector.ConnectionRequestInfo;
import org.exolab.jms.net.connector.ManagedConnection;
import org.exolab.jms.net.connector.ManagedConnectionAcceptor;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.http.HTTPRequestInfo;
import org.exolab.jms.net.http.HTTPSManagedConnectionFactory;
import org.exolab.jms.net.socket.SocketManagedConnectionAcceptor;
import org.exolab.jms.net.socket.SocketRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestAbstractHTTPManagedConnectionFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      LinkedList<SocketManagedConnectionAcceptor> linkedList0 = new LinkedList<SocketManagedConnectionAcceptor>();
      URI uRI0 = new URI();
      Properties properties0 = new Properties("ft(v+g,tV,5_*v$F_");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      JMXPrincipal jMXPrincipal0 = new JMXPrincipal("ft(v+g,tV,5_*v$F_");
      ManagedConnection managedConnection0 = hTTPSManagedConnectionFactory0.matchManagedConnections((List) linkedList0, (Principal) jMXPrincipal0, (ConnectionRequestInfo) socketRequestInfo0);
      assertNull(managedConnection0);
  }

  @Test
  public void test1()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      URI uRI0 = new URI();
      LinkedList<SocketRequestInfo> linkedList0 = new LinkedList<SocketRequestInfo>();
      Properties properties0 = new Properties((String) null);
      HTTPRequestInfo hTTPRequestInfo0 = new HTTPRequestInfo(uRI0, properties0);
      ManagedConnection managedConnection0 = hTTPSManagedConnectionFactory0.matchManagedConnections((List) linkedList0, (Principal) null, (ConnectionRequestInfo) hTTPRequestInfo0);
      assertNull(managedConnection0);
  }

  @Test
  public void test2()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      URI uRI0 = new URI();
      Properties properties0 = new Properties((String) null);
      HTTPRequestInfo hTTPRequestInfo0 = new HTTPRequestInfo(uRI0, properties0);
      ManagedConnectionAcceptor managedConnectionAcceptor0 = hTTPSManagedConnectionFactory0.matchManagedConnectionAcceptors((List) linkedList0, (ConnectionRequestInfo) hTTPRequestInfo0);
      assertNull(managedConnectionAcceptor0);
  }

  @Test
  public void test3()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      LinkedList<SocketManagedConnectionAcceptor> linkedList0 = new LinkedList<SocketManagedConnectionAcceptor>();
      URI uRI0 = new URI();
      Properties properties0 = new Properties("ft(v+g,tV,5_*v$F_");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      ManagedConnectionAcceptor managedConnectionAcceptor0 = hTTPSManagedConnectionFactory0.matchManagedConnectionAcceptors((List) linkedList0, (ConnectionRequestInfo) socketRequestInfo0);
      assertNull(managedConnectionAcceptor0);
  }

  @Test
  public void test4()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      URI uRI0 = new URI();
      Properties properties0 = new Properties((String) null);
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      linkedList0.add((String) null);
      // Undeclared exception!
      try {
        hTTPSManagedConnectionFactory0.matchManagedConnectionAcceptors((List) linkedList0, (ConnectionRequestInfo) socketRequestInfo0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
