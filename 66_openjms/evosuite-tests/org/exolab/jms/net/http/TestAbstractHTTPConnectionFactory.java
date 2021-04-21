/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import org.exolab.jms.net.connector.ConnectionManager;
import org.exolab.jms.net.connector.ManagedConnectionFactory;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.http.AbstractHTTPConnectionFactory;
import org.exolab.jms.net.rmi.RMIManagedConnectionFactory;
import org.exolab.jms.net.socket.SocketRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.exolab.jms.net.vm.VMManagedConnectionFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestAbstractHTTPConnectionFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RMIManagedConnectionFactory rMIManagedConnectionFactory0 = new RMIManagedConnectionFactory();
      AbstractHTTPConnectionFactory abstractHTTPConnectionFactory0 = new AbstractHTTPConnectionFactory((String) null, (String) null, (ManagedConnectionFactory) rMIManagedConnectionFactory0, (ConnectionManager) null);
      URI uRI0 = new URI();
      // Undeclared exception!
      try {
        abstractHTTPConnectionFactory0.getConnection((Principal) null, uRI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      VMManagedConnectionFactory vMManagedConnectionFactory0 = new VMManagedConnectionFactory();
      AbstractHTTPConnectionFactory abstractHTTPConnectionFactory0 = new AbstractHTTPConnectionFactory("[>,", "[>,", (ManagedConnectionFactory) vMManagedConnectionFactory0, (ConnectionManager) null);
      Properties properties0 = new Properties("[>,");
      Map<Object, Object> map0 = properties0.getProperties();
      // Undeclared exception!
      try {
        abstractHTTPConnectionFactory0.getConnectionRequestInfo((URI) null, (Map) map0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      AbstractHTTPConnectionFactory abstractHTTPConnectionFactory0 = new AbstractHTTPConnectionFactory((String) null, (String) null, (ManagedConnectionFactory) null, (ConnectionManager) null);
      URI uRI0 = new URI();
      // Undeclared exception!
      try {
        abstractHTTPConnectionFactory0.accept(uRI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      AbstractHTTPConnectionFactory abstractHTTPConnectionFactory0 = new AbstractHTTPConnectionFactory((String) null, (String) null, (ManagedConnectionFactory) null, (ConnectionManager) null);
      URI uRI0 = new URI();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      SocketRequestInfo socketRequestInfo0 = (SocketRequestInfo)abstractHTTPConnectionFactory0.getAcceptorRequestInfo(uRI0, (Map) hashMap0);
      assertNull(socketRequestInfo0.getAlternativeHost());
  }
}
