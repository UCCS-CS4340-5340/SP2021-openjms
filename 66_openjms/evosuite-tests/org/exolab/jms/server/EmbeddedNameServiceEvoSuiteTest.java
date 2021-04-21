/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.naming.NamingException;
import org.codehaus.spice.jndikit.RemoteContext;
import org.codehaus.spice.jndikit.rmi.server.RMINamingProviderImpl;
import org.exolab.jms.server.EmbeddedNameService;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EmbeddedNameServiceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EmbeddedNameService embeddedNameService0 = new EmbeddedNameService();
      RemoteContext remoteContext0 = (RemoteContext)embeddedNameService0.getInitialContext();
      assertEquals("", remoteContext0.getNameInNamespace());
  }

  @Test
  public void test1()  throws Throwable  {
      EmbeddedNameService embeddedNameService0 = new EmbeddedNameService();
      RMINamingProviderImpl rMINamingProviderImpl0 = (RMINamingProviderImpl)embeddedNameService0.getNamingProvider();
      assertNotNull(rMINamingProviderImpl0);
  }
}
