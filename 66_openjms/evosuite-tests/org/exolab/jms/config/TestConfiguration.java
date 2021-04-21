/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import org.exolab.castor.util.NestedIOException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.AdminConfiguration;
import org.exolab.jms.config.AdministeredDestinations;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.config.ConnectorResources;
import org.exolab.jms.config.Connectors;
import org.exolab.jms.config.DatabaseConfiguration;
import org.exolab.jms.config.GarbageCollectionConfiguration;
import org.exolab.jms.config.HttpConfiguration;
import org.exolab.jms.config.HttpsConfiguration;
import org.exolab.jms.config.JndiConfiguration;
import org.exolab.jms.config.LoggerConfiguration;
import org.exolab.jms.config.MessageManagerConfiguration;
import org.exolab.jms.config.RmiConfiguration;
import org.exolab.jms.config.SchedulerConfiguration;
import org.exolab.jms.config.SecurityConfiguration;
import org.exolab.jms.config.ServerConfiguration;
import org.exolab.jms.config.TcpConfiguration;
import org.exolab.jms.config.TcpsConfiguration;
import org.exolab.jms.config.Users;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoSuiteRunner.class)
public class TestConfiguration {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setJndiConfiguration((JndiConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test1()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      boolean boolean0 = configuration0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      GarbageCollectionConfiguration garbageCollectionConfiguration0 = configuration0.getGarbageCollectionConfiguration();
      assertNull(garbageCollectionConfiguration0);
  }

  @Test
  public void test3()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setConnectorResources((ConnectorResources) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test4()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      MessageManagerConfiguration messageManagerConfiguration0 = configuration0.getMessageManagerConfiguration();
      assertNull(messageManagerConfiguration0);
  }

  @Test
  public void test5()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setAdministeredDestinations((AdministeredDestinations) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test6()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setHttpConfiguration((HttpConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test7()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      SchedulerConfiguration schedulerConfiguration0 = configuration0.getSchedulerConfiguration();
      assertNull(schedulerConfiguration0);
  }

  @Test
  public void test8()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setMessageManagerConfiguration((MessageManagerConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test9()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setGarbageCollectionConfiguration((GarbageCollectionConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test10()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      RmiConfiguration rmiConfiguration0 = configuration0.getRmiConfiguration();
      assertNull(rmiConfiguration0);
  }

  @Test
  public void test11()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      HttpsConfiguration httpsConfiguration0 = configuration0.getHttpsConfiguration();
      assertNull(httpsConfiguration0);
  }

  @Test
  public void test12()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setUsers((Users) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test13()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      ConnectorResources connectorResources0 = configuration0.getConnectorResources();
      assertNull(connectorResources0);
  }

  @Test
  public void test14()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setDatabaseConfiguration((DatabaseConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test15()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      LoggerConfiguration loggerConfiguration0 = configuration0.getLoggerConfiguration();
      assertNull(loggerConfiguration0);
  }

  @Test
  public void test16()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setAdminConfiguration((AdminConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test17()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      RmiConfiguration rmiConfiguration0 = new RmiConfiguration();
      configuration0.setRmiConfiguration(rmiConfiguration0);
      assertEquals("localhost", rmiConfiguration0.getRegistryHost());
  }

  @Test
  public void test18()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      SchedulerConfiguration schedulerConfiguration0 = new SchedulerConfiguration();
      configuration0.setSchedulerConfiguration(schedulerConfiguration0);
      assertEquals(false, schedulerConfiguration0.hasMaxThreads());
  }

  @Test
  public void test19()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      TcpsConfiguration tcpsConfiguration0 = configuration0.getTcpsConfiguration();
      assertNull(tcpsConfiguration0);
  }

  @Test
  public void test20()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setLoggerConfiguration((LoggerConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test21()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      TcpConfiguration tcpConfiguration0 = configuration0.getTcpConfiguration();
      assertNull(tcpConfiguration0);
  }

  @Test
  public void test22()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      JndiConfiguration jndiConfiguration0 = configuration0.getJndiConfiguration();
      assertNull(jndiConfiguration0);
  }

  @Test
  public void test23()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      AdministeredDestinations administeredDestinations0 = configuration0.getAdministeredDestinations();
      assertNull(administeredDestinations0);
  }

  @Test
  public void test24()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      ServerConfiguration serverConfiguration0 = configuration0.getServerConfiguration();
      assertNull(serverConfiguration0);
  }

  @Test
  public void test25()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setServerConfiguration((ServerConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test26()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setConnectors((Connectors) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test27()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      Connectors connectors0 = configuration0.getConnectors();
      assertNull(connectors0);
  }

  @Test
  public void test28()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      try {
        configuration0.marshal((ContentHandler) xMLReaderAdapter0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      SecurityConfiguration securityConfiguration0 = configuration0.getSecurityConfiguration();
      assertNull(securityConfiguration0);
  }

  @Test
  public void test30()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      TcpConfiguration tcpConfiguration0 = new TcpConfiguration();
      configuration0.setTcpConfiguration(tcpConfiguration0);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test31()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      HttpConfiguration httpConfiguration0 = configuration0.getHttpConfiguration();
      assertNull(httpConfiguration0);
  }

  @Test
  public void test32()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      try {
        configuration0.marshal((Writer) charArrayWriter0);
        fail("Expecting exception: ValidationException");
      } catch(ValidationException e) {
        /*
         * DatabaseConfiguration is a required field.
         */
      }
  }

  @Test
  public void test33()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setSecurityConfiguration((SecurityConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test34()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      Users users0 = configuration0.getUsers();
      assertNull(users0);
  }

  @Test
  public void test35()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      configuration0.setHttpsConfiguration((HttpsConfiguration) null);
      assertEquals(false, configuration0.isValid());
  }

  @Test
  public void test36()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      TcpsConfiguration tcpsConfiguration0 = new TcpsConfiguration();
      configuration0.setTcpsConfiguration(tcpsConfiguration0);
      assertEquals(false, tcpsConfiguration0.isValid());
  }

  @Test
  public void test37()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      AdminConfiguration adminConfiguration0 = configuration0.getAdminConfiguration();
      assertNull(adminConfiguration0);
  }

  @Test
  public void test38()  throws Throwable  {
      try {
        Configuration.unmarshal((Reader) null);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * 
         */
      }
  }
}
