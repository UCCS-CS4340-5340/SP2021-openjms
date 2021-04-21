/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.socket;

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
import org.exolab.jms.net.socket.SocketManagedConnection;
import org.exolab.jms.net.socket.SocketRequestInfo;
import org.exolab.jms.net.tcp.TCPManagedConnectionFactory;
import org.exolab.jms.net.tcp.TCPSManagedConnectionFactory;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSocketManagedConnectionFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      LinkedList<SocketManagedConnection> linkedList0 = new LinkedList<SocketManagedConnection>();
      JMXPrincipal jMXPrincipal0 = new JMXPrincipal("Trying to get log class from system pr8perty 'org.apache.commns.logging.log'");
      ManagedConnection managedConnection0 = tCPManagedConnectionFactory0.matchManagedConnections((List) linkedList0, (Principal) jMXPrincipal0, (ConnectionRequestInfo) null);
      assertNull(managedConnection0);
  }

  @Test
  public void test1()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      ManagedConnection managedConnection0 = tCPManagedConnectionFactory0.matchManagedConnections((List) linkedList0, (Principal) null, (ConnectionRequestInfo) socketRequestInfo0);
      assertNull(managedConnection0);
  }

  @Test
  public void test2()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      linkedList0.add("'o.:u24/=>5WI");
      // Undeclared exception!
      try {
        tCPManagedConnectionFactory0.matchManagedConnections((List) linkedList0, (Principal) null, (ConnectionRequestInfo) socketRequestInfo0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to org.exolab.jms.net.socket.SocketManagedConnection
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      LinkedList<SocketManagedConnection> linkedList0 = new LinkedList<SocketManagedConnection>();
      ManagedConnectionAcceptor managedConnectionAcceptor0 = tCPManagedConnectionFactory0.matchManagedConnectionAcceptors((List) linkedList0, (ConnectionRequestInfo) null);
      assertNull(managedConnectionAcceptor0);
  }

  @Test
  public void test4()  throws Throwable  {
      TCPSManagedConnectionFactory tCPSManagedConnectionFactory0 = new TCPSManagedConnectionFactory();
      URI uRI0 = new URI();
      Properties properties0 = new Properties("t1");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ManagedConnectionAcceptor managedConnectionAcceptor0 = tCPSManagedConnectionFactory0.matchManagedConnectionAcceptors((List) linkedList0, (ConnectionRequestInfo) socketRequestInfo0);
      assertNull(managedConnectionAcceptor0);
  }

  @Test
  public void test5()  throws Throwable  {
      TCPSManagedConnectionFactory tCPSManagedConnectionFactory0 = new TCPSManagedConnectionFactory();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      URI uRI0 = new URI();
      Properties properties0 = new Properties("t1");
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0, properties0);
      linkedList0.add((Object) null);
      // Undeclared exception!
      try {
        tCPSManagedConnectionFactory0.matchManagedConnectionAcceptors((List) linkedList0, (ConnectionRequestInfo) socketRequestInfo0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
