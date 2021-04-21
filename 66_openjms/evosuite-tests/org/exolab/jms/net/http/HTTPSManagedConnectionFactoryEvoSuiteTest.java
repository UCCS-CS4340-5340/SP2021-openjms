/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.security.Principal;
import org.exolab.jms.authentication.AuthenticationMgr;
import org.exolab.jms.authentication.UserManager;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.net.connector.Authenticator;
import org.exolab.jms.net.connector.ConnectException;
import org.exolab.jms.net.connector.ConnectionFactory;
import org.exolab.jms.net.connector.ConnectionManager;
import org.exolab.jms.net.connector.ConnectionRequestInfo;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.http.HTTPRequestInfo;
import org.exolab.jms.net.http.HTTPSManagedConnectionFactory;
import org.exolab.jms.net.socket.SocketRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.persistence.DatabaseService;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HTTPSManagedConnectionFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      ConnectionFactory connectionFactory0 = hTTPSManagedConnectionFactory0.createConnectionFactory((ConnectionManager) null);
      assertNotNull(connectionFactory0);
  }

  @Test
  public void test1()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      URI uRI0 = new URI();
      HTTPRequestInfo hTTPRequestInfo0 = new HTTPRequestInfo(uRI0);
      try {
        hTTPSManagedConnectionFactory0.createManagedConnection((Principal) null, (ConnectionRequestInfo) hTTPRequestInfo0);
        fail("Expecting exception: ConnectException");
      } catch(ConnectException e) {
        /*
         * Failed to connect to URI=
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      try {
        hTTPSManagedConnectionFactory0.createManagedConnection((Principal) null, (ConnectionRequestInfo) socketRequestInfo0);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Argument 'info' must be of type org.exolab.jms.net.http.HTTPRequestInfo
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      UserManager userManager0 = new UserManager(configuration0, databaseService0);
      AuthenticationMgr authenticationMgr0 = new AuthenticationMgr(userManager0);
      URI uRI0 = new URI();
      SocketRequestInfo socketRequestInfo0 = new SocketRequestInfo(uRI0);
      // Undeclared exception!
      try {
        hTTPSManagedConnectionFactory0.createManagedConnectionAcceptor((Authenticator) authenticationMgr0, (ConnectionRequestInfo) socketRequestInfo0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Port value out of range: -1
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      HTTPSManagedConnectionFactory hTTPSManagedConnectionFactory0 = new HTTPSManagedConnectionFactory();
      try {
        hTTPSManagedConnectionFactory0.createManagedConnectionAcceptor((Authenticator) null, (ConnectionRequestInfo) null);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Argument 'info' must be of type org.exolab.jms.net.socket.SocketRequestInfo
         */
      }
  }
}
