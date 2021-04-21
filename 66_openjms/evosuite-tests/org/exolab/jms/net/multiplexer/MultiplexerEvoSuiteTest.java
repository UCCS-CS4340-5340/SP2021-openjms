/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.multiplexer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.security.Principal;
import javax.management.remote.JMXPrincipal;
import org.exolab.jms.authentication.AuthenticationMgr;
import org.exolab.jms.authentication.UserManager;
import org.exolab.jms.common.security.BasicPrincipal;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.net.connector.Authenticator;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.connector.SecurityException;
import org.exolab.jms.net.multiplexer.Channel;
import org.exolab.jms.net.multiplexer.Endpoint;
import org.exolab.jms.net.multiplexer.Multiplexer;
import org.exolab.jms.net.multiplexer.MultiplexerListener;
import org.exolab.jms.persistence.DatabaseService;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MultiplexerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      multiplexer0.isClosed();
      assertEquals(false, multiplexer0.isClient());
  }

  @Test
  public void test1()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      multiplexer0.getPrincipal();
      assertEquals(false, multiplexer0.isClient());
  }

  @Test
  public void test2()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try {
        multiplexer0.send((byte) (-70), (int) (byte) (-70), byteArray0, (int) (byte) (-70), (int) (byte) (-70));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      // Undeclared exception!
      try {
        multiplexer0.close((Channel) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Multiplexer multiplexer0 = null;
      try {
        multiplexer0 = new Multiplexer((MultiplexerListener) null, (Endpoint) null, (Principal) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'listener' is null
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      boolean boolean0 = multiplexer0.isClient();
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      UserManager userManager0 = new UserManager(configuration0, databaseService0);
      AuthenticationMgr authenticationMgr0 = new AuthenticationMgr(userManager0);
      Multiplexer multiplexer0 = null;
      try {
        multiplexer0 = new Multiplexer((MultiplexerListener) null, (Endpoint) null, (Authenticator) authenticationMgr0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'listener' is null
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      multiplexer0.release((Channel) null);
      assertEquals(false, multiplexer0.isClient());
  }

  @Test
  public void test8()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      // Undeclared exception!
      try {
        multiplexer0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      // Undeclared exception!
      try {
        multiplexer0.close();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) bufferedInputStream0);
      multiplexer0.handshake(dataOutputStream0, dataInputStream0);
  }

  @Test
  public void test11()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      // Undeclared exception!
      try {
        multiplexer0.authenticate((Principal) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      JMXPrincipal jMXPrincipal0 = new JMXPrincipal("");
      // Undeclared exception!
      try {
        multiplexer0.authenticate((Principal) jMXPrincipal0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Multiplexer multiplexer0 = new Multiplexer();
      BasicPrincipal basicPrincipal0 = new BasicPrincipal("Zj13k~0Cw9kZE^UyBx+", "Zj13k~0Cw9kZE^UyBx+");
      // Undeclared exception!
      try {
        multiplexer0.authenticate((Principal) basicPrincipal0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
