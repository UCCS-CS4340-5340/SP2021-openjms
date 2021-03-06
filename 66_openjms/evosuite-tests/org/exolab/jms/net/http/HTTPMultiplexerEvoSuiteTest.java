/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.security.Principal;
import javax.management.remote.JMXPrincipal;
import org.exolab.jms.net.connector.SecurityException;
import org.exolab.jms.net.http.HTTPMultiplexer;
import org.exolab.jms.net.multiplexer.Endpoint;
import org.exolab.jms.net.multiplexer.MultiplexerListener;
import org.exolab.jms.net.uri.URI;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HTTPMultiplexerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      URI uRI0 = new URI();
      JMXPrincipal jMXPrincipal0 = new JMXPrincipal("");
      HTTPMultiplexer hTTPMultiplexer0 = null;
      try {
        hTTPMultiplexer0 = new HTTPMultiplexer((MultiplexerListener) null, (Endpoint) null, uRI0, (Principal) jMXPrincipal0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'listener' is null
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      HTTPMultiplexer hTTPMultiplexer0 = null;
      try {
        hTTPMultiplexer0 = new HTTPMultiplexer((MultiplexerListener) null, (Endpoint) null, (URI) null, (Principal) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'clientURI' is null
         */
      }
  }
}
