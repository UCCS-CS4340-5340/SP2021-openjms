/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.tcp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.security.Principal;
import org.exolab.jms.authentication.AuthenticationMgr;
import org.exolab.jms.authentication.UserManager;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.net.connector.Authenticator;
import org.exolab.jms.net.connector.ConnectionFactory;
import org.exolab.jms.net.connector.ConnectionManager;
import org.exolab.jms.net.connector.ConnectionRequestInfo;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.connector.URIRequestInfo;
import org.exolab.jms.net.socket.SocketRequestInfo;
import org.exolab.jms.net.tcp.TCPManagedConnectionFactory;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.persistence.DatabaseService;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestTCPManagedConnectionFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = tCPManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      assertNotNull(connectionFactory0);
  }

  @Test
  public void test1()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      try {
        tCPManagedConnectionFactory0.createManagedConnection((Principal) null, (ConnectionRequestInfo) socketRequestInfo0);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Failed to connect to null:-1
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      URI uRI0 = new URI();
      URIRequestInfo uRIRequestInfo0 = new URIRequestInfo(uRI0);
      try {
        tCPManagedConnectionFactory0.createManagedConnection((Principal) null, (ConnectionRequestInfo) uRIRequestInfo0);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Argument 'info' must be of type org.exolab.jms.net.socket.SocketRequestInfo
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      // Undeclared exception!
      try {
        tCPManagedConnectionFactory0.createManagedConnectionAcceptor((Authenticator) null, (ConnectionRequestInfo) socketRequestInfo0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'authenticator' is null
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      UserManager userManager0 = new UserManager(configuration0, databaseService0);
      AuthenticationMgr authenticationMgr0 = new AuthenticationMgr(userManager0);
      try {
        tCPManagedConnectionFactory0.createManagedConnectionAcceptor((Authenticator) authenticationMgr0, (ConnectionRequestInfo) null);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Argument 'info' must be of type org.exolab.jms.net.socket.SocketRequestInfo
         */
      }
  }
}
