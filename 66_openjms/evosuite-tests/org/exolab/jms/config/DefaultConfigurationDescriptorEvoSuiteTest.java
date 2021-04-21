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
import org.exolab.jms.config.DefaultConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultConfigurationDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultConfigurationDescriptor defaultConfigurationDescriptor0 = new DefaultConfigurationDescriptor();
      String string0 = defaultConfigurationDescriptor0.getNameSpaceURI();
      assertEquals("http://openjms.exolab.org/configuration", string0);
      assertEquals("DefaultConfiguration", defaultConfigurationDescriptor0.getXMLName());
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultConfigurationDescriptor defaultConfigurationDescriptor0 = new DefaultConfigurationDescriptor();
      assertNotNull(defaultConfigurationDescriptor0);
      
      defaultConfigurationDescriptor0.getAccessMode();
      assertEquals("DefaultConfiguration", defaultConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", defaultConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultConfigurationDescriptor defaultConfigurationDescriptor0 = new DefaultConfigurationDescriptor();
      assertNotNull(defaultConfigurationDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) defaultConfigurationDescriptor0, "http://openjms.exolab.org/configuration", (NodeType) null);
      assertEquals("DefaultConfiguration", defaultConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", defaultConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultConfigurationDescriptor defaultConfigurationDescriptor0 = new DefaultConfigurationDescriptor();
      assertNotNull(defaultConfigurationDescriptor0);
      
      defaultConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("DefaultConfiguration", defaultConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", defaultConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultConfigurationDescriptor defaultConfigurationDescriptor0 = new DefaultConfigurationDescriptor();
      assertNotNull(defaultConfigurationDescriptor0);
      
      DefaultConfigurationDescriptor defaultConfigurationDescriptor1 = (DefaultConfigurationDescriptor)defaultConfigurationDescriptor0.getValidator();
      assertEquals("DefaultConfiguration", defaultConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", defaultConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("DefaultConfiguration", defaultConfigurationDescriptor1.getXMLName());
  }
}
