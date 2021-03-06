/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.config.TcpConfiguration;
import org.exolab.jms.config.TcpsConfiguration;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TcpConfigurationTypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TcpConfiguration tcpConfiguration0 = new TcpConfiguration();
      String string0 = tcpConfiguration0.getInternalHost();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      TcpsConfiguration tcpsConfiguration0 = new TcpsConfiguration();
      tcpsConfiguration0.setInternalHost("${openjms.home}/config/openjms.keystore");
      assertEquals(false, tcpsConfiguration0.hasNeedClientAuth());
  }
}
