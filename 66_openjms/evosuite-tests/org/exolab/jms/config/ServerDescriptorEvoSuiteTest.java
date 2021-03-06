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
import org.exolab.jms.config.ServerDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ServerDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ServerDescriptor serverDescriptor0 = new ServerDescriptor();
      assertNotNull(serverDescriptor0);
      
      serverDescriptor0.getNameSpacePrefix();
      assertEquals("http://openjms.exolab.org/connector", serverDescriptor0.getNameSpaceURI());
      assertEquals("server", serverDescriptor0.getXMLName());
  }

  @Test
  public void test1()  throws Throwable  {
      ServerDescriptor serverDescriptor0 = new ServerDescriptor();
      assertNotNull(serverDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) serverDescriptor0, "http://openjms.exolab.org/connector", (NodeType) null);
      assertEquals("http://openjms.exolab.org/connector", serverDescriptor0.getNameSpaceURI());
      assertEquals("server", serverDescriptor0.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      ServerDescriptor serverDescriptor0 = new ServerDescriptor();
      assertNotNull(serverDescriptor0);
      
      String string0 = serverDescriptor0.getNameSpaceURI();
      assertNotNull(string0);
      assertEquals("server", serverDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/connector", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      ServerDescriptor serverDescriptor0 = new ServerDescriptor();
      assertNotNull(serverDescriptor0);
      
      serverDescriptor0.getAccessMode();
      assertEquals("http://openjms.exolab.org/connector", serverDescriptor0.getNameSpaceURI());
      assertEquals("server", serverDescriptor0.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      ServerDescriptor serverDescriptor0 = new ServerDescriptor();
      assertNotNull(serverDescriptor0);
      
      ServerDescriptor serverDescriptor1 = (ServerDescriptor)serverDescriptor0.getValidator();
      assertEquals("http://openjms.exolab.org/connector", serverDescriptor1.getNameSpaceURI());
      assertEquals("server", serverDescriptor1.getXMLName());
  }
}
