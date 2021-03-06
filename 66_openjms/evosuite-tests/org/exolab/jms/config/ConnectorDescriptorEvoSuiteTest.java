/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.castor.mapping.ClassDescriptor;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.NodeType;
import org.exolab.castor.xml.util.XMLClassDescriptorAdapter;
import org.exolab.jms.config.ConnectorDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ConnectorDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ConnectorDescriptor connectorDescriptor0 = new ConnectorDescriptor();
      assertNotNull(connectorDescriptor0);
      
      ConnectorDescriptor connectorDescriptor1 = (ConnectorDescriptor)connectorDescriptor0.getValidator();
      assertEquals("http://openjms.exolab.org/configuration", connectorDescriptor1.getNameSpaceURI());
      assertEquals("Connector", connectorDescriptor1.getXMLName());
  }

  @Test
  public void test1()  throws Throwable  {
      ConnectorDescriptor connectorDescriptor0 = new ConnectorDescriptor();
      assertNotNull(connectorDescriptor0);
      
      String string0 = connectorDescriptor0.getNameSpaceURI();
      assertEquals("http://openjms.exolab.org/configuration", string0);
      assertEquals("Connector", connectorDescriptor0.getXMLName());
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ConnectorDescriptor connectorDescriptor0 = new ConnectorDescriptor();
      assertNotNull(connectorDescriptor0);
      
      connectorDescriptor0.getNameSpacePrefix();
      assertEquals("Connector", connectorDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", connectorDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test3()  throws Throwable  {
      ConnectorDescriptor connectorDescriptor0 = new ConnectorDescriptor();
      assertNotNull(connectorDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) connectorDescriptor0, "http://openjms.exolab.org/configuration", (NodeType) null);
      assertEquals("http://openjms.exolab.org/configuration", connectorDescriptor0.getNameSpaceURI());
      assertEquals("Connector", connectorDescriptor0.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      ConnectorDescriptor connectorDescriptor0 = new ConnectorDescriptor();
      assertNotNull(connectorDescriptor0);
      
      connectorDescriptor0.getAccessMode();
      assertEquals("Connector", connectorDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", connectorDescriptor0.getNameSpaceURI());
  }
}
