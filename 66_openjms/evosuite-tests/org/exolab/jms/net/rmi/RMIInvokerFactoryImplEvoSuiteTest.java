/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.rmi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.net.connector.Authenticator;
import org.exolab.jms.net.connector.ManagedConnectionAcceptorListener;
import org.exolab.jms.net.rmi.RMIInvokerFactoryImpl;
import org.exolab.jms.net.rmi.RMIManagedConnectionAcceptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RMIInvokerFactoryImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RMIInvokerFactoryImpl rMIInvokerFactoryImpl0 = new RMIInvokerFactoryImpl((Authenticator) null, (RMIManagedConnectionAcceptor) null, (ManagedConnectionAcceptorListener) null);
      assertEquals("RMIInvokerFactoryImpl", rMIInvokerFactoryImpl0.toString());
  }
}
