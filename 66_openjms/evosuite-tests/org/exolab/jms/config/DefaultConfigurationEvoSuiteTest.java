/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.Connectors;
import org.exolab.jms.config.DefaultConfiguration;
import org.exolab.jms.config.GarbageCollectionConfiguration;
import org.exolab.jms.config.HttpConfiguration;
import org.exolab.jms.config.HttpsConfiguration;
import org.exolab.jms.config.LoggerConfiguration;
import org.exolab.jms.config.MessageManagerConfiguration;
import org.exolab.jms.config.RmiConfiguration;
import org.exolab.jms.config.SchedulerConfiguration;
import org.exolab.jms.config.SecurityConfiguration;
import org.exolab.jms.config.ServerConfiguration;
import org.exolab.jms.config.TcpConfiguration;
import org.exolab.jms.config.TcpsConfiguration;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;

@RunWith(EvoSuiteRunner.class)
public class DefaultConfigurationEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      defaultConfiguration0.setTcpConfiguration((TcpConfiguration) null);
      assertEquals(false, defaultConfiguration0.isValid());
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      boolean boolean0 = defaultConfiguration0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      // Undeclared exception!
      try {
        defaultConfiguration0.marshal((Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'out' is null.
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      SecurityConfiguration securityConfiguration0 = new SecurityConfiguration();
      defaultConfiguration0.setSecurityConfiguration(securityConfiguration0);
      assertEquals(true, securityConfiguration0.isValid());
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      MessageManagerConfiguration messageManagerConfiguration0 = defaultConfiguration0.getMessageManagerConfiguration();
      assertNull(messageManagerConfiguration0);
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      defaultConfiguration0.setHttpConfiguration((HttpConfiguration) null);
      assertEquals(false, defaultConfiguration0.isValid());
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      GarbageCollectionConfiguration garbageCollectionConfiguration0 = defaultConfiguration0.getGarbageCollectionConfiguration();
      assertNull(garbageCollectionConfiguration0);
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      Connectors connectors0 = defaultConfiguration0.getConnectors();
      assertNull(connectors0);
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      HttpConfiguration httpConfiguration0 = defaultConfiguration0.getHttpConfiguration();
      assertNull(httpConfiguration0);
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      // Undeclared exception!
      try {
        defaultConfiguration0.marshal((ContentHandler) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'handler' is null.
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      TcpsConfiguration tcpsConfiguration0 = defaultConfiguration0.getTcpsConfiguration();
      assertNull(tcpsConfiguration0);
  }

  @Test
  public void test11()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      defaultConfiguration0.setSchedulerConfiguration((SchedulerConfiguration) null);
      assertEquals(false, defaultConfiguration0.isValid());
  }

  @Test
  public void test12()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      LoggerConfiguration loggerConfiguration0 = new LoggerConfiguration();
      defaultConfiguration0.setLoggerConfiguration(loggerConfiguration0);
      assertNull(loggerConfiguration0.getFile());
  }

  @Test
  public void test13()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      defaultConfiguration0.setTcpsConfiguration((TcpsConfiguration) null);
      assertEquals(false, defaultConfiguration0.isValid());
  }

  @Test
  public void test14()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      SchedulerConfiguration schedulerConfiguration0 = defaultConfiguration0.getSchedulerConfiguration();
      assertNull(schedulerConfiguration0);
  }

  @Test
  public void test15()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      defaultConfiguration0.setMessageManagerConfiguration((MessageManagerConfiguration) null);
      assertEquals(false, defaultConfiguration0.isValid());
  }

  @Test
  public void test16()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      defaultConfiguration0.setRmiConfiguration((RmiConfiguration) null);
      assertEquals(false, defaultConfiguration0.isValid());
  }

  @Test
  public void test17()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      defaultConfiguration0.setConnectors((Connectors) null);
      assertEquals(false, defaultConfiguration0.isValid());
  }

  @Test
  public void test18()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      RmiConfiguration rmiConfiguration0 = defaultConfiguration0.getRmiConfiguration();
      assertNull(rmiConfiguration0);
  }

  @Test
  public void test19()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      TcpConfiguration tcpConfiguration0 = defaultConfiguration0.getTcpConfiguration();
      assertNull(tcpConfiguration0);
  }

  @Test
  public void test20()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      GarbageCollectionConfiguration garbageCollectionConfiguration0 = new GarbageCollectionConfiguration();
      defaultConfiguration0.setGarbageCollectionConfiguration(garbageCollectionConfiguration0);
      assertEquals(30, garbageCollectionConfiguration0.getMemoryCheckInterval());
  }

  @Test
  public void test21()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      HttpsConfiguration httpsConfiguration0 = new HttpsConfiguration();
      defaultConfiguration0.setHttpsConfiguration(httpsConfiguration0);
      assertEquals(false, httpsConfiguration0.hasJndiPort());
  }

  @Test
  public void test22()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      defaultConfiguration0.setServerConfiguration((ServerConfiguration) null);
      assertEquals(false, defaultConfiguration0.isValid());
  }

  @Test
  public void test23()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      HttpsConfiguration httpsConfiguration0 = defaultConfiguration0.getHttpsConfiguration();
      assertNull(httpsConfiguration0);
  }

  @Test
  public void test24()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      LoggerConfiguration loggerConfiguration0 = defaultConfiguration0.getLoggerConfiguration();
      assertNull(loggerConfiguration0);
  }

  @Test
  public void test25()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration();
      SecurityConfiguration securityConfiguration0 = defaultConfiguration0.getSecurityConfiguration();
      assertNull(securityConfiguration0);
  }

  @Test
  public void test26()  throws Throwable  {
      try {
        DefaultConfiguration.unmarshal((Reader) null);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * 
         */
      }
  }
}