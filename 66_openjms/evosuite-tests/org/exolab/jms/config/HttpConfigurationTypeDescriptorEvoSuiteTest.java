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
import org.exolab.castor.xml.util.XMLClassDescriptorAdapter;
import org.exolab.jms.config.HttpConfigurationTypeDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HttpConfigurationTypeDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HttpConfigurationTypeDescriptor httpConfigurationTypeDescriptor0 = new HttpConfigurationTypeDescriptor();
      HttpConfigurationTypeDescriptor httpConfigurationTypeDescriptor1 = (HttpConfigurationTypeDescriptor)httpConfigurationTypeDescriptor0.getValidator();
      assertEquals("HttpConfigurationType", httpConfigurationTypeDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationTypeDescriptor0.getNameSpaceURI());
      assertEquals("HttpConfigurationType", httpConfigurationTypeDescriptor1.getXMLName());
  }

  @Test
  public void test1()  throws Throwable  {
      HttpConfigurationTypeDescriptor httpConfigurationTypeDescriptor0 = new HttpConfigurationTypeDescriptor();
      assertNotNull(httpConfigurationTypeDescriptor0);
      
      httpConfigurationTypeDescriptor0.getAccessMode();
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationTypeDescriptor0.getNameSpaceURI());
      assertEquals("HttpConfigurationType", httpConfigurationTypeDescriptor0.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      HttpConfigurationTypeDescriptor httpConfigurationTypeDescriptor0 = new HttpConfigurationTypeDescriptor();
      assertNotNull(httpConfigurationTypeDescriptor0);
      
      httpConfigurationTypeDescriptor0.getNameSpacePrefix();
      assertEquals("HttpConfigurationType", httpConfigurationTypeDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationTypeDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test3()  throws Throwable  {
      HttpConfigurationTypeDescriptor httpConfigurationTypeDescriptor0 = new HttpConfigurationTypeDescriptor();
      assertNotNull(httpConfigurationTypeDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) httpConfigurationTypeDescriptor0, "~");
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationTypeDescriptor0.getNameSpaceURI());
      assertEquals("HttpConfigurationType", httpConfigurationTypeDescriptor0.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      HttpConfigurationTypeDescriptor httpConfigurationTypeDescriptor0 = new HttpConfigurationTypeDescriptor();
      assertNotNull(httpConfigurationTypeDescriptor0);
      
      String string0 = httpConfigurationTypeDescriptor0.getNameSpaceURI();
      assertEquals("HttpConfigurationType", httpConfigurationTypeDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", string0);
      assertNotNull(string0);
  }
}