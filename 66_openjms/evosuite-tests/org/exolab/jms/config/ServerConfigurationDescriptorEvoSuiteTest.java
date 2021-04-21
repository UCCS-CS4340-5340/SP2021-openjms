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
import org.exolab.jms.config.ServerConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ServerConfigurationDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ServerConfigurationDescriptor serverConfigurationDescriptor0 = new ServerConfigurationDescriptor();
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) serverConfigurationDescriptor0, "http://openjms.exolab.org/configuration", (NodeType) null);
      assertEquals("ServerConfiguration", serverConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", serverConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test1()  throws Throwable  {
      ServerConfigurationDescriptor serverConfigurationDescriptor0 = new ServerConfigurationDescriptor();
      assertNotNull(serverConfigurationDescriptor0);
      
      serverConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("ServerConfiguration", serverConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", serverConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test2()  throws Throwable  {
      ServerConfigurationDescriptor serverConfigurationDescriptor0 = new ServerConfigurationDescriptor();
      assertNotNull(serverConfigurationDescriptor0);
      
      String string0 = serverConfigurationDescriptor0.getNameSpaceURI();
      assertNotNull(string0);
      assertEquals("ServerConfiguration", serverConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      ServerConfigurationDescriptor serverConfigurationDescriptor0 = new ServerConfigurationDescriptor();
      assertNotNull(serverConfigurationDescriptor0);
      
      serverConfigurationDescriptor0.getAccessMode();
      assertEquals("ServerConfiguration", serverConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", serverConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test4()  throws Throwable  {
      ServerConfigurationDescriptor serverConfigurationDescriptor0 = new ServerConfigurationDescriptor();
      assertNotNull(serverConfigurationDescriptor0);
      
      ServerConfigurationDescriptor serverConfigurationDescriptor1 = (ServerConfigurationDescriptor)serverConfigurationDescriptor0.getValidator();
      assertEquals("http://openjms.exolab.org/configuration", serverConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("ServerConfiguration", serverConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", serverConfigurationDescriptor1.getNameSpaceURI());
  }
}
