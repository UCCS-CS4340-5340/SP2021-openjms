/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.tcp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.net.connector.ConnectionManager;
import org.exolab.jms.net.tcp.TCPConnectionFactory;
import org.exolab.jms.net.tcp.TCPManagedConnectionFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TCPConnectionFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TCPManagedConnectionFactory tCPManagedConnectionFactory0 = new TCPManagedConnectionFactory();
      TCPConnectionFactory tCPConnectionFactory0 = new TCPConnectionFactory(tCPManagedConnectionFactory0, (ConnectionManager) null);
  }
}