/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.config.HttpConfiguration;
import org.exolab.jms.config.HttpsConfiguration;
import org.exolab.jms.config.TcpConfiguration;
import org.exolab.jms.config.TcpsConfiguration;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SocketConfigurationTypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TcpConfiguration tcpConfiguration0 = new TcpConfiguration();
      tcpConfiguration0.deleteJndiPort();
      assertEquals(0, tcpConfiguration0.getJndiPort());
      assertEquals(0, tcpConfiguration0.getAdminPort());
      assertEquals(true, tcpConfiguration0.getBindAll());
      assertEquals(false, tcpConfiguration0.hasJndiPort());
  }

  @Test
  public void test1()  throws Throwable  {
      HttpsConfiguration httpsConfiguration0 = new HttpsConfiguration();
      int int0 = httpsConfiguration0.getPort();
      assertEquals(0, httpsConfiguration0.getAdminPort());
      assertEquals(0, int0);
      assertEquals(0, httpsConfiguration0.getJndiPort());
      assertEquals(true, httpsConfiguration0.getBindAll());
  }

  @Test
  public void test2()  throws Throwable  {
      HttpsConfiguration httpsConfiguration0 = new HttpsConfiguration();
      httpsConfiguration0.setJndiPort(0);
      assertEquals(true, httpsConfiguration0.hasJndiPort());
      assertEquals(0, httpsConfiguration0.getAdminPort());
  }

  @Test
  public void test3()  throws Throwable  {
      TcpConfiguration tcpConfiguration0 = new TcpConfiguration();
      tcpConfiguration0.deleteAdminPort();
      assertEquals(0, tcpConfiguration0.getJndiPort());
      assertEquals(false, tcpConfiguration0.hasAdminPort());
      assertEquals(true, tcpConfiguration0.getBindAll());
      assertEquals(0, tcpConfiguration0.getAdminPort());
  }

  @Test
  public void test4()  throws Throwable  {
      HttpConfiguration httpConfiguration0 = new HttpConfiguration();
      int int0 = httpConfiguration0.getJndiPort();
      assertEquals(0, int0);
      assertEquals(true, httpConfiguration0.getBindAll());
      assertEquals(0, httpConfiguration0.getAdminPort());
  }

  @Test
  public void test5()  throws Throwable  {
      HttpConfiguration httpConfiguration0 = new HttpConfiguration();
      httpConfiguration0.hasAdminPort();
      assertEquals(true, httpConfiguration0.getBindAll());
      assertEquals(0, httpConfiguration0.getAdminPort());
      assertEquals(0, httpConfiguration0.getJndiPort());
  }

  @Test
  public void test6()  throws Throwable  {
      TcpConfiguration tcpConfiguration0 = new TcpConfiguration();
      tcpConfiguration0.hasBindAll();
      assertEquals(0, tcpConfiguration0.getJndiPort());
      assertEquals(0, tcpConfiguration0.getAdminPort());
      assertEquals(true, tcpConfiguration0.getBindAll());
  }

  @Test
  public void test7()  throws Throwable  {
      TcpConfiguration tcpConfiguration0 = new TcpConfiguration();
      tcpConfiguration0.hasJndiPort();
      assertEquals(0, tcpConfiguration0.getJndiPort());
      assertEquals(true, tcpConfiguration0.getBindAll());
      assertEquals(0, tcpConfiguration0.getAdminPort());
  }

  @Test
  public void test8()  throws Throwable  {
      HttpsConfiguration httpsConfiguration0 = new HttpsConfiguration();
      int int0 = httpsConfiguration0.getAdminPort();
      assertEquals(0, httpsConfiguration0.getJndiPort());
      assertEquals(0, int0);
      assertEquals(true, httpsConfiguration0.getBindAll());
  }

  @Test
  public void test9()  throws Throwable  {
      TcpsConfiguration tcpsConfiguration0 = new TcpsConfiguration();
      tcpsConfiguration0.setAdminPort((-1175));
      assertEquals(true, tcpsConfiguration0.hasAdminPort());
      assertEquals(-1175, tcpsConfiguration0.getAdminPort());
  }

  @Test
  public void test10()  throws Throwable  {
      TcpConfiguration tcpConfiguration0 = new TcpConfiguration();
      tcpConfiguration0.isValid();
      assertEquals(0, tcpConfiguration0.getAdminPort());
      assertEquals(true, tcpConfiguration0.getBindAll());
      assertEquals(0, tcpConfiguration0.getJndiPort());
  }

  @Test
  public void test11()  throws Throwable  {
      HttpsConfiguration httpsConfiguration0 = new HttpsConfiguration();
      httpsConfiguration0.setPort(0);
      assertEquals(true, httpsConfiguration0.hasPort());
      assertEquals(0, httpsConfiguration0.getAdminPort());
  }

  @Test
  public void test12()  throws Throwable  {
      HttpsConfiguration httpsConfiguration0 = new HttpsConfiguration();
      boolean boolean0 = httpsConfiguration0.getBindAll();
      assertEquals(0, httpsConfiguration0.getJndiPort());
      assertEquals(true, boolean0);
      assertEquals(0, httpsConfiguration0.getAdminPort());
  }

  @Test
  public void test13()  throws Throwable  {
      TcpConfiguration tcpConfiguration0 = new TcpConfiguration();
      tcpConfiguration0.setBindAll(false);
      assertEquals(true, tcpConfiguration0.hasBindAll());
  }

  @Test
  public void test14()  throws Throwable  {
      TcpConfiguration tcpConfiguration0 = new TcpConfiguration();
      tcpConfiguration0.deleteBindAll();
      assertEquals(false, tcpConfiguration0.hasBindAll());
      assertEquals(0, tcpConfiguration0.getJndiPort());
      assertEquals(true, tcpConfiguration0.getBindAll());
      assertEquals(0, tcpConfiguration0.getAdminPort());
  }
}
