/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.tcp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.security.Principal;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.tcp.TCPSManagedConnection;
import org.exolab.jms.net.tcp.TCPSRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.SSLProperties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TCPSManagedConnectionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      URI uRI0 = new URI();
      TCPSRequestInfo tCPSRequestInfo0 = new TCPSRequestInfo(uRI0);
      TCPSManagedConnection tCPSManagedConnection0 = null;
      try {
        tCPSManagedConnection0 = new TCPSManagedConnection((Principal) null, tCPSRequestInfo0);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Failed to connect to null:-1
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      URI uRI0 = new URI();
      TCPSRequestInfo tCPSRequestInfo0 = new TCPSRequestInfo(uRI0);
      SSLProperties sSLProperties0 = new SSLProperties();
      tCPSRequestInfo0.setSSLProperties(sSLProperties0);
      TCPSManagedConnection tCPSManagedConnection0 = null;
      try {
        tCPSManagedConnection0 = new TCPSManagedConnection((Principal) null, tCPSRequestInfo0);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Failed to connect to null:-1
         */
      }
  }
}
