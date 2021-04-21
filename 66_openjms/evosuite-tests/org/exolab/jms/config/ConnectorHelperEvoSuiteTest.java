/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.config.ConnectorHelper;
import org.exolab.jms.config.ConnectorResource;
import org.exolab.jms.config.ConnectorResources;
import org.exolab.jms.config.types.SchemeType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ConnectorHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ConnectorHelper connectorHelper0 = new ConnectorHelper();
      assertNotNull(connectorHelper0);
  }

  @Test
  public void test1()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.EMBEDDED;
      // Undeclared exception!
      try {
        ConnectorHelper.getConnectorResource(schemeType0, (Configuration) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'config' is null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConnectorHelper.getConnectorResource((SchemeType) null, configuration0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'scheme' is null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.EMBEDDED;
      Configuration configuration0 = new Configuration();
      ConnectorResource connectorResource0 = ConnectorHelper.getConnectorResource(schemeType0, configuration0);
      assertNotNull(connectorResource0);
      assertEquals("OpenJMS embedded server connector", connectorResource0.getDescription());
  }

  @Test
  public void test4()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.EMBEDDED;
      Configuration configuration0 = new Configuration();
      ConnectorResources connectorResources0 = new ConnectorResources();
      configuration0.setConnectorResources(connectorResources0);
      ConnectorResource connectorResource0 = ConnectorHelper.getConnectorResource(schemeType0, configuration0);
      assertNull(connectorResource0);
  }
}
